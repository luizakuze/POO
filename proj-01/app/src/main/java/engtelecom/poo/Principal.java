package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    private ArrayList<RelogioDigital> relogios;
    private Draw desenho;

    // constantes para os desenhos
    public static final double FATOR = 200.0;
    public static final double FATOR_COR = 0.2;
    public static final int DIMENSAO = 800;
    public static final Color CLARA = Color.GREEN;
    public static final Color ESCURA = new Color((int) (CLARA.getRed() * FATOR_COR),
                                               (int) (CLARA.getGreen() * FATOR_COR),
                                               (int) (CLARA.getBlue() * FATOR_COR));

    public static final int X_TESTE = 300;
    public static final int Y_TESTE = 300;

    public Principal() {
        this.relogios = new ArrayList<>();
        this.desenho = new Draw();
    }

    // desenha somente um dos relógios
    public void desenhaRelogio(RelogioDigital r) {
        int dimensao = 1000;

        desenho.setXscale(0, dimensao);
        desenho.setYscale(0, dimensao);
        desenho.setDefaultCloseOperation(3);

        desenho.enableDoubleBuffering();
        desenho.clear(Draw.WHITE);

        // Desenhando grade quadriculada
        int grade = (int) FATOR / 10;
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

        RelogioDigital r = new RelogioDigital(X_TESTE, Y_TESTE, 11, 11, 11, "PINK", 1);

        p.desenhaRelogio(r);
        p.relogios.add(r);


      
    }

}
