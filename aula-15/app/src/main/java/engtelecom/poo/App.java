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

    // tem q passar o jogador como parâmetro p saber quem comprou o carro
    // aqui imaginando q ele já viu o catálogo/menu
    public void comprarCarro(Jogador j) {

        //verificar se tem espaço na garagem
        if (j.totalDeCarrosNaGaragem() < TOTAL_CARROS) {

            Carro c = new Carro("fusca", new Motor(300, 4));

            Carro antigo = j.getCarroAtual();
            j.adicionarCarro(antigo);
            j.setCarroAtual(c);
            System.out.println("Carro comprado com sucesso!");
        } else {
            System.out.println("Garagem cheia");
        }
    }

    //troca motor do carro atual qnd comprar novo motor e só pode se estante tiver espaço
    // public void comprarMotor(Jogador j) {
    //     if (j.totalDeCarrosNaPecas() < TOTAL_PECAS) {

    //         Motor m = new Motor(100, 3);

    //         Motor antigo = j.getCarroAtual().getPropulsor();
    //         j.adicionarPeca(antigo);
    //         j.getCarroAtual().setPropulsor(m);;
    //         System.out.println("Motor comprado com sucesso!");
    //     } else {
    //         System.out.println("Estante cheia");
    //     }
    // }

    // 'refatorando' o método
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
