package engtelecom.poo;

//https://www.flaticon.com/
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.Scanner;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class App implements DrawListener{

    private Draw desenho;
    private Robo robo;

    Scanner scanner = new Scanner(System.in);

    public App() {
        this.desenho = new Draw();
        this.desenho.setXscale(0, 600);
        this.desenho.setYscale(0, 600);
        this.desenho.enableDoubleBuffering();
        this.desenho.setDefaultCloseOperation(3);
        this.desenho.addListener(this);
        this.robo = new Robo(null, 300, 300, 1, 2, 10);
    }

    public void desenharQuadrado(int x, int y, int dimensao){
        desenho.setPenColor(Color.RED);
        desenho.filledSquare(x, y, dimensao);
    
        }
    
    public void desenharCirculo(int x, int y, int raio) {
        desenho.setPenColor(Color.BLUE);
        desenho.filledCircle(x, y, raio);
    }

    // loop do jogo
    public void jogo(){
        while(true) {
            robo.desenhar(this.desenho);

            this.desenho.pause(60);
            this.desenho.show();
            this.desenho.clear(Color.WHITE);
        }
    }


    //ctrl + shift + p / >Java Help Center / Student / Enable AWT Dev
    @Override
    public void keyPressed(int keycode) { 

        System.out.println("apertou algo");

        switch (keycode) {
            case KeyEvent.VK_M:
                System.out.println("apertou M");        
                break;
        }

        //this.robo.movimentar(keycode);
    }

    @Override
    public void mousePressed(double x, double y) {
        System.out.println("x: " + x + "y " + y);
        this.desenho.setPenColor(Color.RED);
        this.desenharCirculo((int) x, (int) y, 30);
    }




    public static void main(String[] args) {
        App app = new App();
        app.jogo();
    }


    
}