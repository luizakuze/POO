package engtelecom.poo;

import java.util.ArrayList;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Display {
    private ArrayList<Segmento> display; // segmentos A, B, C, D, E, F e G
    private int numero; // número que está aparecendo

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
                display.get(4).trocaEstado(); // Segmento E
                display.get(5).trocaEstado(); // Segmento F
                display.get(6).trocaEstado(); // Segmento G
                break;
        }
    }

    private void inicializarSegmentos() {
        display.add(new Segmento('A')); // Segmento A
        display.add(new Segmento('B')); // Segmento B
        display.add(new Segmento('C')); // Segmento C
        display.add(new Segmento('D')); // Segmento D
        display.add(new Segmento('E')); // Segmento E
        display.add(new Segmento('F')); // Segmento F
        display.add(new Segmento('G')); // Segmento G
    }

    public Display() {
        display = new ArrayList<>();
        inicializarSegmentos();
    }

    public Display(int numero) {
        display = new ArrayList<>();
        this.numero = numero;
        inicializarSegmentos();
    }

    // seleciona a cor do segmento caso esteja ligado ou desligado
    private void selecionaCor(Draw desenho, Segmento segmento) {
        if (segmento.isEstado()) {
            desenho.setPenColor(Principal.CLARA); // segmento ligado
        } else {
            desenho.setPenColor(Principal.ESCURA); // segmento desligado
        }

    }

    // desenha um display, ou seja, 7 segmentos
    public void desenharDisplay(Draw desenho, double xInicial, double yInicial) {
        trocaEstadoDisplay();

        // D
        double[] xHorizontal = { 0.1 * Principal.FATOR + xInicial, 0.2 * Principal.FATOR + xInicial,
                1.0 * Principal.FATOR + xInicial, 1.1 * Principal.FATOR +
                        xInicial,
                1.0 * Principal.FATOR + xInicial, 0.2 * Principal.FATOR + xInicial };
        double[] yHorizontal = { 0.2 * Principal.FATOR + yInicial, 0.3 * Principal.FATOR + yInicial,
                0.3 * Principal.FATOR + yInicial, 0.2 * Principal.FATOR +
                        yInicial,
                0.1 * Principal.FATOR + yInicial, 0.1 * Principal.FATOR + yInicial };
        selecionaCor(desenho, display.get(3));
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
        selecionaCor(desenho, display.get(4));
        desenho.filledPolygon(xVertical, yVertical);

        // C
        for (int i = 0; i < xVertical.length; i++) {
            xVertical[i] += Principal.FATOR;
        }
        selecionaCor(desenho, display.get(2));
        desenho.filledPolygon(xVertical, yVertical);

        // B
        for (int i = 0; i < yVertical.length; i++) {
            yVertical[i] += Principal.FATOR;
        }
        selecionaCor(desenho, display.get(1));
        desenho.filledPolygon(xVertical, yVertical);

        // F
        for (int i = 0; i < xVertical.length; i++) {
            xVertical[i] -= Principal.FATOR;
        }
        selecionaCor(desenho, display.get(5));
        desenho.filledPolygon(xVertical, yVertical);

        // G
        for (int i = 0; i < yHorizontal.length; i++) {
            yHorizontal[i] += Principal.FATOR;
        }
        selecionaCor(desenho, display.get(6));
        desenho.filledPolygon(xHorizontal, yHorizontal);

        // A
        for (int i = 0; i < yHorizontal.length; i++) {
            yHorizontal[i] += Principal.FATOR;
        }
        selecionaCor(desenho, display.get(0));
        desenho.filledPolygon(xHorizontal, yHorizontal);
    }

}
