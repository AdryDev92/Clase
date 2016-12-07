import java.util.Scanner;

/***********************************************
 * PSEUDOCÓDIGO
 *
 * Programa Cifras y Asteriscos
 * Descripción: Enunciado EJEV02
 * Constantes:
 *     -
 * Variables:
 *     Entero: numero, digito, suma, cifras
 *     Real: media
 * Inicio
 *     suma = 0
 *     cifras = 0
 *
 *     Leer numero
 *
 *     Repetir
 *         digito = numero % 10;
 *         Imprimir digito + ": "
 *         suma = suma + digito
 *
 *         Si (digito == 0) Entonces:
 *             Imprimir "cero"
 *         SiNo
 *             Desde i=0 Hasta i<digito (Salto 1)
 *                 Imprimir "*"
 *             FinDesde
 *         FinSi
 *
 *         Imprimir Salto_de_línea
 *
 *         numero = numero / 10
 *         cifras = cifras + 1
 *     Mientras (numero!=0)
 *
 *     media = (real) suma / cifras
 *
 *     Imprimir "Cifras: " + cifras
 *     Imprimir "Media cifras: " + media
 * Fin
 */
public class Main {

    public static void main(String[] args) {
        // Declaración de variables
       Scanner input = new Scanner(System.in);
        int numero, digito, suma=0, cifras=0;
        double media;

        // Lectura del dato de entrada
        do{
            System.out.println("Introducir un número entero: ");
            numero = input.nextInt();
            if (numero < 0){
                System.out.println("El número no es correcto. Debe ser un número positivo.");
            }
        }while(numero<0);


        // Repetiremos el proceso mientras haya cifras
        do{
            // Para extraer la cifra menos relevante
            // Calculamos el módulo 10 del dato de entrada
            digito = numero % 10;
            System.out.print(digito+": ");
            // Una vez calculada la cifra se imprime
            suma+=digito;

            // Comprobamos si es un cero en cuyo caso se imprime
            // Si no se hace un bucle para imprmir los asteriscos
            if(digito == 0){
                System.out.printf("cero");
            }else{
                for (int i = 0; i < digito; i++) {
                    System.out.print("*");
                }
            }

            System.out.println();

            // Una vez procesada la cifra menos relevante
            // se elimina del número haciendo una división
            // entera entre 10
            numero /= 10;

            // Se incrementa la cifra
            cifras++;
        }while(numero!=0);
        // Cálculo de la media
        if(cifras!=0){
            media = (double)suma / cifras;
        }else{
            media = 0;
        }

        // Immpresión de resultados finales
        System.out.println("Cifras: " + cifras);
        System.out.println("Media cifras: " + media);
    }
}
