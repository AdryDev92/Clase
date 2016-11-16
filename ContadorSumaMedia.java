import java.util.Scanner;
public class ContadorSumaMedia {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //variables
        int acumulador=0 , media=0, cont=0;
        int num;

        //bucle
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Teclea un número:");
            num=input.nextInt();

            cont++;
            acumulador=acumulador+num;
            media=acumulador / num;
        }

        //Pantalla
        System.out.println("La suma de los números da: " + acumulador);
        System.out.println("La media es: " + media);
        System.out.println("Has contado: " + cont + " números");
    }
}
