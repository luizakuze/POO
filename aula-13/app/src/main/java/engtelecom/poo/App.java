package engtelecom.poo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class App {

    private HashMap<String, UnidadeCurricular> banco;

    public App() {
        this.banco = new HashMap<>();
    }

    @Override
    public String toString() {
        return "App [banco=" + banco + "]";
    }

    public boolean adicionarUC(String c, UnidadeCurricular uc) {
        // verifica se a chave já existe, assim não sobrescreve o valor!
        if (!banco.containsKey(c)) {
            this.banco.put(c, uc);
            return true;
        }
        return false;
    }

    public boolean excluirUC(String c) {
        this.banco.remove(c);
        return true;
    }

    public void mostrarUCs() {
        if (this.banco.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada.");
            return;
        }

        System.out.println("=== Disciplinas Cadastradas ===");

        for (Map.Entry<String, UnidadeCurricular> entry : this.banco.entrySet()) {
            String codigo = entry.getKey();
            UnidadeCurricular uc = entry.getValue();

            System.out.println("Código: " + codigo);
            System.out.println("Nome: " + uc.getNome());
            System.out.println("Sigla: " + uc.getSigla());
            System.out.println("Créditos: " + uc.getCreditos());
            System.out.println("Ementa: " + uc.getEmenta());
            System.out.println("Objetivos: " + uc.obterObjetivo()); // colocar obter ou get???
            System.out.println("Conteúdos: " + uc.obterConteudo());
            System.out.println("-----");
        }
    }

    public boolean alteraUC(String codigoUc, int dado) {
        UnidadeCurricular uc = this.banco.get(codigoUc);

        if (uc == null) {
            System.out.println("Disciplina não encontrada.");
            return false;
        }

        Scanner teclado = new Scanner(System.in);

        switch (dado) {
            case 1:
                System.out.println("Entre com o novo nome da UC:");
                String novoNome = teclado.nextLine();
                uc.setNome(novoNome);
                break;

            case 2:
                System.out.println("Entre com o novo código da UC:");
                String novoCodigo = teclado.nextLine();
                uc.setCodigo(novoCodigo);
                break;

            case 3:
                System.out.println("Entre com a nova sigla da UC:");
                String novaSigla = teclado.nextLine();
                uc.setSigla(novaSigla);
                break;

            case 4:
                System.out.println("Entre com os novos créditos da UC:");
                int novosCreditos = teclado.nextInt();
                uc.setCreditos(novosCreditos);
                break;

            case 5:
                System.out.println("Entre com a nova ementa da UC:");
                String novaEmenta = teclado.nextLine();
                uc.setEmenta(novaEmenta);
                break;

            case 6:
                System.out.println("Entre com um objetivo da UC:");
                String novoObjetivo = teclado.nextLine();
                uc.adicionarObjetivo(novoObjetivo);
                break;

            case 7:
                /// adicionar a forma de adicionar mais de um conteúdo!!
                System.out.println("Entre com um conteúdo da UC:");
                String novoConteudo = teclado.nextLine();
                uc.adicionarConteudo(novoConteudo);
                break;

            default:

                /// deixar a op inváida aqui ou escrever no app???????w
                System.out.println("Opção inválida!");
                return false;
        }

        /// deixar aqui ou app??
        System.out.println("Dado da disciplina alterado!");
        return true;
    }

    public int menuDeOperacoes() {
        int opcao = 0;

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
                    // adicionar uma uc
                    teclado.nextLine(); // ??????

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
                    adicionarUC(codigo, uc);
                    break;

                case 2:
                    // remover uma UC
                    teclado.nextLine();

                    System.out.println("Entre com o nome da UC");
                    String codigoUc = teclado.nextLine();
                    excluirUC(codigoUc);
                    break;

                case 3:
                    // Alterar uma UC
                    teclado.nextLine();

                    System.out.print("Entre com o código da UC que deseja alterar: ");
                    String codigoUC = teclado.nextLine();

                    System.out.println("Entre com o tipo de dado que deseja alterar:");
                    System.out.println("1 - Nome");
                    System.out.println("2 - Código");
                    System.out.println("3 - Sigla");
                    System.out.println("4 - Créditos");
                    System.out.println("5 - Ementa");
                    System.out.print("Entre com uma opção: ");
                    int dado = teclado.nextInt();

                    boolean alterado = alteraUC(codigoUC, dado);
                    break;

                case 4:
                    // mostrar uma UC
                    System.out.println("Entre com o nome da UC");
                    codigoUc = teclado.nextLine();
                    banco.get(codigoUc);
                    break;

                case 5:
                    // mostrar todas as UCs
                    mostrarUCs();
                    break;

                case 6:
                    // sair
                    System.out.println("Fechando acesso ao sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        return opcao;
    }

    public static void main(String[] args) {

        App app = new App();

        // app.adicionarUC();

        app.menuDeOperacoes();

    }
}
