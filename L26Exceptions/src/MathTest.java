import java.util.Scanner;

public class MathTest
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Enter x: ");
      int x = scanner.nextInt();
      
      System.out.println("Enter y: ");
      int y = scanner.nextInt();
      
     
      System.out.println("x + y = " + (x + y));
      System.out.println("x - y = " + (x - y));
      
      try
      {
         y=0;
         System.out.println("x / y = " + (x / y));
      }
      catch (Exception e)
      {
         System.out.println("Y can not be zero");
      }
      
      System.out.println("x * y = " + (x * y));
   }
}