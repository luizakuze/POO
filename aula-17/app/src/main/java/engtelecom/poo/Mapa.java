package engtelecom.poo;

import java.util.ArrayList;
import java.util.Random;

public class Mapa {

    private int largura;
    private int altura;

    private ArrayList<Tesouro> tesouros;

    public static final int TOTAL_TESOUROS = 2;

    public Mapa(int largura, int altura, int totalDeTesouros) {
        this.largura = largura;
        this.altura = altura;
        this.tesouros = new ArrayList<>();
        this.posicionaTesouros();
    }

    public void posicionaTesouros() {
        Random random = new Random();
        tesouros.clear(); // "limpar a lista"

        int posX = largura/2;
        int posY = altura/2;

        for (int i = 0; i < TOTAL_TESOUROS; i++) {
            
            int valor = random.nextInt(5) + 1; // tesouros de 1 a 5

            Tesouro tesouro = new Tesouro(posX, posY, valor);
            tesouros.add(tesouro);

            posX/=2;
            posY/=2;
        }
        
    }

    public Tesouro coletarTesouro(int x, int y) {
        for (Tesouro tesouro : tesouros) {
            if (tesouro.getPosicaoX() == x && tesouro.getPosicaoY() == y) {
                tesouros.remove(tesouro);
                return tesouro;
            }
        }
        return null;
    }

    public boolean temTesouroAqui(int x, int y) {
        return false;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public ArrayList<Tesouro> getTesouros() {
        return tesouros;
    }
}