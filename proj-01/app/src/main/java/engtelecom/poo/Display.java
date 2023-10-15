package engtelecom.poo;

import java.util.ArrayList;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Display {
    private ArrayList<Segmento> display; // segmentos A, B, C, D, E, F e G
    private int numero; // número que está aparecendo

    public static double FATOR;
    public static final double FATOR_COR = 0.2;

    // analisa quais segmentos dos display devem acender a depender do número
    private void trocaEstadoDisplay() {
        for (Segmento segmento : display) {
            segmento.reset(); // zera todos os segmentos
        }

        switch (numero) {
            case 0:
                display.get(0).trocaEstado(); // Segmento A
                display.get(1).trocaEstado(); // Segmento B
                display.get(2).trocaEstado(); // Segmento C
                display.get(3).trocaEstado(); // Segmento D
                display.get(4).trocaEstado(); // Segmento E
                display.get(5).trocaEstado(); // Segmento F
                break;
            case 1:
                display.get(1).trocaEstado(); // Segmento B
                display.get(2).trocaEstado(); // Segmento C

                break;
            case 2:
                display.get(0).trocaEstado(); // Segmento A
                display.get(1).trocaEstado(); // Segmento B
                display.get(3).trocaEstado(); // Segmento D
                display.get(4).trocaEstado(); // Segmento E
                display.get(6).trocaEstado(); // Segmento G
                break;
            case 3:
                display.get(0).trocaEstado(); // Segmento A
                display.get(1).trocaEstado(); // Segmento B
                display.get(2).trocaEstado(); // Segmento C
                display.get(3).trocaEstado(); // Segmento D
                display.get(6).trocaEstado(); // Segmento G
                break;
            case 4:
                display.get(1).trocaEstado(); // Segmento B
                display.get(2).trocaEstado(); // Segmento C
                display.get(5).trocaEstado(); // Segmento F
                display.get(6).trocaEstado(); // Segmento G
                break;
            case 5:
                display.get(0).trocaEstado(); // Segmento A
                display.get(2).trocaEstado(); // Segmento C
                display.get(3).trocaEstado(); // Segmento D
                display.get(5).trocaEstado(); // Segmento F
                display.get(6).trocaEstado(); // Segmento G
                break;
            case 6:
                display.get(0).trocaEstado(); // Segmento A
                display.get(2).trocaEstado(); // Segmento C
                display.get(3).trocaEstado(); // Segmento D
                display.get(4).trocaEstado(); // Segmento E
                display.get(5).trocaEstado(); // Segmento F
                display.get(6).trocaEstado(); // Segmento G
                break;
            case 7:
                display.get(0).trocaEstado(); // Segmento A
                display.get(1).trocaEstado(); // Segmento B
                display.get(2).trocaEstado(); // Segmento C
                break;
            case 8:
                for (Segmento segmento : display) { // Segmento A, B, C, D, E, F, e G
                    segmento.trocaEstado();
                }
                break;
            case 9:
                display.get(0).trocaEstado(); // Segmento A
                display.get(1).trocaEstado(); // Segmento B
                display.get(2).trocaEstado(); // Segmento C
                display.get(5).trocaEstado(); // Segmento F
                display.get(6).trocaEstado(); // Segmento G
                break;
        }
    }

    public Display(int numero) {
        this.numero = numero;

        // inicializando os 7 segmentos
        display = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            display.add(new Segmento());
        }
    }

    private Color selecionaCor(String cor) {
        if (cor.equals("rosa")) {
            return Color.PINK;
        } else if (cor.equals("azul")) {
            return Color.BLUE;
        } else if (cor.equals("verde")) {
            return Color.GREEN;
        } else {
            return Color.BLACK;
        }
    }

    // seleciona a cor do segmento caso esteja ligado ou desligado
    private void selecionaCorEstado(Draw desenho, Segmento segmento, Color cor) {
        if (segmento.getEstado()) {
            desenho.setPenColor(cor); // segmento ligado
        } else {
            desenho.setPenColor(new Color((int) (cor.getRed() * FATOR_COR), (int) (cor.getGreen() * FATOR_COR),
                    (int) (cor.getBlue() * FATOR_COR))); // segmento desligado
        }
    }

    // desenha um display, ou seja, 7 segmentos
    public void desenharDisplay(Draw desenho, double xInicial, double yInicial, String cor) {
        trocaEstadoDisplay();
        // double fator = 200;
        // double fatorCor = 0.2;

        Color c = selecionaCor(cor);

        // D
        double[] xHorizontal = { 0.1 * Principal.FATOR + xInicial, 0.2 * Principal.FATOR + xInicial,
                1.0 * Principal.FATOR + xInicial, 1.1 * Principal.FATOR +
                        xInicial,
                1.0 * Principal.FATOR + xInicial, 0.2 * Principal.FATOR + xInicial };
        double[] yHorizontal = { 0.2 * Principal.FATOR + yInicial, 0.3 * Principal.FATOR + yInicial,
                0.3 * Principal.FATOR + yInicial, 0.2 * Principal.FATOR +
                        yInicial,
                0.1 * Principal.FATOR + yInicial, 0.1 * Principal.FATOR + yInicial };
        selecionaCorEstado(desenho, display.get(3), c);
        desenho.filledPolygon(xHorizontal, yHorizontal);

        // E
        double[] xVertical = { 0.1 * Principal.FATOR + xInicial, 0.2 * Principal.FATOR + xInicial,
                0.2 * Principal.FATOR + xInicial,
                0.1 * Principal.FATOR + xInicial,
                0 * Principal.FATOR + xInicial, 0 * Principal.FATOR + xInicial };
        double[] yVertical = { 0.2 * Principal.FATOR + yInicial, 0.3 * Principal.FATOR + yInicial,
                1.0 * Principal.FATOR + yInicial,
                1.1 * Principal.FATOR + yInicial,
                1.0 * Principal.FATOR + yInicial, 0.3 * Principal.FATOR + yInicial };
        selecionaCorEstado(desenho, display.get(4), c);
        desenho.filledPolygon(xVertical, yVertical);

        // C
        for (int i = 0; i < xVertical.length; i++) {
            xVertical[i] += Principal.FATOR;
        }
        selecionaCorEstado(desenho, display.get(2), c);
        desenho.filledPolygon(xVertical, yVertical);

        // B
        for (int i = 0; i < yVertical.length; i++) {
            yVertical[i] += Principal.FATOR;
        }
        selecionaCorEstado(desenho, display.get(1), c);
        desenho.filledPolygon(xVertical, yVertical);

        // F
        for (int i = 0; i < xVertical.length; i++) {
            xVertical[i] -= Principal.FATOR;
        }
        selecionaCorEstado(desenho, display.get(5), c);
        desenho.filledPolygon(xVertical, yVertical);

        // G
        for (int i = 0; i < yHorizontal.length; i++) {
            yHorizontal[i] += Principal.FATOR;
        }
        selecionaCorEstado(desenho, display.get(6), c);
        desenho.filledPolygon(xHorizontal, yHorizontal);

        // A
        for (int i = 0; i < yHorizontal.length; i++) {
            yHorizontal[i] += Principal.FATOR;
        }
        selecionaCorEstado(desenho, display.get(0), c);
        desenho.filledPolygon(xHorizontal, yHorizontal);
    }

}
