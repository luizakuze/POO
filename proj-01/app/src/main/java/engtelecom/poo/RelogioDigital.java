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
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
        this.cor = cor;
        this.tamanho = tamanho;
        this.displays = new ArrayList<>();
    }

    public void setDisplays(ArrayList<Display> displays) {
        this.displays = displays;
    }

    public void desenhaRelogio(Draw desenho) {
        int largura = 600; // Largura do retângulo (aumentado para 200)
        int altura = 200; // Altura do retângulo (aumentado para 100)

        // Definindo a cor do preenchimento para preto
        desenho.setPenColor(Draw.BLACK);
        desenho.filledRectangle(coordenadaX, coordenadaY, largura / 2.0, altura / 2.0);

        for (Display display : displays) {
            display.desenharDisplay(desenho);
        }
    }

}
