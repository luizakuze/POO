package engtelecom.poo;

import java.util.ArrayList;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class RelogioDigital {
    private int coordenadaX;
    private int coordenadaY;
    private int segundos;
    private int minutos;
    private int horas;
    private String cor;
    private int tamanho; // 1, 2 e 3
    private ArrayList<Display> displays;

    public RelogioDigital(int coordenadaX, int coordenadaY, int segundos, int minutos, int horas, String cor,
            int tamanho) {
        if (setHoras(horas) && setMinutos(minutos) && setSegundos(segundos)) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.cor = cor;
        this.tamanho = tamanho;
        this.displays = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            displays.add(new Display());
        }
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public void setDisplays(ArrayList<Display> displays) {
        this.displays = displays;
    }

    // desenha 6 displays, "relógio"
    public void desenhaRelogio(Draw desenho) {
        double xInicial = 300;
        double yInicial = 400;

        for (Display display : displays) {
            display.desenharDisplay(desenho, xInicial, yInicial);
            xInicial += 220;
            yInicial += 220;
        }
    }

    public boolean setHoras(int horas) {
        if (horas >= 0 && horas < 24) {
            this.horas = horas;
            return true;
        }
        return false;
    }

    public int getMinutos() {
        return minutos;
    }

    public boolean setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
            return true;
        }
        return false;
    }

    public int getSegundos() {
        return segundos;
    }

    public boolean setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
            return true;
        }
        return false;
    }
}
