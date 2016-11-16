import java.util.Scanner;   // importa el codigo de la clase Scanner //

public class EntradaTeclado
 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);   //objeto que lee los datos que entran por teclado//

		int entero;  
		double real;     //variables//
		String nombre;

		System.out.println("Introduce un nombre: ");  //introduce datos de tipo String//
		nombre = input.nextLine();

		System.out.println("Introduce un entero: ");  //introduce dato de tipo entero//
		entero = input.nextInt();

		System.out.println("Introduce un real: ");    //introduce dato de tipo double//
		real = input.nextDouble();


		
		System.out.println("Entero: " + entero);   
		System.out.println("Real: " + real);		//muestra los datos introducidos//
		System.out.println("nombre: " + nombre);
	}
}