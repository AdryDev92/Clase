import java.util.Scanner;
public class Decreciente
{
    public static void main(String[] args)
    {
      int cont=201;

        for (int i=201;i>0 ;i-- ) {

            cont--;
            if (cont % 2==0)
            {
              System.out.println(cont);
            }
        }
    }
}
