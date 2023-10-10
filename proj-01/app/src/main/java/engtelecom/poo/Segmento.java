package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Segmento {
    private boolean estado; // pode estar ligado ou desligado~
    private int coordenadaX;
    private int coordenadaY;
    private final int FATOR = 200;
    private final double FATOR_COR = 0.2;

    public Segmento(int coordenadaX, int coordenada) {
        this.estado = false; // inicia com o segmento desligado
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void trocaEstado() {
        if (this.estado) {
            this.estado = false;
        } else {
            this.estado = true;
        }
    }

    public void desenhaSegmento(Draw desenho) {
        // cores para diferentes estados do segmento
        Color clara = Draw.GREEN;
        Color escura = new Color((int)(clara.getRed()*FATOR_COR), (int)(clara.getGreen()*FATOR_COR), (int)(
        clara.getBlue()*FATOR_COR));

        // montando vetores com os pontos em X e em Y para desenhar um segmento horizontal
        double[] x = {0.1*FATOR+coordenadaX, 0.2*FATOR+coordenadaX, 1.0*FATOR+coordenadaX, 1.1*FATOR+
        coordenadaX, 1.0*FATOR+coordenadaX, 0.2*FATOR+coordenadaX};
        double[] y = {0.2*FATOR+coordenadaY, 0.3*FATOR+coordenadaY, 0.3*FATOR+coordenadaY, 0.2*FATOR+
        coordenadaY, 0.1*FATOR+coordenadaY, 0.1*FATOR+coordenadaY};

        if (this.estado) {
            desenho.setPenColor(clara); // segmento ligado
        } else {
            desenho.setPenColor(escura); // segmento desligado
        }
        desenho.filledPolygon(x, y);
    }

}
