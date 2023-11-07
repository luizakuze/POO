package engtelecom.poo;

import java.util.ArrayList;
import java.util.Random;

public class Robo {

    public static final int LARGURA = 20;
    public static final int ALTURA = 20;

    private int velocidadeX;
    private int velocidadeY;

    private int pontuacao;

    private Mapa mapa;

    private int posicaoX;
    private int posicaoY;

    private int capacidadeMochila;
    private ArrayList<Tesouro> mochila;

    public Robo(Mapa mapa, int velocidadeX, int velocidadeY, int capacidadeMochila) {
        this.mapa = mapa;
        this.velocidadeX = velocidadeX;
        this.velocidadeY = velocidadeY;
        this.pontuacao = 0;

        this.posicionarRoboNoMapa(this.mapa);

        this.capacidadeMochila = capacidadeMochila;
        this.mochila = new ArrayList<>();
    }

    /**
     * Sorteia uma posição aleatória dentro dos limtes do mapa para o robô.
     * 
     * @param mapa Mapa que o robô está.
     * @return True se o robô for posicionado com sucesso e
     *         False caso contrário.
     */
    public boolean posicionarRoboNoMapa(Mapa mapa) {
        Random r = new Random();

        int x = r.nextInt(mapa.getLargura());
        int y = r.nextInt(mapa.getAltura());

        this.posicaoX = x;
        this.posicaoY = y;

        return true; // ?
    }

    /**
     * Adiciona um tesouro a mochila.
     * 
     * @param t O tesouro que vai ser adicionado.
     * @return True se for o tesouro for adicionado com sucesso ou
     *         False caso contrário.
     */
    public boolean adicionarTesouro(Tesouro t) {
        if (mochila.size() < this.capacidadeMochila) {
            mochila.add(t);
            return true;
        }
        return false;
    }

    /**
     * Remove um tesouro da mochila.
     * 
     * @return O tesouro removido.
     */
    public Tesouro removerTesouro() {
        Tesouro t = null;
        if (!mochila.isEmpty()) {
            t = mochila.remove(mochila.size() - 1);
        }
        return t;
    }

    public int pontuacao() {
        return this.pontuacao;
    }

    /**
     * Movimenta o robô de acordo com a direção informada.
     * 
     * @param direcao A direção para onde o robô deve se mover.
     *                0 para cima, 1 para a direita, 2 para baixo e 3 para a
     *                esquerda.
     * @return True se o robô conseguiu se mover com sucesso dentro dos limites do
     *         mapa e False caso contrário (quando está fora dos limites do mapa).
     */
    public boolean movimentar(int direcao) {
        // novas posições
        int posX = this.posicaoX;
        int posY = this.posicaoY;

        // desloca o robô de acordo com a direção
        if (direcao == 0) {
            posY += this.velocidadeY;
        } else if (direcao == 1) {
            posX += this.velocidadeX;
        } else if (direcao == 2) {
            posY -= this.velocidadeY;
        } else if (direcao == 3) {
            posX -= this.velocidadeX;
        }

        // verifica se a nova posição está nos limites
        if (posX >= 0 && posX <= mapa.getLargura() && posY >= 0 && posY <= mapa.getAltura()) {
            // pode atualizar as coordenadas reais do robô
            this.posicaoX = posX;
            this.posicaoY = posY;
            return true;
        } else {
            // não atualiza as coordenadas, está fora do mapa
            return false;
        }
    }

    public int getCapacidadeMochila() {
        return capacidadeMochila;
    }

}
