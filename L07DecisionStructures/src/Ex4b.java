import java.util.Scanner;


public class Ex4b
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
         System.out.println("Numbers from big to small: \n" + x + " , " + y);
          
      }
      else if (y<x)
      {
         System.out.println("Numbers from big to small: \n" + y + "," + x);

      }
   }
   
   
   

}
