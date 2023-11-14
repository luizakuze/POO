package engtelecom.poo;

import java.awt.Color;

import edu.princeton.cs.algs4.Draw;

public class Parede extends ElementoDoJogo{
    
    public static final int LARGURA = 10;
    public static final int ALTURA = 40;

    public Parede(int posicaoX, int posicaoY) {
        super(posicaoX, posicaoY);
    }

    @Override
    public void desenhar(Draw d) {
        d.setPenColor(Color.GREEN);
        d.filledRectangle(this.posicaoX, this.posicaoY, LARGURA, ALTURA);
    }
}
