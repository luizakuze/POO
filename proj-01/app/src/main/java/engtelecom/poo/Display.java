package engtelecom.poo;

import java.util.ArrayList;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Display {
    private ArrayList<Segmento> display; // segmentos A, B, C, D, E, F e G
    private ArrayList<Integer> numeros;

// incluir a coordenada dos segmentos do sdisplays

    private void analisaNumero (Integer n, ArrayList<Segmento> display) {
        if (n == 1) {
            display.get(1).trocaEstado(); // B
            display.get(2).trocaEstado(); // C
        } 
    }

    public Display() {
        display = new ArrayList<>();
        numeros = new ArrayList<>();
    }

    
    public Display(ArrayList<Segmento> display, ArrayList<Integer> numeros) {
        this.display = display;
        this.numeros = numeros;
    }


    public void ligaDisplay(ArrayList<Segmento> display) {
        int i = 0;
        for (Segmento s: display) {
            analisaNumero(this.numeros.get(i), display);
            i++;
        }
    }

    public void desenharDisplay(Draw desenho) {
        for (Segmento s: display) {
            s.desenhaSegmento(desenho);
        }
    }

}
