import java.util.*;
public class Array {
	  public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	double respuesta;
	
	
	String[] pregunta = new String[5];
	pregunta[0] = "Eeeeeehhh";
	pregunta[1] = "Si pero no";
	pregunta[2] = "Dejame que lo compruebe";
	pregunta[3] = "Puede que si puede que no";
	pregunta[4] = "Otro ejemplo";
	
	System.out.println("Juaaaan. ¿Puedo hacerte una pregunta?");
	input.nextLine();
	
	respuesta = Math.random()* pregunta.length+0;
	System.out.println(pregunta[(int) respuesta]);
	
	  }
	}
