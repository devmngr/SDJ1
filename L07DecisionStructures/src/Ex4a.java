import java.util.Scanner;


public class Ex4a
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter first number: ");
      double x = keyboard.nextDouble();
      System.out.println("Enter second number: ");
      double y = keyboard.nextDouble();
   
      if (x <y)
      {
         System.out.println("Smallest number: " + x);
          
      }
      else if (y<x)
      {
         System.out.println("Smallest number: " + y);

      }
   }
   
   
   

}
