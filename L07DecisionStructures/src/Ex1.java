import java.util.Scanner;


public class Ex1
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter age: ");
      int age = keyboard.nextInt();
      
      if (age < 0)
      {
         System.out.println("Eror in age value");
         
      }
      else if (age >= 0 && age <= 12)
      {
         System.out.println("Child");
      }
      else if (age >= 13 && age <= 19)
      {
         System.out.println("Teenager");
      }
      else if (age >=20 && age <=65)
      {
         System.out.println("Adult");
      }
      else if (age > 65)
      {
         System.out.println("Senior citizen");
      }
      
      
      
      
      
   }

}
