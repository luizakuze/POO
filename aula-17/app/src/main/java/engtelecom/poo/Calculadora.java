package engtelecom.poo;

/**
 * Classe utilitária para realizar cálculos
 */
public class Calculadora {
    
    /**
     * Faz a soma de dois parâmetros que foram informados
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da soma
     */
    public static int soma (int a, int b) { 
        return a+b;
    }

    /**
     * Irá retornar uma String informando o tipo do triângulo de acordo
     * com as dimensões dos lados
     * @param ladoA dimensão do ladoA
     * @param ladoB dimensão do ladoB
     * @param ladoC dimensão do ladoC
     * @return "Equilátero" para 3 lados iguais. "Escaleno" para 3 lados diferentes.
     * "Isósceles" para 2 lados iguais. "Não é um triângulo" se os valores informados
     * não forem um triângulo.
     */
    public static String tipoDoTriangulo(int ladoA, int ladoB, int ladoC){

        if (ladoA > 0 && ladoB > 0 && ladoC > 0) {

            if ((ladoA + ladoB > ladoC) && (ladoB + ladoC > ladoA)) {

            }


        } 


    return "não implementado";
    }
}
