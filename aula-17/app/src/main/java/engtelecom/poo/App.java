package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
import java.awt.Rectangle;

public class App {
    private Draw desenho;

    public App(){
        this.desenho = new Draw();
        this.desenho.setXscale(0,600);
        this.desenho.setYscale(0,600);
        this.desenho.enableDoubleBuffering();
        this.desenho.setDefaultCloseOperation(3);
    }

    public void desenharQuadrado(int x, int y, int dimensao){
        desenho.setPenColor(Color.RED);
        desenho.filledSquare(x, y, dimensao);

    }

    public void desenharCirculo(int x, int y, int raio) {
        desenho.setPenColor(Color.BLUE);
        desenho.filledCircle(x, y, raio);
    }

    public static void main(String[] args) {

        App app = new App();

        int x = 300;
        int y = 300;
        int raio = 10;
        int vx = 1;
        int vy = 2;

        while (true) {
            app.desenharQuadrado(300, 300, 20); 
            app.desenharQuadrado(x, y, raio); 

            x += vx;
            y += vy;

            if ((x+raio > 600) || (x+raio < 0)) {
                vx *= -1;
            }

            if ((y+raio > 600) || (y+raio < 0)) {
                vy *= -1;
            }

            // verificar intersecção com quadrado
            // nesse retângulo x,y está na ponto superior esquerdo
            Rectangle r = new Rectangle(10,10,20,20);
            Rectangle outro = new Rectangle(20,20,10,10);

            if (r.intersects(outro)) {
                System.out.println("Sim, bateram");
            }

            app.desenho.pause(20);
            app.desenho.show();
            app.desenho.clear(Color.WHITE);
        }
    }
}