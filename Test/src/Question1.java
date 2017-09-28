import java.util.Scanner;


public class Question1
{

   public static void main(String[] args)
   {
     
      

      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter an integer: ");
      int x = keyboard.nextInt();
      
      System.out.println("Enter second integer: ");
      int y = keyboard.nextInt();
      
      System.out.println("Enter third integer: ");
      int z = keyboard.nextInt();
      
      int sum = x + y;
      int product = x * y;
      double division = y / z;
      int difference = y - z;
      
      System.out.println("Sum: (" + x + "+" + y + ")" + "= " + sum);
      System.out.println("Product: (" + x + "*" + y + ")" + "= " + product);
      System.out.println("Division: (" + y + "/" + z + ")= " + division);
      System.out.println("Difference: (" + y + "/" + z + ")=" + difference);
      
      
      
      
   }

}
