package engtelecom.poo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import edu.princeton.cs.algs4.Draw;

public class Robo extends ElementoDoJogo {

    public static final int LARGURA = 20;
    public static final int ALTURA = 20;

    private int velocidadeX;
    private int velocidadeY;

    private int pontuacao;

    private Mapa mapa;

    private int capacidadeMochila;
    private ArrayList<Tesouro> mochila;

    public static final int MAX_TENTATIVAS = 5;

    public Robo(Mapa mapa, int posicaoX, int posicaoY, int velocidadeX, int velocidadeY, int capacidadeMochila) {
        super(posicaoX, posicaoY);

        this.mapa = mapa;
        this.velocidadeX = velocidadeX;
        this.velocidadeY = velocidadeY;

        this.posicionarRoboNoMapa(this.mapa);

        this.pontuacao = 0;

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
    public void posicionarRoboNoMapa(Mapa mapa) {
        /// TODO implementar verificação de posições
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;

    }

    /**
     * O robô cava na posição que está se tiver espaço na mochila.
     * 
     * @return True se encontrar um tesouro e False caso contrário.
     */
    public boolean cavar() {
        if (!mochilaCheia()) {
            Tesouro t = mapa.coletarTesouro(posicaoX, posicaoY);

            // achou um tesouro!
            if (t != null) {
                this.mochila.add(t);
                return true;
            }
        }
        return false; // não encontrou tesouro
    }

    /**
     * Remove o último tesouro colocado na mochila.
     * 
     * @return O tesouro removido.
     */
    public Tesouro removerTesouro() {
        Tesouro t = null;
        if (!mochila.isEmpty()) {
            t = mochila.remove(mochila.size() - 1);
            this.pontuacao -= t.getValor();
        }
        return t;
    }

    public int pontuacao() {
        return this.pontuacao;
    }

    // isFull
    public boolean mochilaCheia() {
        return this.mochila.size() == this.capacidadeMochila;
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

        // Verifica se a direção é válida
        if (direcao < 0 || direcao > 3) {
            return false; // Direção inválida
        }

        // Calcula a nova posição com base na direção e velocidade
        int novaPosX = posicaoX;
        int novaPosY = posicaoY;

        switch (direcao) {
            case 0: // cima
                novaPosY += velocidadeY;
                break;
            case 1: // direita
                novaPosX += velocidadeX;
                break;
            case 2: // baixo
                novaPosY -= velocidadeY;
                break;
            case 3: // esquerda
                novaPosX -= velocidadeX;
                break;
        }

        // verifica se a nova posição está dentro dos limites do mapa
        if (novaPosX >= 0 && novaPosX <= mapa.getLargura() - LARGURA &&
                novaPosY >= 0 && novaPosY <= mapa.getAltura() - ALTURA) {

            // Atualiza a posição do robô
            posicaoX = novaPosX;
            posicaoY = novaPosY;

            return true; // Movimento bem-sucedido
        }

        int resto = 10;
        if (posicaoX <= 0 || posicaoY <= 0 || novaPosX > mapa.getLargura() - LARGURA
                || novaPosY > mapa.getLargura() - ALTURA) {
            resto = 0;
        }

        // se não estiver, pode pelo menos andar um pouquinho
        else if (resto == 0) {
            switch (direcao) {
                case 0: // cima
                    novaPosY = ALTURA;
                    break;
                case 1: // direita
                    novaPosX = LARGURA;
                    break;
                case 2: // baixo
                    novaPosY = 0;
                    break;
                case 3: // esquerda
                    novaPosX = 0;
                    break;
            }
            return true;
        }

        // Se a nova posição estiver fora dos limites, ajusta para a borda do mapa
        return false; // Movimento sem sucesso
    }

    @Override
    public void desenhar(Draw d) {
        // d.setPenColor(Color.RED);
        // d.filledSquare(posicaoX, posicaoY, LARGURA);
        d.picture(this.posicaoX, this.posicaoY, "robo.png");

    }

    public boolean colisao() {
        return false;
    }

    public int getCapacidadeMochila() {
        return capacidadeMochila;
    }

}
