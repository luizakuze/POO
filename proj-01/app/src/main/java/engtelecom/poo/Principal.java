package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
import java.util.ArrayList;

public class Principal {
    private ArrayList<RelogioDigital> relogios;
    private Draw desenho;

    public static double FATOR = 200;
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

        RelogioDigital r = new RelogioDigital(200, 200, 12, 34, 56, "rosa", 1);
        p.relogios.add(r);

        RelogioDigital r2 = new RelogioDigital(200, 600, 12, 34, 56, "verde", 1);
        p.relogios.add(r2);

        for (int i = 1; i <= 10; i++) {
            // limpando a área de desenho
            p.desenho.clear(Draw.BLACK);

            p.desenhaRelogios();

            for (RelogioDigital relogio : p.relogios) {
                relogio.atualizaHorario();
            }

            // trocando o buffer para exibir o que foi escrito
            p.desenho.show();

            // Dormindo por 1 segundo
            Thread.sleep(1000);
        }

    }

}
