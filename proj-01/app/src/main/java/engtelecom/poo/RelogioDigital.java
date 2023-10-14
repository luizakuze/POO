package engtelecom.poo;

import java.util.ArrayList;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class RelogioDigital {
    private int coordenadaX;
    private int coordenadaY;
    private int segundos;
    private int minutos;
    private int horas;
    private String cor;
    private int tamanho; // 1, 2 e 3
    private ArrayList<Display> displays;

    public RelogioDigital(int coordenadaX, int coordenadaY, int horas, int minutos, int segundos, String cor,
            int tamanho) {
        if (setHoras(horas) && setMinutos(minutos) && setSegundos(segundos)) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.cor = cor;
        this.tamanho = tamanho;
        setTamanho();
        this.displays = new ArrayList<Display>();
        setDisplay();
    }

    public void setTamanho() {
        if (tamanho == 1) {
            Principal.FATOR = 50;
        } else if (tamanho == 2) {
            Principal.FATOR = 100;
        } else {
            Principal.FATOR = 150;
        }
    }

    public void setDisplay() {
        // limpa a lista de displays
        displays.clear();

        // converte os segundos, minutos e horas em números de dois dígitos
        int segundosDezena = this.segundos / 10;
        int segundosUnidade = this.segundos % 10;
        int minutosDezena = this.minutos / 10;
        int minutosUnidade = this.minutos % 10;
        int horasDezena = this.horas / 10;
        int horasUnidade = this.horas % 10;

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

        setDisplay();

        for (Display display : displays) {

            display.desenharDisplay(desenho, this.coordenadaX, this.coordenadaY);
            this.coordenadaX += 100;
            this.coordenadaY += 100;
        }
    }

    public boolean setHoras(int horas) {
        if (horas >= 0 && horas < 24) {
            this.horas = horas;
            return true;
        }
        return false;
    }

    public int getMinutos() {
        return minutos;
    }

    public boolean setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
            return true;
        }
        return false;
    }

    public int getSegundos() {
        return segundos;
    }

    public boolean setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
            return true;
        }
        return false;
    }
}
