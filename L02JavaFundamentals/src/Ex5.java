import java.util.Scanner;


public class Ex5
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter test score 1:");
      double x = keyboard.nextDouble();
      
      System.out.print("Enter test score 2: ");
      double y = keyboard.nextDouble();
      
      System.out.print("Enter test score 3: ");
      double z = keyboard.nextDouble();
      
      double avarage = (x + y + z)/3;
      
      
      System.out.print("Test1: " + x + "\n"
                  + "Test2: " + y + "\n"
                  + "Test3: " + z + "\n"
                  + "Avarage: " + avarage);
      
      

   }

}
