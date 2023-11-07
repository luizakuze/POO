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

        int x = 150;
        int y = 150;
        int raio = 10;
        int vx = 1;
        int vy = 2;


        while (true) {
            app.desenharQuadrado(300, 300, 20); 
            app.desenharCirculo(x, y, raio); 

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
            Rectangle quadrado = new Rectangle(300-20,300-20,40,40);
            Rectangle circulo = new Rectangle(x-raio,y-raio,2*raio,2*raio);

            if (quadrado.intersects(circulo)) {
                vx *= -1;
                vy *= -1;
            }


            app.desenho.pause(10);
            app.desenho.show();
            app.desenho.clear(Color.WHITE);
        }
    }
}