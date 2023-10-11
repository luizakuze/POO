package engtelecom.poo;

import java.util.ArrayList;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Display {
    private ArrayList<Segmento> display; // segmentos A, B, C, D, E, F e G
    private int numero;

    // incluir a coordenada dos segmentos dos displays

    private void analisaNumero(Integer n, ArrayList<Segmento> display) {
        if (n == 1) {
            display.get(1).trocaEstado(); // B
            display.get(2).trocaEstado(); // C
        }
    }

    private void inicializarSegmentos() {
        display.add(new Segmento(300, 200)); // Segmento A
        display.add(new Segmento(300, 210)); // Segmento B
        display.add(new Segmento(500, 210)); // Segmento C
        display.add(new Segmento(300, 400)); // Segmento D
        display.add(new Segmento(300, 410)); // Segmento E
        display.add(new Segmento(500, 410)); // Segmento F
        display.add(new Segmento(300, 600)); // Segmento G
    }

    public Display() {
        display = new ArrayList<>();
        numero = 1;
        inicializarSegmentos();
    }

    public Display(ArrayList<Segmento> display, ArrayList<Integer> numeros) {
        this.display = display;
    }

    public void ligaDisplay() {
        int i = 0;
        for (Segmento s : display) {
            analisaNumero(numero, display);
            i++;
        }
    }

    // public void desenharDisplay(Draw desenho) {
    // int i = 0;
    // for (Segmento s : display) {
    // if (i == 1 || i == 2 || i == 4 || i == 5) {
    // s.desenhaSegmentoVertical(desenho);
    // } else {
    // s.desenhaSegmentoHorizontal(desenho);
    // }
    // i++;
    // }
    // }
    public void desenharDisplay(Draw desenho) {
        double fator = 200;
        double fatorCor = 0.2;
        int dimensao = 800;
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
        double xInicial = 300;
        double yInicial = 400;
        // Montando vetores com os pontos em X e em Y para desenhar um segmento
        // horizontal
        yInicial = 180;
        double[] xHorizontal = { 0.1 * fator + xInicial, 0.2 * fator + xInicial, 1.0 * fator + xInicial, 1.1 * fator +
                xInicial, 1.0 * fator + xInicial, 0.2 * fator + xInicial };
        double[] yHorizontal = { 0.2 * fator + yInicial, 0.3 * fator + yInicial, 0.3 * fator + yInicial, 0.2 * fator +
                yInicial, 0.1 * fator + yInicial, 0.1 * fator + yInicial };
        // Desenhando o segmento horizontal
        desenho.setPenColor(clara);
        desenho.filledPolygon(xHorizontal, yHorizontal);
        // Montando vetores com os pontos em X e em Y para desenhar um segmento vertical
        yInicial = 200;
        double[] xVertical = { 0.1 * fator + xInicial, 0.2 * fator + xInicial, 0.2 * fator + xInicial,
                0.1 * fator + xInicial,
                0 * fator + xInicial, 0 * fator + xInicial };
        double[] yVertical = { 0.2 * fator + yInicial, 0.3 * fator + yInicial, 1.0 * fator + yInicial,
                1.1 * fator + yInicial,
                1.0 * fator + yInicial, 0.3 * fator + yInicial };
        // Desenhando o segmento vertical
        desenho.setPenColor(escura);
        desenho.filledPolygon(xVertical, yVertical);
        // Desenhando outro segmento vertical, porém com x deslocado em 'fator' pixels
        for (int i = 0; i < xVertical.length; i++) {
            xVertical[i] += fator;
        }
        desenho.filledPolygon(xVertical, yVertical);
        // Trocando o buffer para exibir o que foi desenhado
    }

}
