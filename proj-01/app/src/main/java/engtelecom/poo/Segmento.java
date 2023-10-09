package engtelecom.poo;

public class Segmento {
    private boolean estado; // pode estar ligado ou desligado
    private int coordenadaX;
    private int coordenada;

    public Segmento(boolean estado, int coordenadaX, int coordenada) {
        this.estado = false; // inicia com o segmento desligado
        this.coordenadaX = coordenadaX;
        this.coordenada = coordenada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void trocaEstado(boolean estado) {
        this.estado = estado;
    }

}
