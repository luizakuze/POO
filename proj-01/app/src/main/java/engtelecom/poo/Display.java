package engtelecom.poo;

import java.util.ArrayList;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Display {
    private ArrayList<Segmento> display; // segmentos A, B, C, D, E, F e G
    private int numero;                  // número que está aparecendo

    // analisa quais segmentos dos display devem acender a depender do número
    private void analisaNumero(Integer numero, ArrayList<Segmento> display) {
            for (Segmento segmento : display) {
                segmento.reset(); // zera todos os segmentos
            }
        
            switch (numero) {
                case 0:
                    display.get(0).trocaEstado();  // Segmesnto A
                    display.get(1).trocaEstado();  // Segmento B
                    display.get(2).trocaEstado();  // Segmento C
                    display.get(3).trocaEstado();  // Segmento D
                    display.get(4).trocaEstado();  // Segmento E
                    display.get(5).trocaEstado();  // Segmento F
                    break;
                case 1:
                    display.get(1).trocaEstado();  // Segmento B
                    display.get(2).trocaEstado();  // Segmento C
                    break;
                case 2:
                    display.get(0).trocaEstado();  // Segmento A
                    display.get(1).trocaEstado();  // Segmento B
                    display.get(3).trocaEstado();  // Segmento D
                    display.get(4).trocaEstado();  // Segmento E
                    display.get(6).trocaEstado();  // Segmento G
                    break;
                case 3:
                    display.get(0).trocaEstado();  // Segmento A
                    display.get(1).trocaEstado();  // Segmento B
                    display.get(2).trocaEstado();  // Segmento C
                    display.get(3).trocaEstado();  // Segmento D
                    display.get(6).trocaEstado();  // Segmento G
                    break;
                case 4:
                    display.get(1).trocaEstado();  // Segmento B
                    display.get(2).trocaEstado();  // Segmento C
                    display.get(5).trocaEstado();  // Segmento F
                    display.get(6).trocaEstado();  // Segmento G
                    break;
                case 5:
                    display.get(0).trocaEstado();  // Segmento A
                    display.get(2).trocaEstado();  // Segmento C
                    display.get(3).trocaEstado();  // Segmento D
                    display.get(5).trocaEstado();  // Segmento F
                    display.get(6).trocaEstado();  // Segmento G
                    break;
                case 6:
                    display.get(0).trocaEstado();  // Segmento A
                    display.get(2).trocaEstado();  // Segmento C
                    display.get(3).trocaEstado();  // Segmento D
                    display.get(4).trocaEstado();  // Segmento E
                    display.get(5).trocaEstado();  // Segmento F
                    display.get(6).trocaEstado();  // Segmento G
                    break;
                case 7:
                    display.get(0).trocaEstado();  // Segmento A
                    display.get(1).trocaEstado();  // Segmento B
                    display.get(2).trocaEstado();  // Segmento C
                    break;
                case 8:
                    for (Segmento segmento : display) {  // Segmento A, B, C, D, E, F, e G
                        segmento.trocaEstado();
                    }
                    break;
                case 9:
                    display.get(0).trocaEstado();  // Segmento A
                    display.get(1).trocaEstado();  // Segmento B
                    display.get(2).trocaEstado();  // Segmento C
                    display.get(4).trocaEstado();  // Segmento E
                    display.get(5).trocaEstado();  // Segmento F
                    display.get(6).trocaEstado();  // Segmento G
                    break;
                }
    }

    private void inicializarSegmentos() {
        display.add(new Segmento('A', 300, 200)); // Segmento A
        display.add(new Segmento('B', 300, 210)); // Segmento B
        display.add(new Segmento('C', 500, 210)); // Segmento C
        display.add(new Segmento('D', 300, 400)); // Segmento D
        display.add(new Segmento('E', 300, 410)); // Segmento E
        display.add(new Segmento('F', 500, 410)); // Segmento F
        display.add(new Segmento('G', 300, 600)); // Segmento G
    }

    public Display() {
        display = new ArrayList<>();
        numero = 1;
        inicializarSegmentos();
    }

    public Display(ArrayList<Segmento> display, ArrayList<Integer> numeros) {
        this.display = display;
    }

    public void trocaEstadoDisplay() {
        int i = 0;
        for (Segmento s : display) {
            analisaNumero(numero, display);
            i++;
        }
    }

    // QUANDO MONTAR O DISPLAY, VAI FALAR P ONDE É CADA SEGMENTO
    // desenha um display, ou seja, 7 segmentos 
    public void desenharDisplay(Draw desenho) {

        // analisa cada um dos segmentos do display
        for (int i = 0; i < display.size(); i++) {

            switch(i) {
                case 0: 
                    // segmento A (vertical)
                    display.get(i).desenharSegmentoVertical(desenho);
                    break;
                case 1:
                    // segmento B (vertical)
                    display.get(i).desenharSegmentoVertical(desenho);
                    break;
                case 4:
                    // segmento E (vertical)
                    display.get(i).desenharSegmentoVertical(desenho);
                    break;
                case 5:
                    // segmento F (vertical)
                    display.get(i).desenharSegmentoVertical(desenho);
                    break;
                default:
                    // todos os outros são horizontais
                    display.get(i).desenharSegmentoHorizontal(desenho);
            }
        }

    }

}
