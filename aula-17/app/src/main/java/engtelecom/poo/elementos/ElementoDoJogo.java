package engtelecom.poo.elementos;

import java.util.ArrayList;
import java.util.Random;

public class ElementoDoJogo {
    protected int posicaoX;
    protected int posicaoY;

    public ElementoDoJogo(int posicaoX, int posicaoY) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void imprimirInformacoes() {
        System.out.printf("Coordenada: [%d,%d]\n", posicaoX, posicaoY);
    }

}