package engtelecom.poo;

public class Caneta {
    
    // Atributos
    private String cor;
    private double nivelTinta;

    // Métodos
    public void desenhar(int distancia){
        System.out.println("Desenhando de " + cor + " com distância " + distancia);
        this.nivelTinta -= distancia * 0.2;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public String getCor() {
        return cor;
    }

    public void setNivelTinta(double nivelTinta) {
        this.nivelTinta = nivelTinta;
    }
  
    public double getNivelTinta() {
        return nivelTinta;
    }
}
