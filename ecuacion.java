import java.util.*; 

class ecuacion 
{ 
static Scanner teclado = new Scanner(System.in); 
public static void main(String main[]) 
{ 
System.out.println("Dime un valor de a..."); 
double a=teclado.nextDouble();

System.out.println("Dime un valor de b..."); 
double b=teclado.nextDouble();

System.out.println("Dime un valor de c..."); 
double c=teclado.nextDouble();

if(b*b<4*a*c){ 
System.out.println("Solucion perteneciente al campo de los numeros complejos."); 
} 
else if(a!=0&&b*b>4*a*c){ 
System.out.println("La primera solucion es "+(-b+Math.sqrt(b*b-4*a*c))/(2*a)); 
System.out.println("La segunda solucion es "+(-b-Math.sqrt(b*b-4*a*c))/(2*a)); 
} 
else { 
System.out.println("Esta ecuacion no es de segundo grado."); 
} 
teclado.close(); 
} 
}