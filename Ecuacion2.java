import java.util.Scanner;

public class Ecuacion {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);	//Objeto de tipo Scanner

        double a, b, c, discriminante, x1, x2;	//Variables

        System.out.print("Ingrese el valor de a: ");
        a = in.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b = in.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        c = in.nextDouble();

        //Condicional para que se resuelva la ecuación
        discriminante=b*b-4.0*a*c;
        if(discriminante<0)
        {
            System.out.println("soluciones imaginarias");
            discriminante=-discriminante;
        }
        else
            System.out.println("soluciones reales");
        x1=(-b+Math.sqrt(discriminante))/2.0/a;
        x2=(-b-Math.sqrt(discriminante))/2.0/a;
        System.out.println("Valor de discriminante: " + discriminante);
        System.out.println("Valor de x1: " + x1);
        System.out.println("Valor de x2: " + x2);
    }

}