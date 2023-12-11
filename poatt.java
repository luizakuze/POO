package engtelecom.poo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.util.Timer;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class AreaJogo extends Area implements KeyListener {

    private int nivel;
    private Mapa mapa;
    private ArrayList<Elemento> elementos; // bolinha e plataforma
    private boolean pausado;
    private boolean somLigado;

    private final static int MAX_NIVEL = 4;
    private final static int MIN_NIVEL = 1;

    public AreaJogo(int coordenadaX, int coordenadaY, int largura, int altura, Color cor) {
        super(coordenadaX, coordenadaY, largura, altura, cor);
        this.nivel = MIN_NIVEL;
        elementos = new ArrayList<>();
        inicializarObjetos();
        inicializarMapa();
    }

    private void inicializarObjetos() {
        elementos.add(new Bolinha());
        elementos.add(new Plataforma());
        this.pausado = false;
        this.somLigado = true;
    }

    public void inicializarMapa() {
        this.mapa = new Mapa(this.nivel, this.largura, this.altura);
    }

    @Override
    public void desenharArea(Graphics2D g2d) {
        g2d.setColor(this.cor);
        g2d.fillRect(this.coordenadaX, this.coordenadaY, this.largura, this.altura);
        mapa.desenharMapa(g2d);
        desenharObjetos(g2d);
    }

    public boolean verificaTerminoJogo() {
        if (AreaPlacar.fatorVida == 0) {
            return true;
        }
        return false;
    }

    private void desenhaMensagemPausa(Graphics2D g2d) {
        g2d.setColor(Color.LIGHT_GRAY);
        var fonte = carregaFonteDoDisco("f1.ttf", 55f);
        g2d.setFont(fonte);
        java.awt.FontMetrics fontMetrics = g2d.getFontMetrics(fonte);
        // desenha a mensagem na posição desejada
        g2d.drawString("game paused", JavanoidOO.AREA_JOGO_X + (JavanoidOO.AREA_JOGO_LARGURA / 8),
                JavanoidOO.AREA_JOGO_ALTURA / 2);
    }

    private void desenharObjetos(Graphics2D g2d) {
        for (var elemento : elementos) {
            elemento.desenhar(g2d);
        }

        if (!this.pausado) {
            Bolinha bolinha = (Bolinha) elementos.get(0);
            Plataforma plataforma = (Plataforma) elementos.get(1);

            movimentarBolinhaEmJogo(bolinha);

            verificarColisoes(bolinha, plataforma);

            if (verificaTerminoJogo()) {
                this.pausado = !this.pausado;
            }
        } else {
            desenhaMensagemPausa(g2d);
        }
    }

    public void verificarColisoes(Bolinha bolinha, Plataforma plataforma) {
        colisaoBolinhaTijolos(bolinha, plataforma);
        novaColisaoBolinhaPlataforma(bolinha, plataforma);
        verificarColisaoPlataformaPoderes(plataforma);
    }

    public void movimentarBolinhaEmJogo(Bolinha bolinha) {
        bolinha.movimentar();

        // ricochetear bola nas bordas da janela
        if (bolinha.getCoordenadaX() < 0
                || bolinha.getCoordenadaX() + bolinha.getLargura() > JavanoidOO.AREA_JOGO_LARGURA) {
            bolinha.setVelocidadeX(bolinha.getVelocidadeX() * -1);
            // this.reproduzirAudio("sons/bola.wav");
        }

        if (bolinha.getCoordenadaY() < 0
                || bolinha.getCoordenadaY() + bolinha.getAltura() > JavanoidOO.AREA_JOGO_ALTURA) {
            bolinha.setVelocidadeY(bolinha.getVelocidadeY() * -1);

            // this.reproduzirAudio("sons/bola.wav");
        }

        if (passouBordaJogo(bolinha)) {
            AreaPlacar.removerVida();
        }
    }

    private boolean passouBordaJogo(Bolinha b) {
        return b.getCoordenadaY() + b.getAltura() > this.altura;
    }

    public void movimentarPlataformaEmJogo(Plataforma plataforma) {
        plataforma.movimentar();
        if (plataforma.getCoordenadaX() < JavanoidOO.AREA_JOGO_X) {
            plataforma.setCoordenadaX(0);
        }
        if (plataforma.coordenadaX + plataforma.largura > JavanoidOO.AREA_JOGO_LARGURA) {
            plataforma.setCoordenadaX(JavanoidOO.AREA_JOGO_LARGURA - plataforma.getLargura());
        }
    }

    public void colisaoBolinhaTijolos(Bolinha bolinha, Plataforma plataforma) {
        // verifica se tem apenas tijolos indestrutíveis, ou seja, pode passar de nível
        boolean todosTijolosDestruidos = true;

        // percorre o mapa e analisa se houve uma colisao
        for (int i = 0; i < mapa.getNumeroLinhas(); i++) {
            for (int j = 0; j < mapa.getNumeroColunas(); j++) {

                // verifica se o tijolo já não foi quebrado
                Tijolo tijolo = mapa.getMapa(i, j);
                if (tijolo.getDurabilidadeAtual() > 0) {

                    // verifica colisão do tijolo com a bolinha
                    if (colisaoBlocoFixo(bolinha, tijolo)) {

                        // se o tijolo quebrou
                        if (tijolo.diminuirDurabilidadeAtual() && tijolo.getDurabilidadeAtual() == 0) {
                            AreaPlacar.adicionarPontuacao(tijolo.getModelo().valor);
                            Poder poder = tijolo.getPoder();
                            if (poder != null) {
                                tijolo.derrubarPoder();
                                colisaoPlataformaPoderes(plataforma, poder);
                            }
                        }

                        // se for um tijolo indestrutível, adiciona pontuação mesmo sem quebrar
                        if (tijolo.modelo.id == 3) {
                            AreaPlacar.adicionarPontuacao(tijolo.getModelo().valor);
                        }
                    }

                    // verifica se existem tijolos que não são indestrutíveis
                    if (tijolo.modelo.id != 3) {
                        todosTijolosDestruidos = false;
                    }
                }
            }
        }

        if (todosTijolosDestruidos) {
            trocarDeNivel();
            inicializarMapa();
        }
    }

    public void trocarDeNivel() {
        if (nivel >= MIN_NIVEL && nivel < MAX_NIVEL) {
            this.nivel++;
        }
        this.nivel = MIN_NIVEL;
    }

    public boolean colisaoBolinhaPlataforma(Bolinha bolinha, Plataforma plataforma) {
        if (colisaoBlocoFixo(bolinha, plataforma)) {


            return true;
        }
        return false;
    }

    // TESTE PARA COLISÃO PLATAFORMA BOLINHA, BOLINHA ---- OBJETO , PLATAFORMA ---- ELEMENTO
    // public boolean novaColisaoBolinhaPlataforma(Elemento bolinha, Elemento plataforma) {
    //     if (plataforma != null) {
    //         Rectangle bola = new Rectangle(bolinha.getCoordenadaX(), bolinha.getCoordenadaY(), bolinha.getLargura(),
    //                 bolinha.getAltura());
    //         Rectangle plat = new Rectangle(plataforma.getCoordenadaX(), plataforma.getCoordenadaY(), plataforma.getLargura(),
    //                 plataforma.getAltura());

    //         int larguraPlataforma = plataforma.getLargura() + plataforma.getCoordenadaX();

    //         // verifica colisão de bolinha e bloco
    //         if (bola.intersects(plat)) {


    //             // bate em cima ou embaixo na primeira metade da plataforma
    //             if ((bolinha.getCoordenadaY() == plataforma.getCoordenadaY()) && ((bolinha.getCoordenadaX() <= larguraPlataforma) && (bolinha.getCoordenadaX() > plataforma.getCoordenadaX()))) {
    //                 bolinha.setVelocidadeY(bolinha.getVelocidadeY() * -1);
    //             }
    //             // bate nas laterais (esquerda ou direita)
    //             if ((bolinha.getCoordenadaY() == plataforma.getCoordenadaY()) && ((bolinha.getCoordenadaX() == plataforma.getCoordenadaX() || bolinha.getCoordenadaX() == larguraPlataforma))) {
    //                 bolinha.setVelocidadeX(bolinha.getVelocidadeX() * -1);

    //             }
    //             return true;
    //         }
            
    //     }
    //     return false;
    // }

    public boolean colisaoBlocoFixo(Elemento objeto, Elemento elemento) {
        if (elemento != null) {
            Rectangle o = new Rectangle(objeto.getCoordenadaX(), objeto.getCoordenadaY(), objeto.getLargura(),
                    objeto.getAltura());
            Rectangle e = new Rectangle(elemento.getCoordenadaX(), elemento.getCoordenadaY(), elemento.getLargura(),
                    elemento.getAltura());

            // verifica colisão de bolinha e bloco
            if (o.intersects(e)) {

                // bate em cima ou embaixo
                if (((o.getY() + this.altura) >= e.getY())
                        && ((o.getY()) <= (e.getY() + elemento.altura))) {
                    objeto.setVelocidadeY(objeto.getVelocidadeY() * -1);
                }

                // bate nas laterais (esquerda ou direita)
                if ((o.getX() < e.getX()) || (o.getX() + elemento.largura > e.getX())) {
                    objeto.setVelocidadeX(objeto.getVelocidadeX() * -1);

                }
                return true;
            }
        }
        return false;
    }

    public void verificarColisaoPlataformaPoderes(Plataforma plataforma) {
        for (int i = 0; i < mapa.getNumeroLinhas(); i++) {
            for (int j = 0; j < mapa.getNumeroColunas(); j++) {
                Tijolo tijolo = this.mapa.getMapa(i, j);

                if (tijolo != null && tijolo.getPoder() != null) {
                    Poder poder = tijolo.getPoder();
                    
                    if (colisaoBlocoFixo(plataforma, poder) && !poder.jaFoiCapturado()) {
                        colisaoPlataformaPoderes(plataforma, poder);
                        poder.desligarEstadoDesenho();
                    }
                }
            }
        }
    }

    public boolean colisaoPlataformaPoderes(Plataforma plataforma, Poder poder) {
        if (colisaoBlocoFixo(plataforma, poder)) {
            poder.capturar();
            TipoPoder tipo = poder.getTipoPoder();

            switch (tipo) {
                case MAX_VELOCIDADE:
                    plataforma.aumentarTamanho();
                    break;

                case MIN_VELOCIDADE:
                    plataforma.diminuirTamanho();
                    break;
                case VIDA_EXTRA:
                    AreaPlacar.adicionarVida();
                    break;
                default:
                    // TODO adicionar cuidado tipo inválido
                    break;
            }
            return true;
        }
        return false;
    }

    public int getLargura() {
        return this.largura;
    }

    public void processaTeclaPressionada(KeyEvent e) {
        Bolinha bolinha = (Bolinha) elementos.get(0);
        Plataforma plataforma = (Plataforma) elementos.get(1);
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                if (!novaColisaoBolinhaPlataforma(bolinha, plataforma)) {
                    plataforma.setVelocidadeX(10);
                    movimentarPlataformaEmJogo(plataforma);
                }
                break;
            case KeyEvent.VK_LEFT:
                if (!novaColisaoBolinhaPlataforma(bolinha, plataforma)) {
                    plataforma.setVelocidadeX(-10);
                    movimentarPlataformaEmJogo(plataforma);
                }
                break;
            case KeyEvent.VK_Q:
                System.exit(0);
                break;
            case KeyEvent.VK_S:
                this.somLigado = !this.somLigado;
                System.out.println("Som ligado: " + this.somLigado);
                break;
            case KeyEvent.VK_SPACE:
                this.pausado = !this.pausado;
                break;
        }
    }

    public void processaTeclaSolta(KeyEvent e) {
        Plataforma plataforma = (Plataforma) elementos.get(1);
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_LEFT:
                plataforma.setVelocidadeX(0);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        processaTeclaPressionada(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        processaTeclaSolta(e);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // não faz nada
    }

}
