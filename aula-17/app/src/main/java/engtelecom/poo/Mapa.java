package engtelecom.poo;

import java.util.ArrayList;
import java.util.Random;

public class Mapa {

    private int largura;
    private int altura;

    private int totalDeTesouros;
    private ArrayList<Tesouro> tesouros;

    public Mapa(int largura, int altura, int totalDeTesouros) {
        this.largura = largura;
        this.altura = altura;
        this.totalDeTesouros = totalDeTesouros;
        this.tesouros = new ArrayList<>();
        this.posicionaTesouros();
    }

    public void posicionaTesouros() {
        Random random = new Random();
        for (int i = 0; i < totalDeTesouros; i++) {

            int posX = random.nextInt(largura);
            int posY = random.nextInt(altura);
            int valor = random.nextInt(11); // tesouros de 0 a 10

            Tesouro tesouro = new Tesouro(posX, posY, valor);
            tesouros.add(tesouro);
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

    public boolean temTesouroAqui(int x, int y){
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