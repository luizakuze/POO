package engtelecom.poo;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

//        // Objeto da classe Scanner, ele lê bytes
//        // System.in = Pegar os bytes do teclado
//        Scanner teclado = new Scanner (System.in);
//
//        System.out.print("Entre com o seu nome: ");
//        String nome = teclado.nextLine();
//
//        System.out.println("Bom dia, " + nome);
//
//        System.out.println("Entre com o ano do seu nascimento: ");
//        int ano = teclado.nextInt();
//
//        System.out.println("Você tem " + (2023-ano) + " anos");

//          Scanner teclado = new Scanner (System.in);
//
//          // 10/agosto/2023
//          System.out.print("Entre com o uma data (dd/MM/aaaa): ");
//          String data = teclado.nextLine();
//
//          // verdade se a string for vazia
//          if (!data.isBlank()) {
//
//              // para fatiar a string e criar um vetor
//              String[] v = data.split("/");
//
//              // comparar strings (diferente de == (?))
//              //agosto.equals(v[1])
//              //v[1].equals("agosto") || v[1].equals("ago")
//              if (v[1].contains("ago")) {
//                  System.out.println("8");
//              } else {
//                  System.out.println("Mês errado");
//              }
//          }

        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(10) + 1; // bound(0 a 9) e soma + 1

        System.out.print("Entre com um número (0 a 10): ");
        int n = teclado.nextInt();

        while (num != n) {
           System.out.println("Errou");
           n = teclado.nextInt();
        }

        System.out.println("Parabéns");

    }
}
