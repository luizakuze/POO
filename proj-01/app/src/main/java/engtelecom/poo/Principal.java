package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    private ArrayList<RelogioDigital> relogios;
    private Draw desenho;

    public Principal() {
        this.relogios = new ArrayList<>();
        this.desenho = new Draw();
    }

    public void desenhaRelogio(RelogioDigital r) {
        int dimensao = 1000;

        desenho.setXscale(0, dimensao);
        desenho.setYscale(0, dimensao);
        desenho.setDefaultCloseOperation(3);

        double fator = 200;
        double fatorCor = 0.2;

        Color clara = Draw.GREEN;
        Color escura = new Color((int) (clara.getRed() * fatorCor), (int) (clara.getGreen() * fatorCor),
                (int) (clara.getBlue() * fatorCor));
        desenho.enableDoubleBuffering();
        desenho.clear(Draw.WHITE);

        // Desenhando grade quadriculada
        int grade = (int) fator / 10;
        desenho.setPenColor(Draw.LIGHT_GRAY);
        for (int i = 0; i <= dimensao; i += grade)
            desenho.line(i, 0, i, dimensao);
        for (int j = 0; j <= dimensao; j += grade)
            desenho.line(0, j, dimensao, j);

        r.desenhaRelogio(desenho);

        desenho.show();
    }

    public static void main(String[] args) throws InterruptedException {
        Principal p = new Principal();

        RelogioDigital r = new RelogioDigital(550, 550, 10, 20, 30, "PINK", 1);

        p.desenhaRelogio(r);
        p.relogios.add(r);
    }

}
