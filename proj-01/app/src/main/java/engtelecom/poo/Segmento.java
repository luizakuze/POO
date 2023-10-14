package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Segmento {
    private char id; // id: A, B, C, D, E, OU F
    private boolean estado; // pode estar ligado ou desligado

    public Segmento(char id) {
        this.id = id;
        this.estado = false; // inicia com o segmento desligado
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
}
