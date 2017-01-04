import java.util.Scanner;
import java.util.Random;

    public class NumerosPrimos {
        public static void main(String[] args) {

            Random rnd = new Random();
            Scanner input = new Scanner(System.in);
            int num, cont=0;
            int var;

            System.out.println("Introduce tamaño del array");
            num = input.nextInt();

            int[] numPrimo = new int[num];

            for (int i = 0; i < numPrimo.length; i++) {
                numPrimo[i] = rnd.nextInt(11);
            }


            for (int i = 0; i < numPrimo.length; i++) {
                var = numPrimo[i];
                esPrimo(var);

             if (esPrimo(var)==false){
                 System.out.println("La posición [" + i + "] con el numero " + numPrimo[i] + " no es primo");
             }else{
                 System.out.println("La posición [" + i + "] con el numero " + numPrimo[i] + " es primo");
             }
            }
        }

        static public boolean esPrimo(int var){
            boolean resultado;
            int cont=0;

            for (int i = 1; i < var; i++) {
                if (var % i==0){
                    cont++;
                }
            }
            if (cont!=1){
                resultado = false;
            }else {
                resultado = true;
            }
            return resultado;
        }

        }
