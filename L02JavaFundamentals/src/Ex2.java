import java.util.*;

public class Ex2
{

   public static void main(String[] args)
   {
      //
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter x: ");
      int x = keyboard.nextInt();
      
      System.out.print("Enter y: ");
      int y = keyboard.nextInt();
      
      System.out.print("Enter z: ");
      int z = keyboard.nextInt();
      
      
      int sum = x + y + z;
      int product = x * y * z;
      
      //
      System.out.print("Sum: " + sum + "\n"
                 + "Product: " + product);
      

   }

}
