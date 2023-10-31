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

    // Coloca robô em uma coordenada aleátoria no mapa de uma fase
    public boolean posicionarRoboNoMapa(Mapa mapa){
        Random r = new Random();

        int x = r.nextInt(posicaoX); // de 0 a posicaoX-1
        int y = r.nextInt(posicaoY);
        
        return false;
    }

    public boolean adicionarTesouro(Tesouro t){
        // TODO implementar
        return false;
    }
    
    public Tesouro removerTesouro(){
        // TODO implementar
        return null;
    }

    public int pontuacao(){
        // TODO implementar
        return -1;
    }

    // pode encostar na borda, se apertar p andar mais, vai continuar na borda
    // andou -> true (mesmo que ande um pouco menos que deveria), não andou -> false
    public boolean movimentar(int direcao) {
        // TODO implementar
        return false;
    }



}
