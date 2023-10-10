package engtelecom.poo;

import java.util.ArrayList;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Display {
    private ArrayList<Segmento> display; // segmentos A, B, C, D, E, F e G
    private ArrayList<Integer> numeros;

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

    private void inicializarNumeros() {
        numeros.add(1); // Segmento A
        numeros.add(1); // Segmento A
        numeros.add(1); // Segmento A
        numeros.add(1); // Segmento A
        numeros.add(1); // Segmento A
        numeros.add(1); // Segmento A
        numeros.add(1); // Segmento A
    }

    public Display() {
        display = new ArrayList<>();
        numeros = new ArrayList<>();
        inicializarSegmentos();
        inicializarNumeros();
    }

    public Display(ArrayList<Segmento> display, ArrayList<Integer> numeros) {
        this.display = display;
        this.numeros = numeros;
    }

    public void ligaDisplay() {
        int i = 0;
        for (Segmento s : display) {
            analisaNumero(numeros.get(i), display);
            i++;
        }
    }

    public void desenharDisplay(Draw desenho) {
        int i = 0;
        for (Segmento s : display) {
            if (i == 1 || i == 2 || i == 4 || i == 5) {
                s.desenhaSegmentoVertical(desenho);
            } else {
                s.desenhaSegmentoHorizontal(desenho);
            }
            i++;
        }
    }

}
