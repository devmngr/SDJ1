import java.util.*;


public class Ex4
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter your name: ");
      String name = keyboard.nextLine();
      
    
      
      System.out.print("Enter your age: ");
      int age = keyboard.nextInt();
      
      keyboard.nextLine();
      
      
      System.out.print("Enter your address: ");
      String address = keyboard.nextLine();
      
      
      System.out.print("Name: " + name + "\n" 
               + "Age: " + age + "\n"
               + "Address: " + address);

   }

}
