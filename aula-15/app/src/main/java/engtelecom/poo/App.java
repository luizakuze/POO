package engtelecom.poo;

import java.util.ArrayList;

// um jogo de carros, onde pode comprar um carro e trocar o motos dele

public class App {

    public static final int TOTAL_CARROS = 3;
    public static final int TOTAL_PECAS = 3;

    private ArrayList<Jogador> jogadores;

    public App() {
        this.jogadores = new ArrayList<>();
    }

    // "entrou na partida"
    public void criarJogador(String nome) {
        // já começou com um carro base
        Motor m = new Motor(120, 4);
        Carro c = new Carro("ferrari", m);
        Jogador j = new Jogador(nome, c);
        this.jogadores.add(j);
    }


    public void comprarCarro(Jogador j) {
        if (j.comprarCarro(new Carro("fusca", new Motor(300, 4)))) {
            System.out.println("Carro comprado com sucesso!");
        } else {
            System.out.println("Garagem cheia");
        }
    }

    // refatorando o método anterior
    public void comprarMotor(Jogador j) {
        if (j.comprarMotor(new Motor(200, 6))) {
            System.out.println("Motor comprado com sucesso!");
        } else {
            System.out.println("Estante cheia");
        }
    }


    public static void main(String[] args) {
        App app = new App();

        app.criarJogador("Juca");
        app.criarJogador("Computador"); // jogo de 1 jogador x computador!
        
        app.comprarCarro(app.jogadores.get(0));

    }
}
