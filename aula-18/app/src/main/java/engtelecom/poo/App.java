/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import javax.sound.midi.Soundbank;

public class App {

    // public static final int DOMINGO = 0;

    // public static final int DOM = 0;
    // public static final int SEG = 1;
    public static void main(String[] args) {

        ArrayList<Carta> baralho = new ArrayList<>();

        for (Valor v : Valor.values()) {
            // retira 10, 9 e 8
            if (v.simbolo != "8" && v.simbolo != "9" && v.simbolo != "10") {
                for (Naipe n: Naipe.values()) {
                    baralho.add(new Carta(n, v));
                }
            }

        }

        // imprimindo baralho organizado
        for (Carta c: baralho) {
            System.out.printf(c + ",");
        }

        // obtendo números de cartas
        Random r = new Random();

        Carta c1 = baralho.get(r.nextInt(39) + 1);
        Carta c2 = baralho.get(r.nextInt(39) + 1);

        System.out.println();
        System.out.println(c1);
        System.out.println(c2);

        // se os naipes forem diferentes,
        if (c1.getNaipe() != c2.getNaipe()){

            //...analisa pelo valor da carta
            if (c1.getValor().valor > c1.getValor().valor) {
                System.out.println("C1 maior");
            } else {
                System.out.println("C2 maior");
            }    
        } else {

            // se não, analisa pelo naipe
            if (c1.getNaipe().valor > c1.getNaipe().valor) {
                System.out.println("C1 maior");
            } else{
                System.out.println("C2 maior");
            } 
        } 





        // System.out.println();
        
        // // embaralhar baralho
        // Collections.shuffle(baralho);

        // // imprimindo baralho embaralhado
        // for (Carta c: baralho) {
        //     System.out.printf(c + ",");
        // }











        // Carta c = new Carta(Naipe.OURO, Valor.AS);
        // System.out.println(c); // AS de ouro
        // System.out.println(new Carta(Naipe.PAUS, Valor.VALETE));
        // System.out.println(new Carta(Naipe.ESPADA, Valor.DAMA));
        // System.out.println(new Carta(Naipe.COPA, Valor.REI));













        // int[] arquivo = {0, 0, 1, 1, 2};

        // DiasDaSemana dia;
        // //equivalente a linha abaixo, mas atende somente um dia da semana
        // // if (arquivo[0] == DiasDaSemana.DOMINGO.codigo) {
        // //     dia = DiasDaSemana.DOMINGO;
        // // }

        // dia = DiasDaSemana.getByCodigo(arquivo[0]);
            //colocar um while p percorrer todo mapa do jogo

        // int[] poo = {2, 4};

        // DiasDaSemana[] aulas = {DiasDaSemana.TERCA, DiasDaSemana.DOMINGO};

        // // int aula = DOMINGO; // ok
        // // aula = -400; // não desejado

        // DiasDaSemana aulaPOO = DiasDaSemana.QUINTA;
        // // aulaPOO = -500; //não pode, é ENUM

        // DiasDaSemana aula = DiasDaSemana.QUINTA;
        // // aula = 10; ENUM!! não tem como

        // switch (aula) {
        //     case DOMINGO:
        //         System.out.println("não tem aula");
        //         break;
        //     case SEGUNDA:
        //         System.out.println("não tem aula");
        //         break;
        //     case TERCA:
        //         System.out.println("tem aula");
        //         break;
        //     // case 1; é ENUM, não tem como
        //     default:
        //         break;
        // }

        // // na matriz de inteiros dá de usar enum, tijolo do tipo 1, 2 ou 3
        // // enum TIJOLO1, TIJOLO2, VAZIO







    }
}
