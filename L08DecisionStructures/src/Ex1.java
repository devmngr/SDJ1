import java.util.Scanner;


public class Ex1
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      
      while (true)
      {
      System.out.println("Enter a number within the range 1-10:");
      int number = keyboard.nextInt();
      
    
      if (number ==1)
      {
         System.out.println("Roman number for 1 is: I");
      }
      else if (number ==2)
      {
         System.out.println("Roman number for 1 is: II");
      }
      else if (number ==3)
      {
         System.out.println("Roman number for 1 is: III");
      }
      else if (number ==4)
      {
         System.out.println("Roman number for 1 is: IV");
      }
      else if (number ==5)
      {
         System.out.println("Roman number for 1 is: V");
      }
      else if (number ==6)
      {
         System.out.println("Roman number for 1 is: VI");
      }
      else if (number ==7)
      {
         System.out.println("Roman number for 1 is: VII");
      }
      else if (number ==8)
      {
         System.out.println("Roman number for 1 is: VIII");
      }
      else if (number ==9)
      {
         System.out.println("Roman number for 1 is: IX");
      }
      else if (number ==10)
      {
         System.out.println("Roman number for 1 is: X");
      }
      else 
      {
         System.out.println("Error");
      }
      }
   }

}
