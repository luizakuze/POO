package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        Draw desenho = new Draw();
        int dimensao = 800;

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


        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        
        ArrayList<Segmento> display = new ArrayList<>();
        Segmento s = new Segmento(100, 200);
        display.addAll(Arrays.asList(s, s, s, s, s, s));


        Display d = new Display(display, numeros);
        d.desenharDisplay(desenho);


        // Segmento s = new Segmento(100, 200);
        // s.trocaEstado();
        // s.desenhaSegmento(desenho);

        // Trocando o buffer para exibir o que foi desenhado
        desenho.show();
    }

}
