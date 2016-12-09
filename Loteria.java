import java.util.Arrays;


public class Loteria {
    public static void main(String[] args){

        int [] ganador = {7,3,18,1,40,33};
        int[][] apuestas  = new int[10][6];

        for (int i = 0; i < apuestas.length; i++) {
            for (int j = 0; j < apuestas[i].length ; j++) {

                int valor = (int)(1+Math.random()*48);
                    apuestas[i][j] = valor;
            }
            Arrays.sort(apuestas[i]);
        }

        for (int i = 0; i < apuestas.length; i++) {
            for (int j = 0; j < apuestas[i].length; j++) {
                System.out.printf("%3d", apuestas[i][j]);
            }

            System.out.println();
        }
    }

    static void showMeTheArray(int apuesta[]){
        for (int i = 0; i < apuesta.length; i++) {
            System.out.printf("%3d", apuesta[i]);
        }
        System.out.println();
    }

    static boolean arrayContiene(int apuesta[], int numero){
        for(int i=0 ; i < apuesta.length; i++){
            if (apuesta[i] == numero){

            }
        }
        return false;
    }
}
