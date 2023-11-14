package engtelecom.poo;

//https://www.flaticon.com/
import edu.princeton.cs.algs4.Draw;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;

public class App {

    private Draw desenho;

    public App() {
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

        ArrayList<ElementoDoJogo> elementos = new ArrayList<>();

        elementos.add(new Tesouro(1,10,100));
        elementos.add(new Robo(null, 300,300,1,2,10));
        elementos.add(new Parede(200, 200));
        //Elemento e = new ElementoDoJogo(); É UMA CLASSE ABSTRATA!!

        app.desenho.show();

        while (true) {
            for (var e: elementos) { // var = auto 
                // erro em tempo de execução
                // Robo r = (Robo) e;
                // r.movimentar(1);
                // tem que haver certeza que é um robo, só de for uma instancia


                if (e instanceof Robo) {
                    Robo r = (Robo) e;
                    /// TODO atualizar coordenadas somente do robo! movimentar do robo

                    r.movimentar(1);
                }

            }

            //desenha os elementos
            elementos.forEach(e->e.desenhar(app.desenho));

            app.desenho.pause(100);
            app.desenho.show();
            app.desenho.clear(Color.WHITE);
        }
    }
}