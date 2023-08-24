package engtelecom.poo;

public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;

    // construtor padrão
    public Tempo() {
    }

    public Tempo(int horas) {
        this.horas = horas;
    }

    public Tempo(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }

    public Tempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    
}
