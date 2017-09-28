import java.util.Scanner;

public class Ex1
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter an int: ");
      int n = keyboard.nextInt();

      for (int i = 0; i <= n; i++)
      {

         System.out.print(i + " ");
      }
      System.out.println();
      
      for (int j = 0; j <= 2 * n; j += 2)
      {
         System.out.print(j + " ");
      }
      System.out.println();

      for (int k = 1; k <= n; k ++)
      {
         System.out.print(k*k + " ");
      }

   }
}
