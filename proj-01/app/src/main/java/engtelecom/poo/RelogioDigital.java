package engtelecom.poo;

import java.util.ArrayList;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class RelogioDigital {
    private int coordenadaX;
    private int coordenadaY;
    private Color cor;
    private Horario horario;
    private int tamanho; // 1, 2 e 3
    private ArrayList<Display> displays;

    public static final int MIN_TAM = 1;
    public static final int MAX_TAM = 3;

    public RelogioDigital(int coordenadaX, int coordenadaY, int horas, int minutos, int segundos, String cor,
            int tamanho) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        setCor(cor);
        this.horario = new Horario(horas, minutos, segundos);
        setTamanho(tamanho);
        setDisplay();
    }

    public void atualizaHorario() {
        this.horario.atualizaUmSegundo();
        setDisplay();
    }

    public void setTamanho(int tamanho) {
        if (tamanho >= MIN_TAM && tamanho <= MAX_TAM) {
            this.tamanho = tamanho;
        } else {
            this.tamanho = 2;
        }
        // alteraFator();
    }

    private void setCor(String cor) {
        if (cor.equals("rosa")) {
            this.cor = Color.PINK;
        } else if (cor.equals("azul")) {
            this.cor = Color.BLUE;
        } else if (cor.equals("verde")) {
            this.cor = Color.GREEN;
        } else {
            // qualquer outra cor foi considerada inválida
            this.cor = Color.WHITE;
        }
    }

    public void alteraFator() {
        if (this.tamanho == 1) {
            Display.FATOR_TAMANHO = 30;
        } else if (this.tamanho == 3) {
            Display.FATOR_TAMANHO = 60;
        } else {
            Display.FATOR_TAMANHO = 90;
        }
    }

    public void setDisplay() {
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
        int coordenadaInicialX = this.coordenadaX;

        for (Display display : displays) {
            display.desenharDisplay(desenho, this.coordenadaX, this.coordenadaY, cor, tamanho);

            this.coordenadaX += Display.FATOR_TAMANHO / 0.5;

        }

        this.coordenadaX = coordenadaInicialX;
    }

}
