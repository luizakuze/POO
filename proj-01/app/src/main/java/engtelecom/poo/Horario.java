package engtelecom.poo;

public class Horario {
    private int horas;
    private int minutos;
    private int segundos;

    public Horario(int horas, int minutos, int segundos) {
        if (setHoras(horas) && setMinutos(minutos) && setSegundos(segundos)) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }

    public int getHoras() {
        return horas;
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

    public boolean atualizaHorario(int segundos) {
        if (segundos >= 0) {
            // 1 hora são 60 minutos
            while (segundos >= 3600) {
                this.horas++;
                segundos -= 3600;
            }
            // 1 minuto são 60 segundos
            while (segundos >= 60) {
                this.minutos++;
                segundos -= 60;
            }
            this.segundos += segundos;
            return true;
        }
        return false;
    }
}
