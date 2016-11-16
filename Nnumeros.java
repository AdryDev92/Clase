import java.util.Scanner;

public class Nnumeros {
  public static void main(String[] args){
      Scanner input =  new Scanner(System.in);

      int num;
      int suma=0;
      int cont;

      System.out.println("Introduzca numero ");
      num = input.nextInt();
      cont=num-1;
      suma=suma+num;

      while (cont!=0){
        suma=suma+cont;
        cont--;
          }
    System.out.println("La suma total es: "+ suma);
    }
}
