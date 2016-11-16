import java.util.Scanner;

public class DiaSemana
{
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);
    int num;
    

    System.out.println("Introduce un numero entre 1 y 7:\n");
    num = input.nextInt();

    switch (num) {
      case 1:
        System.out.println("\nLunes");
        break;
        case 2:
          System.out.println("\nMartes");
          break;
          case 3:
            System.out.println("\nMiercoles");
            break;
            case 4:
              System.out.println("\nJueves");
              break;
              case 5:
                System.out.println("\nViernes");
                break;
                case 6:
                  System.out.println("\nSabado");
                  break;
                  case 7:
                    System.out.println("\nDomingo");
                    break;
                    default:
                      System.out.println("\nNo estas en el rango correcto pichita");
                      break;
    }


  }
}
