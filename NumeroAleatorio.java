import java.util.Random;

public class NumeroAleatorio{
  public static void main(String[] args) {

    Random numero = new Random();

    System.out.println("Número aleatorio entre 1 y 100: " + numero.nextInt(101));

  }
}
