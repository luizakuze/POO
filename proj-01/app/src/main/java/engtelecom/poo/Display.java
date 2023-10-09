package engtelecom.poo;

import java.util.ArrayList;

public class Display {
    private ArrayList<Segmento> display; // segmentos A, B, C, D, E, F e G
    private Segmento a;
    private Segmento b;
    private Segmento c;
    private Segmento d;
    private Segmento e;
    private Segmento f;
    private Segmento g;


    public Display(Segmento a, Segmento b, Segmento c, Segmento d, Segmento e, Segmento f, Segmento g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }

    public void setDisplay(ArrayList<Segmento> display) {
        this.display = display;
    }

    public Display(ArrayList<Segmento> display) {
        this.display = new ArrayList<>();
    }


    

}
