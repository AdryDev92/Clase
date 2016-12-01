package fibonacci;
import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n;
		
		int fib[];
		
		System.out.println("Introduce un número:");
		n = input.nextInt();
		
		fib = new int[n];		//array definido por el numero introducido por teclado
		
		if (n == 1) {
			System.out.println(1);		//Si se escribe 1, ya no se ejecuta más
		}else if (n == 0){
			System.out.println(0);		//Si se escribe 0, no ejecuta mas
		
		} else {
			fib[0] = 1;
			fib[1] = 1;
				
			System.out.printf(fib[0] + " ");	//imprime los dos primeros 1
			System.out.printf(fib[1] + " ");
				
			for (int i = 2; i < fib.length; i++) {
				fib[i] = fib[i-1] + fib[i-2];
				System.out.printf (fib[i] + " ");
			}
		}
		
	}
}
