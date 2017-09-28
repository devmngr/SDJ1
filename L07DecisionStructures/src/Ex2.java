import java.util.Scanner;


public class Ex2
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter gender Male or Feamle:");
      String gender = keyboard.next();
      char gen = gender.charAt(0);
      
      System.out.println("Enter age:");
      int age = keyboard.nextInt();

      
      if (gen != 'M' && gen !='F' || age <0)
      {
         System.out.println("Eror in typed values");
      }
      
    //Man
      else if (gen == 'M' && age <18)
      {
         System.out.println("Boy");
      }
      
      else if (gen == 'M' && age >= 18)
      {
         System.out.println("Man");
      }
      //Female
      else if (gen =='F' && age < 18)
      {
         System.out.println("Girl");
      }
      else if (gen == 'F' && age >= 18)
      {
         System.out.println("Woman");
      }


         
   }

}
