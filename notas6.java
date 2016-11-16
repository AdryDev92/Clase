import java.util.Scanner;

public class notas6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //variables
        int num, suma=0, si, no;
        String respuesta;

        //Algoritmo
        do {
              System.out.println("Introduce un numero:");
                num = input.nextInt();
              suma=num+suma;

              System.out.println("suma: " + suma);
              System.out.println("Continuar: si / no");
                respuesta = input.next();

              if (respuesta.equals("no")) {
              System.exit(0);
              }

          } while (suma>0);
    }
}
