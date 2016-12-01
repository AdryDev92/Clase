import java.util.Scanner;

public class dni {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num, letra;
		
		char [] dni = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		System.out.println("Introduce DNI:");
		num = input.nextInt();
		
		letra = dni[num % 23];
		
			System.out.println("" + num + (char)letra);
		
	}
}
