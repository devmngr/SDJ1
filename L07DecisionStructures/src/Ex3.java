import java.util.Scanner;


public class Ex3
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
     
      System.out.println("Enter Danish grade:");
      int grade = keyboard.nextInt();
      
      if (grade == 12)
      {
         System.out.println("International grade is A");
      }
      else if (grade == 10)
      {
         System.out.println("International grade is B");
      }
      
      else if (grade == 7)
      {
         System.out.println("International grade is C");
      }
      
      else if (grade == 4)
      {
         System.out.println("International grade is D");
      }
      else if (grade == 2)
      {
         System.out.println("International grade is E");
      }
      else if (grade == 0)
      {
         System.out.println("International grade is Fx");
      }
      else if (grade == -3)
      {
         System.out.println("International grade is F");
      }
      else
      {
         System.out.println("Grade entered is not a valid grade!");
      }






   }

}
