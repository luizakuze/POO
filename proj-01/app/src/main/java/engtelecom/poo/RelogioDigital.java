package engtelecom.poo;

import java.util.ArrayList;

public class RelogioDigital {
    private Horario horario;
    private String cor;
    private char tamanho;
    private ArrayList<Display> displays;

    public RelogioDigital(Horario horario, String cor, char tamanho) {
        this.horario = horario;
        this.cor = cor;
        this.tamanho = tamanho;
        this.displays = new ArrayList<>();
    }

    // public boolean defineHorario(int segundo, int minuto, int hora) {
    // }

}
