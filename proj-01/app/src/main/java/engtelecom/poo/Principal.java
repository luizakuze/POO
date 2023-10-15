package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    private ArrayList<RelogioDigital> relogios;
    private Draw desenho;

    public static double FATOR = 200;
    public static final int DIMENSAO = 1000;

    public Principal() {
        this.relogios = new ArrayList<>();

        this.desenho = new Draw();
        this.desenho.setXscale(0, DIMENSAO);
        this.desenho.setYscale(0, DIMENSAO);
        this.desenho.setDefaultCloseOperation(3);
        this.desenho.enableDoubleBuffering();
        desenho.clear(Draw.BLACK);
    }

    // desenha todos os relógios
    public void desenhaRelogios() {
        for (RelogioDigital relogio : relogios) {
            relogio.desenhaRelogio(desenho);
        }
        desenho.show();
    }

    public static void main(String[] args) throws InterruptedException {
        Principal p = new Principal();

        RelogioDigital r = new RelogioDigital(200, 200, 12, 34, 56, "rosa", 1);
        p.relogios.add(r);

        p.desenhaRelogios();

    }

}
