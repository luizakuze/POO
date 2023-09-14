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


    @Override
    public String toString() {
        return "App [banco=" + banco + "]";
    }


    public boolean adicionarUC(String c, UnidadeCurricular uc){
        // verifica se a chave já existe, assim não sobrescreve o valor! 
        if(!banco.containsKey(c)) {
            this.banco.put(c, uc);
            return true;
        }
        return false;
    }

    public boolean excluirUC(String c) {
        this.banco.remove(c);
        return true;
    }

    public boolean mostrarUC (String c) {
        
        return true;
    }


    public int menuDeOperacoes(){
        int opcao = -1;

        do {
            System.out.println("..:: Sistema Acadêmico ::..");
            System.out.println(" 1 - Adicionar UC");
            System.out.println(" 2 - Remover UC");
            System.out.println(" 3 - Alterar UC");
            System.out.println(" 4 - Exibir UC");
            System.out.println(" 5 - Listar todas as UC");
            System.out.println(" 6 - Sair");
            System.out.println("Entre com uma opção: ");

            Scanner teclado = new Scanner(System.in);
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1: 
                    // adicionar uma UC
                    System.out.println("Entre com a UC");

                    System.out.println("Código Uc:");
                    String c = teclado.nextLine();

                    System.out.println("Nome:");
                    String nome = teclado.nextLine();

                    System.out.println("Código:");
                    String codigo = teclado.nextLine();

                    System.out.println("Sigla:");
                    String sigla = teclado.nextLine();

                    System.out.println("Créditos:");
                    Integer creditos = teclado.nextInt();

                    System.out.println("Ementa:");
                    String ementa = teclado.nextLine();

                    UnidadeCurricular uc = new UnidadeCurricular(nome, codigo, sigla, creditos, ementa);
                    adicionarUC(c, uc);
                    break;

                case 2:
                    // remover uma UC
                    System.out.println("Entre com o nome da UC");
                    String codigoUc = teclado.nextLine();
                    excluirUC(codigoUc);
                    break;

                case 3:
                    // alterar uma UC
                    System.out.println("Entre com o nome da UC");
                    break;
                case 4:
                    // mostrar uma UC
                    System.out.println("Entre com o nome da UC");
                    String codigoUc = teclado.nextLine();
                    toString(codigoUc);
                    break;
                case 5:
                    // mostrar todas as UCs
                    System.out.println("Entre com o nome da UC");
                break;
                case 6:
                    // sair
                    System.out.println("Fechando acesso ao sistema...");

                default:
                    System.out.println("Opção inválida!");
            }


        } while(opcao > 0);

        return opcao;
    }


    
    public static void main(String[] args) {

        App app = new App();

        //app.adicionarUC();

    }
}
