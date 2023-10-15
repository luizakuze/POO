package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.util.ArrayList;

public class Principal {
    private ArrayList<RelogioDigital> relogios;
    private Draw desenho;

    public static final int DIMENSAO = 1000;

    public Principal() {
        this.relogios = new ArrayList<>();

        this.desenho = new Draw();
        this.desenho.setXscale(0, DIMENSAO);
        this.desenho.setYscale(0, DIMENSAO);
        this.desenho.setDefaultCloseOperation(3);
        this.desenho.enableDoubleBuffering();
    }

    // desenha todos os relógios
    public void desenhaRelogios() {
        for (RelogioDigital relogio : relogios) {
            relogio.desenhaRelogio(desenho);
        }
        desenho.show();
    }

    public static void main(String[] args) throws InterruptedException {
        Principal p = new Principal();

        RelogioDigital r = new RelogioDigital(100, 100, 12, 34, 56, "rosa", 1);
        RelogioDigital r2 = new RelogioDigital(100, 300, 12, 34, 56, "verde", 2);
        RelogioDigital r3 = new RelogioDigital(100, 600, 12, 34, 56, "azul", 3);

        p.relogios.add(r);
        p.relogios.add(r2);
        p.relogios.add(r3);

        // atualizando 10 segundos do relógio
        for (int i = 1; i <= 10; i++) {
            // limpando a área de desenho
            p.desenho.clear(Draw.BLACK);

            // desenhando cada um dos relógios
            p.desenhaRelogios();
            for (RelogioDigital relogio : p.relogios) {
                relogio.atualizaHorario();
            }

            // dormindo por 1 segundo
            Thread.sleep(1000);
        }

    }

}
