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

    public RelogioDigital(int coordenadaX, int coordenadaY, int segundos, int minutos, int horas, String cor, int tamanho) {
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

    public void desenhaRelogio(Draw desenho) {
        // int largura = 600; // Largura do retângulo (aumentado para 200)
        // int altura = 200; // Altura do retângulo (aumentado para 100)

        // // Definindo a cor do preenchimento para preto
        // desenho.setPenColor(Draw.BLACK);
        // desenho.filledRectangle(coordenadaX, coordenadaY, largura / 2.0, altura / 2.0);






        // vai ter que desenhar 6 displays em posições diferentes, ou seja
        // os diplays devem ter coordenadas diferentes
        int x = 10;
        int y = 10;
        for (Display display : displays) {
            display.desenharDisplay(desenho);
            coordenadaX += x;
            coordenadaY += y;
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

