package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Segmento {
    private boolean estado; // pode estar ligado ou desligado

    public boolean getEstado() {
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
