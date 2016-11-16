import java.util.Scanner;

public class Notas
  public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);

      System.out.println("Introduce la nota: ");
      String nota = input.next();

      switch ( nota ) {

        case "10":
            System.out.println("NASA engineer");
            break;
        case "9":
            System.out.println("Google engineer");
            break;
        case "8":
        case "7":
            System.out.println("Facebook engineer");
            break;
        case "6":
            System.out.println("Apple engineer");
            break;
        case "5":
            System.out.println(" Technician ADA-ITS");
            break;
        case "4":
        case "3":
            System.out.println("Microsoft engineer");
            break;
        case "2":
        case "1":
            System.out.println("Samsung Galaxy Note 7 engineer");
        case "0":
      }








  }
