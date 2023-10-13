package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Segmento {
    private char id; // id: A, B, C, D, E, OU F
    private boolean estado; // pode estar ligado ou desligado
    private int coordenadaX;
    private int coordenadaY;

    public Segmento(char id, int coordenadaX, int coordenadaY) {
        this.estado = false; // inicia com o segmento desligado
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public boolean isEstado() {
        return estado;
    }

    public void trocaEstado() {
        this.estado = !this.estado;
    }

    // desliga um segmento
    public void reset() {
        this.estado = false;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    // sseleciona a cor do segmento caso esteja ligado ou desligado
    private void selecionaCor(Draw desenho) {
        if (this.estado) {
            desenho.setPenColor(Principal.CLARA); // segmento ligado
        } else {
            desenho.setPenColor(Principal.ESCURA); // segmento desligado
        }
    }

    // desenha um segmento horizontal
    public void desenharSegmentoHorizontal(Draw desenho) {
        double[] x = { 0.1 * Principal.FATOR + coordenadaX, 0.2 * Principal.FATOR + coordenadaX,
                1.0 * Principal.FATOR + coordenadaX, 1.1 * Principal.FATOR +
                        coordenadaX,
                1.0 * Principal.FATOR + coordenadaX, 0.2 * Principal.FATOR + coordenadaX };
        double[] y = { 0.2 * Principal.FATOR + coordenadaY, 0.3 * Principal.FATOR + coordenadaY,
                0.3 * Principal.FATOR + coordenadaY, 0.2 * Principal.FATOR +
                        coordenadaY,
                0.1 * Principal.FATOR + coordenadaY, 0.1 * Principal.FATOR + coordenadaY };

        selecionaCor(desenho);

        desenho.filledPolygon(x, y);
    }

    // desenha um segmento vertical
    public void desenharSegmentoVertical(Draw desenho) {
        double[] x = { 0.1 * Principal.FATOR + coordenadaX, 0.2 * Principal.FATOR + coordenadaX,
                0.2 * Principal.FATOR + coordenadaX, 0.1 * Principal.FATOR + coordenadaX,
                0 * Principal.FATOR + coordenadaX, 0 * Principal.FATOR + coordenadaX };
        double[] y = { 0.2 * Principal.FATOR + coordenadaY, 0.3 * Principal.FATOR + coordenadaY,
                1.0 * Principal.FATOR + coordenadaY, 1.1 * Principal.FATOR + coordenadaY,
                1.0 * Principal.FATOR + coordenadaY, 0.3 * Principal.FATOR + coordenadaY };

        selecionaCor(desenho);

        desenho.filledPolygon(x, y);

    }
}
