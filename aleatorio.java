import java.util.Scanner;
import java.util.Random;

public class aleatorio
{
    public static void main(String[] args)
    {
        int num;
        int rnd;
        int intentos = 1;

        Random juego = new Random();
        Scanner input = new Scanner(System.in);

        rnd = juego.nextInt(10) + 1;

        System.out.println("Se ha generado un número aleatorio entre 1 y 10");
        System.out.println("Tienes 5 intentos para acertar el número\n!Suerte!");
        num = input.nextInt();

        while (num != rnd) {

            if ( num < rnd) {
                System.out.println("Es mayor");
            }
            if (num > rnd) {
                System.out.println("Es menor");
            }

            System.out.println("introduce un numero");
            num = input.nextInt();
            intentos++;
        }
        System.out.println("!Enhorabuena!, has acertado.");

        System.out.println("Has utilizado: " + intentos + " intentos");

        if (intentos == 1){
            System.out.println("100 puntos");
        }else if (intentos == 2){
            System.out.println("80 puntos");
        }else if (intentos == 3){
            System.out.println("50 puntos");
        }else if (intentos == 4){
            System.out.println("20 puntos");
        }else if (intentos == 5){
            System.out.println("Dedícate a otra cosa");
        }else if (intentos >= 6) {
          System.out.println("!Te has pasao pichita!");
          System.exit(0);
        }
    }
}
