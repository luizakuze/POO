package engtelecom.poo;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AreaDoJogo extends Area {



    public AreaDoJogo(int coodenadaX, int coodenadaY, int lagura, int altura) {
        super(coodenadaX, coodenadaY, lagura, altura);
    }

    @Override
    public void desenharArea( JFrame frame) {
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setBounds(10, 10, 10, 10);

        frame.add(panel);
    }

    

}





    // class AreaDeJogo {
    //     -nivel: int
    //     -Mapa: Tijolos[][]
    //     -elementos: ArrayList ~Elementos~
    //     +AreaJogo()
    //     -posicionarTijolos(): void
    //     +pausarElementos(): boolean
    //     +avancarProximaAreaJogo(t: Tijolos[][]): boolean
    //     -reiniciarNivel(v: int): boolean
    // }