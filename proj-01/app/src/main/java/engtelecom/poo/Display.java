package engtelecom.poo;

import java.util.ArrayList;

public class Display {
    private ArrayList<Segmento> display; // segmentos A, B, C, D, E, F e G

    public ArrayList<Segmento> getDisplay() {
        return display;
    }

    public void setDisplay(ArrayList<Segmento> display) {
        this.display = display;
    }

    public Display(ArrayList<Segmento> display) {
        this.display = new ArrayList<>();
    }

}
