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






        //ArrayList<Aluno> alunos = new ArrayList<>();
        // ArrayList<String> cidades = new ArrayList<>();
        //String sje = "São José";
        //String fln = "Florianópolis";

        // Aluno joao = new Aluno (123, "Joao");
        // alunos.add(joao);
        // sout(alunos); // invoca o toString dos alemenetos que estão dentro

        // cidades.add(sje);
        // cidades.add(fln);
    
        // Map<Integer, Aluno> alunos = new HashMap<>();

        // Aluno joao = new Aluno (123, "Joao");
        // Aluno maria = new Aluno(456, "Maria");
        // Aluno juca = new Aluno(123, "Juca");

        // alunos.put(joao.getMatricula(), joao);
        // //alunos.put(juca.getMatricula(), juca); //substituiria joao

        // // procura pela chave
        // Aluno a = alunos.get(123);
        // System.out.println(a);

        //j= null;
        //joao = null;
        //joao = alunos.get(0);
        //alunos.add(new Aluno(789, "Juca"));
        //j = alunos.get(2);

        // String outra = "Florianópolis";
        //Aluno j = new Aluno (123, "Joao"); //não está na lista!
        // Aluno j = joao; // copiou o endereço do joao, "j" não é um objeto

        // if (cidades.contains(outra)) {
        //     System.out.println("Tem Floripa");
        // } else {
        //     System.out.println("Não tem Floripa");
        // }

        // if (alunos.contains(joao)) {
        //     System.out.println("Tem João");
        // } else {
        //     System.out.println("Não tem João");
        // }

        // alunos.removeIf(a->a.getMatricula() == 123);

        // alunos.forEach(a->{
        //     if (a.getMatricula() == 123) {
        //         System.out.println("Tem João");
        //     }
        // });

    }
}
