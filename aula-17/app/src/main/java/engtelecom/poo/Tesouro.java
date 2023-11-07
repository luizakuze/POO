package engtelecom.poo;

public class Tesouro {

    public static final int LARGURA = 10;
    public static final int ALTURA = 10;

    private int valor;
    private int posicaoX;
    private int posicaoY;

    public Tesouro(int valor, int posicaoX, int posicaoY) {
        this.valor = valor;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    public int getValor() {
        return valor;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

}
