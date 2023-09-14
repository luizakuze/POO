package engtelecom.poo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    private HashMap<String, UnidadeCurricular> banco;

    public App(){
        this.banco = new HashMap<>();
    }

    public boolean adicionarUC(String c, UnidadeCurricular uc){

        // tenho certeza que não está duplicado
        // já da o return false
        this.banco.put(c, uc);

        return true;
    }

    public boolean excluirUC(String c) {
        this.banco.remove(c);
        return true;
    }

    // public boolean mostrarUC (String c) {
        
    //     return true;
    // }

    // criar menu fora do main
    public int menuDeOperacoes(){
        int opcao = 1;

        do {
            System.out.println("..:: Sistema Acadêmico ::..");
            System.out.println(" 1 - Adicionar UC");
            System.out.println(" 2 - Sair");
            System.out.println("Entre com uma opção: ");

            // System.out.println(" 2 - Alterar UC");
            // System.out.println(" 3 - Exibir UC");
            // System.out.println(" 4 - Listar UC");

            Scanner teclado = new Scanner(System.in);
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Entre com a UC");

                    System.out.printf("\nCódigo c:");
                    String c = teclado.nextLine();

                    System.out.printf("\nNome:");
                    String nome = teclado.nextLine();

                    System.out.printf("\nCódigo:");
                    String codigo = teclado.nextLine();

                    System.out.printf("\nSigla:");
                    String sigla = teclado.nextLine();

                    System.out.printf("\nCréditos:");
                    Integer creditos = teclado.nextInt();

                    System.out.printf("\nEmenta:");
                    String ementa = teclado.nextLine();

                    UnidadeCurricular uc = new UnidadeCurricular(nome, codigo, sigla, creditos, ementa);
                    adicionarUC(c, uc);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            opcao = 0;

        } while(opcao > 0);

        return opcao;
    }


    
    public static void main(String[] args) {

        App app = new App();

        //app.adicionarUC();

    }
}
