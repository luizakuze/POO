package engtelecom.poo;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class ParanoidOO extends JPanel implements KeyListener {
    private ArrayList<Area> areas;
    private Jogador jogador;
    private boolean somLigado;
    private boolean jogoPausado;
    private Timer timer;
    private JFrame frame;

    private final int LARGURA = 800;
    private final int ALTURA = 800;


    public ParanoidOO() {
        this.frame = new JFrame();
        frame.setTitle("Animação Java 2D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(LARGURA, ALTURA);
        frame.setVisible(true);
        this.addKeyListener(this);

        this.iniciar();
    }


    public void iniciar() {

    
        areas = new ArrayList<>();
        areas.add(new AreaDoJogo(0,0, ALTURA, LARGURA));
        desenharAreas();

        Toolkit.getDefaultToolkit().sync();
    }

    private void desenharAreas() {
        for (Area a: areas) {
            a.desenharArea(this.frame);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }



}
