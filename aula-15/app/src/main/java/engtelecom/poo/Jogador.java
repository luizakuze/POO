package engtelecom.poo;

import java.util.ArrayList;

public class Jogador {

    private String nome;
    private Carro carroAtual;
    private ArrayList<Carro> garagem;
    private ArrayList<Motor> estante;

    public Jogador(String n, Carro c) {
        this.nome = n;
        this.carroAtual = c;
        garagem = new ArrayList<>();
        estante = new ArrayList<>();
    }

    public boolean adicionarCarro(Carro c) {
        if (garagem.size() < App.TOTAL_CARROS) {
            garagem.add(c);
            return true;
        }
        return false;
    }

    public boolean adicionarPeca(Motor m) {
        if (estante.size() < App.TOTAL_PECAS) {
            estante.add(m);
            return true;
        }
        return false;
    }

    public boolean comprarMotor(Motor m) {
        if (this.totalDeCarrosNaPecas() < App.TOTAL_PECAS) {

            Motor antigo = carroAtual.getPropulsor();

            this.adicionarPeca(antigo);
            this.carroAtual.setPropulsor(m);;

            return true;
        } 
        return false;
    }
    
    public int totalDeCarrosNaGaragem() {
        return garagem.size();
    }

    public int totalDeCarrosNaPecas() {
        return estante.size();
    }

    public Carro getCarroAtual() {
        return carroAtual;
    }

    public void setCarroAtual(Carro carroAtual) {
        this.carroAtual = carroAtual;
    }

    
}   
