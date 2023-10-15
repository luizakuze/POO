package engtelecom.poo;

import java.util.ArrayList;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Display {
    private ArrayList<Segmento> display; // segmentos A, B, C, D, E, F e G
    private int numero; // número que está aparecendo
    private double fator_tamanho;

    public static double FATOR_TAMANHO;
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

    // seleciona a cor do segmento caso esteja ligado ou desligado
    private void selecionaCorEstado(Draw desenho, Segmento segmento, Color cor) {
        if (segmento.getEstado()) {
            desenho.setPenColor(cor); // segmento ligado
        } else {
            desenho.setPenColor(new Color((int) (cor.getRed() * FATOR_COR), (int) (cor.getGreen() * FATOR_COR),
                    (int) (cor.getBlue() * FATOR_COR))); // segmento desligado
        }
    }

    public void tamanhoDisplay(int tamanho) {
        if (tamanho == 1) {
            Display.FATOR_TAMANHO = 30;
        } else if (tamanho == 3) {
            Display.FATOR_TAMANHO = 60;
        } else {
            Display.FATOR_TAMANHO = 90;
        }
    }

    // desenha um display, ou seja, 7 segmentos
    public void desenharDisplay(Draw desenho, double xInicial, double yInicial, Color cor, int tamanho) {
        trocaEstadoDisplay();
        // double fator = 200;
        // double fatorCor = 0.2;

        tamanhoDisplay(tamanho);

        // D
        double[] xHorizontal = { 0.1 * FATOR_TAMANHO + xInicial, 0.2 * FATOR_TAMANHO + xInicial,
                1.0 * FATOR_TAMANHO + xInicial, 1.1 * FATOR_TAMANHO +
                        xInicial,
                1.0 * FATOR_TAMANHO + xInicial, 0.2 * FATOR_TAMANHO + xInicial };
        double[] yHorizontal = { 0.2 * FATOR_TAMANHO + yInicial, 0.3 * FATOR_TAMANHO + yInicial,
                0.3 * FATOR_TAMANHO + yInicial, 0.2 * FATOR_TAMANHO +
                        yInicial,
                0.1 * FATOR_TAMANHO + yInicial, 0.1 * FATOR_TAMANHO + yInicial };
        selecionaCorEstado(desenho, display.get(3), cor);
        desenho.filledPolygon(xHorizontal, yHorizontal);

        // E
        double[] xVertical = { 0.1 * FATOR_TAMANHO + xInicial, 0.2 * FATOR_TAMANHO + xInicial,
                0.2 * FATOR_TAMANHO + xInicial,
                0.1 * FATOR_TAMANHO + xInicial,
                0 * FATOR_TAMANHO + xInicial, 0 * FATOR_TAMANHO + xInicial };
        double[] yVertical = { 0.2 * FATOR_TAMANHO + yInicial, 0.3 * FATOR_TAMANHO + yInicial,
                1.0 * FATOR_TAMANHO + yInicial,
                1.1 * FATOR_TAMANHO + yInicial,
                1.0 * FATOR_TAMANHO + yInicial, 0.3 * FATOR_TAMANHO + yInicial };
        selecionaCorEstado(desenho, display.get(4), cor);
        desenho.filledPolygon(xVertical, yVertical);

        // C
        for (int i = 0; i < xVertical.length; i++) {
            xVertical[i] += FATOR_TAMANHO;
        }
        selecionaCorEstado(desenho, display.get(2), cor);
        desenho.filledPolygon(xVertical, yVertical);

        // B
        for (int i = 0; i < yVertical.length; i++) {
            yVertical[i] += FATOR_TAMANHO;
        }
        selecionaCorEstado(desenho, display.get(1), cor);
        desenho.filledPolygon(xVertical, yVertical);

        // F
        for (int i = 0; i < xVertical.length; i++) {
            xVertical[i] -= FATOR_TAMANHO;
        }
        selecionaCorEstado(desenho, display.get(5), cor);
        desenho.filledPolygon(xVertical, yVertical);

        // G
        for (int i = 0; i < yHorizontal.length; i++) {
            yHorizontal[i] += FATOR_TAMANHO;
        }
        selecionaCorEstado(desenho, display.get(6), cor);
        desenho.filledPolygon(xHorizontal, yHorizontal);

        // A
        for (int i = 0; i < yHorizontal.length; i++) {
            yHorizontal[i] += FATOR_TAMANHO;
        }
        selecionaCorEstado(desenho, display.get(0), cor);
        desenho.filledPolygon(xHorizontal, yHorizontal);
    }

}
