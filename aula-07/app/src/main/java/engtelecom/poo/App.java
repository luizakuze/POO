
package engtelecom.poo;


public class App {

    public static void main(String[] args) {
        Caneta[] canetas = new Caneta[5];


        for (int i = 0; i < canetas.length; i++) {
            canetas[i] = new Caneta();
        }

        // atribuindo cores
        canetas[0].setCor("azul");
        canetas[1].setCor("verde");
        canetas[2].setCor("rosa");
        canetas[3].setCor("amarela");
        canetas[4].setCor("vermelha");

        // atribuindo nível de tinta
        canetas[0].setNivelTinta(100);
        canetas[1].setNivelTinta(100);
        canetas[2].setNivelTinta(100);
        canetas[3].setNivelTinta(100);
        canetas[4].setNivelTinta(100);

        // teste caneta[0]
        canetas[0].desenhar(2);    
        System.out.println(canetas[0].getNivelTinta());
        System.out.println(canetas[0].getCor());


    }
}