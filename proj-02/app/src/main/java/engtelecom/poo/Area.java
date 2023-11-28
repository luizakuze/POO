package engtelecom.poo;

import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class Area {
    private int coodenadaX;
    private int coodenadaY;
   
    private int lagura;
    private int altura;


    public Area(int coodenadaX, int coodenadaY, int lagura, int altura) {
        this.coodenadaX = coodenadaX;
        this.coodenadaY = coodenadaY;
        this.lagura = lagura;
        this.altura = altura;
    }


    public abstract void desenharArea(JFrame frame);

}