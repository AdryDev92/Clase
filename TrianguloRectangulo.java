import java.util.Scanner;

public class TrianguloRectangulo{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int num, cont=0;

    System.out.println("Introduce un número:");
    num = input.nextInt();

    for (int i = 1; i <= num ; i++ )
    {
      for (int j = 1; j <= i ; j++ )
      {
        System.out.print("*");
      }
        System.out.println("");
    }

  }
}
