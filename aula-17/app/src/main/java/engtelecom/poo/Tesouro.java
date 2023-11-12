package engtelecom.poo;

public class Tesouro extends ElementoDoJogo {

    public static final int LARGURA = 10;
    public static final int ALTURA = 10;

    private int valor;

    public Tesouro(int valor, int posicaoX, int posicaoY) {
        super(posicaoX, posicaoY);
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
