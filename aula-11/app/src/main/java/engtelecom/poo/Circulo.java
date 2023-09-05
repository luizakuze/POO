package engtelecom.poo;

public class Circulo {

    private int x;
    private int y;
    private double raio;

    // Atributo estático para contar o total de objetos Circulo
    private static int total;

    private final int MAX_X = 400;
    private final int MAX_Y = 400;

    // Construtor da classe Circulo
    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
        // Incrementa o total de objetos Circulo ao criar um novo objeto
        this.total++;
    }

    // Método estático para obter o total de objetos Circulo criados
    public static int getTotal() {
        return total;
    }

    // Getters e setters para os atributos da classe Circulo
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Método estático para definir o total de objetos Circulo (não recomendado)
    // public static void setTotal(int total) {
    //     Circulo.total = total;
    // }
}
