import java.util.*;


public class vector {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numMayor=0;
        int matriz[] = new int[10];
        int posicion = 0;


        for (int i = 0; i < matriz.length; i++) {

                System.out.println("Introduce 10 numeros:");
                matriz[i] = input.nextInt();

                if (matriz[i] > numMayor){
                    numMayor=matriz[i];
                    posicion = i;
                }
        }

        for (int i = 0; i < matriz.length; i++) {
                System.out.println(matriz[i]);
            }

        System.out.println("El numero mayor es " + numMayor + " y esta en la posición " + "[" + posicion + "]");
    }
}
