package engtelecom.poo.elementos;

import java.util.ArrayList;
import java.util.Random;

import engtelecom.poo.Mapa;

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
    public boolean posicionarRoboNoMapa(Mapa mapa) {
        Random r = new Random();

        for (int i = 0; i < MAX_TENTATIVAS; i++) {
            // sorteia as posições, considerando a dimensão do robô
            this.posicaoX = r.nextInt(mapa.getLargura());
            this.posicaoY = r.nextInt(mapa.getAltura());

            // verifica se o robô cabe no mapa sem sair dos limites
            if (this.posicaoX >= 0 && this.posicaoX + LARGURA <= mapa.getLargura() &&
                    this.posicaoY >= 0 && this.posicaoY + ALTURA <= mapa.getAltura()) {
                return true; // o robô cabe no mapa
            }
        }
        return false;
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

    @Override
    public void imprimirInformacoes() {
        System.out.printf("Velocidade: [%d,%d]\n", velocidadeX, velocidadeY);
        System.out.printf("Pontuação: %d\n", pontuacao);
        System.out.printf("Capacidade da Mochila: %d\n", capacidadeMochila);
        super.imprimirInformacoes();
        /// TODO imprimir tesouros

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

        /// TODO considerar tamanho do robô! para não cair do mapa
        int espacoRestante;
        int espacoPercorrido;

        // define a nova posição com base na direção
        switch (direcao) {
            case 0: // cima
                espacoPercorrido = posicaoY + velocidadeY;
                espacoRestante = mapa.getAltura() - espacoPercorrido;
                break;
            case 1: // direita
                espacoPercorrido = posicaoX + velocidadeX;
                espacoRestante = mapa.getLargura() - espacoPercorrido;
                break;
            case 2: // baixo
                espacoPercorrido = posicaoY - velocidadeY;
                espacoRestante = mapa.getAltura() - espacoPercorrido;
                break;
            case 3: // esquerda
                espacoPercorrido = posicaoX - velocidadeX;
                espacoRestante = mapa.getLargura() - espacoPercorrido;
                break;
            default:
                return false; // orientação inválida
        }

        // verifica se conseguiu andar tudo
        if (espacoRestante > 0) {
            this.posicaoX = espacoPercorrido;
            this.posicaoY = espacoPercorrido;
            return true;
        }

        // verifica se há espaço suficiente para continuar a movimentação, se tiver um
        // pouco de espaço mesmo que
        // não a velocidade inteira, anda esse espaço
        if (espacoRestante < 0 && posicaoX != 0 && posicaoY != 0) {

            switch (direcao) {
                case 0: // cima
                    posicaoY = this.mapa.getAltura() - 1;
                    break;
                case 1: // direita
                    posicaoX = this.mapa.getLargura() - 1;
                    break;
                case 2: // baixo
                    posicaoY = 0;
                    break;
                case 3: // esquerda
                    posicaoX = 0;
            }
            return true;

        }
        // se não, está fora dos limites
        return false;
    }

    public int getCapacidadeMochila() {
        return capacidadeMochila;
    }

}
