package engtelecom.poo;

public class Segmento {
    private boolean estado; // pode estar ligado ou desligado

    public boolean isEstado() {
        return estado;
    }

    public void trocaEstado(boolean estado) {
        this.estado = estado;
    }

    public Segmento(boolean estado) {
        this.estado = estado;
    }
}
