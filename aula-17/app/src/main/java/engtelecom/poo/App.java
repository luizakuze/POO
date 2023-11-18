package engtelecom.poo;

//https://www.flaticon.com/
import edu.princeton.cs.algs4.Draw;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;

public class App {

    private Draw desenho;

    Scanner scanner = new Scanner(System.in);

    public App() {
        this.desenho = new Draw();
        this.desenho.setXscale(0, 600);
        this.desenho.setYscale(0, 600);
        this.desenho.enableDoubleBuffering();
        this.desenho.setDefaultCloseOperation(3);
    }

    /**
     * Exibe um menu de direções ao usuário que
     * seleciona a movimentação do robô.
     * 
     * @return Direção de movimentação.
     */
    // public int obterDirecaoDoUsuario() {
    // System.out.println("0 - Cima");
    // System.out.println("1 - Direita");
    // System.out.println("2 - Baixo");
    // System.out.println("3 - Esquerda");

    // return scanner.nextInt();
    // }

    public static void main(String[] args) {
        App app = new App();
        ArrayList<ElementoDoJogo> elementos = new ArrayList<>();
        Mapa m = new Mapa(600, 600, 1);

        elementos.add(new Tesouro(1, 10, 100));
        elementos.add(new Robo(m, 300, 300, 60, 60, 10));
        elementos.add(new Parede(200, 200));

        app.desenho.show();

        System.out.println("..: Iniciando jogo do robôzinho :..");

        while (true) {

            // obtem direção da movimentação do robô
            // int direcao = app.obterDirecaoDoUsuario();

            // Desenha os elementos
            elementos.forEach(e -> e.desenhar(app.desenho));

            // Obtém a direção do usuário e move o robô
            for (var e : elementos) {
                if (e instanceof Robo) {
                    Robo r = (Robo) e;
                    r.movimentar(1);
                    // r.movimentar(direcao);
                }
            }

            app.desenho.pause(80);
            app.desenho.show();
            app.desenho.clear(Color.WHITE);
        }
    }
}