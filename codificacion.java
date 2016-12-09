import javax.swing.*;

public class codificacion {

	public static void main(String[] args) {
		
		char letra;
		String frase,frase2="";
		
		frase=JOptionPane.showInputDialog("Introduce una frase:");
		
		for (int j = 0; j < frase.length(); j++) {
			letra = frase.charAt(j);
			
			if (letra=='a') {
				letra = '1';
			}
			if (letra=='e') {
				letra = '2';
			}
			if (letra=='i') {
				letra = '3';
			}
			if (letra=='o') {
				letra = '4';
			}
			if (letra=='u') {
				letra = '5';
			}
			frase2 = frase2+letra;
		}
	System.out.println(frase2);
	}

}
