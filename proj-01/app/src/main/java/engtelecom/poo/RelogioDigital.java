package engtelecom.poo;

import java.util.ArrayList;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class RelogioDigital {
    private int coordenadaX;
    private int coordenadaY;
    private String cor;
    private Horario horario;
    private int tamanho; // 1, 2 e 3
    private ArrayList<Display> displays;

    public RelogioDigital(int coordenadaX, int coordenadaY, int horas, int minutos, int segundos, String cor,
            int tamanho) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.cor = cor;
        this.tamanho = tamanho;
        this.horario = new Horario(horas, minutos, segundos);
        setTamanho();
        setDisplay();
    }

    private Color selecionaCor(String cor) {
        if (cor.equals("rosa")) {
            return Color.PINK;
        } else if (cor.equals("azul")) {
            return Color.BLUE;
        } else if (cor.equals("verde")) {
            return Color.GREEN;
        } else {
            return Color.BLACK;
        }
    }

    public void setTamanho() {
        if (tamanho == 1) {
            Principal.FATOR = 50;
        } else if (tamanho == 3) {
            Principal.FATOR = 150;
        } else {
            Principal.FATOR = 100;
        }
    }

    public void setDisplay() {
        // limpa a lista de displays
        // displays.clear();

        displays = new ArrayList<Display>();

        // converte os segundos, minutos e horas em números de dois dígitos
        int horasDezena = horario.getHoras() / 10;
        int horasUnidade = horario.getHoras() % 10;
        int minutosDezena = horario.getMinutos() / 10;
        int minutosUnidade = horario.getMinutos() % 10;
        int segundosDezena = horario.getSegundos() / 10;
        int segundosUnidade = horario.getSegundos() % 10;

        // adiciona os displays correspondentes aos segundos, minutos e horas
        displays.add(new Display(horasDezena));
        displays.add(new Display(horasUnidade));
        displays.add(new Display(minutosDezena));
        displays.add(new Display(minutosUnidade));
        displays.add(new Display(segundosDezena));
        displays.add(new Display(segundosUnidade));
    }

    // desenha 6 displays, "relógio"
    public void desenhaRelogio(Draw desenho) {
        for (Display display : displays) {

            display.desenharDisplay(desenho, this.coordenadaX, this.coordenadaY, selecionaCor(cor));

            this.coordenadaX += 80;

        }
    }

}
