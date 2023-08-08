public class OlaMundo {

    public static void main(String[] args) {

        // Imprimindo na tela
        //System.out.println("Olá mundo");
        //System.out.print("Hello World\n");

        // if (args.length > 0) {
        //     System.out.println("Olá " + args[0]);
        // } else {
        //     System.out.println("Olá mundo");
        // }

        // Classes em letra maiúscula
        // String s;
        // double d;
        // Double dd;

        // d = Math.pow(2,3);
        // double p = Math.round(5.5);
        // double raiz = Math.sqrt(4);

        if (args.length == 3 ) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[2]);
            double resultado; 

            switch (args[1]) {
                case "+": 
                    resultado = (double) a + b;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "-": 
                    resultado = (double) a - b;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "x": 
                    resultado = (double) a * b;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "/": 
                    resultado = (double) a / b;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "^":
                    resultado = Math.pow(a,b);
                    System.out.println("Resultado: " + resultado);
                    break;
                default: 
                    System.out.println("Operador inválido");
                
            }

        } else {
            System.out.println("Sintaxe errada");
        }
    }
}
