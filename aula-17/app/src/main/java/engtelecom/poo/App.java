package engtelecom.poo;

//https://www.flaticon.com/
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.RenderingHints.Key;
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

    public static void main(String[] args) {
        App app = new App();

        app.jogo();

        // Mapa m = new Mapa(600, 600, 1);
        // ArrayList<ElementoDoJogo> elementos = new ArrayList<>();

        // elementos.add(new Robo(m, 300, 300, 60, 60, 10));

        // app.desenho.show();

        // System.out.println("..: Iniciando jogo do robôzinho :..");

        // while (true) {
        //     // Obtém a direção do usuário e move o robô
        //     for (var e : elementos) {
        //         if (e instanceof Robo) {
        //             Robo r = (Robo) e;
        //             r.movimentar(1);
        //         }
        //     }

        //     // Desenha os elementos
        //     elementos.forEach(e -> e.desenhar(app.desenho));
        //     //mapa.desenhar(app.desenho);


        //}
    }



    @Override
    protected void finalize() throws Throwable {
  
    }

    //ctrl + shift + p / >Java Help Center / Student / Enable AWT Dev
    @Override
    public void keyPressed(int keycode) { // tecla
        this.robo.movimentar(keycode);
    }

    @Override
    public void keyReleased(int keycode) {
    }

    @Override
    public void keyTyped(char c) {
    }

    @Override
    public void mouseClicked(double x, double y) {
      DrawListener.super.mouseClicked(x, y);
    }

    @Override
    public void mouseDragged(double x, double y) {
       DrawListener.super.mouseDragged(x, y);
    }

    @Override
    public void mousePressed(double x, double y) {
        System.out.println("x: " + x + "y " + y);
        this.desenho.setPenColor(Color.RED);
        this.desenharCirculo((int) x, (int) y, 30);
    }

    @Override
    public void mouseReleased(double x, double y) {
    }

    @Override
    public void update() {
    }


    
}