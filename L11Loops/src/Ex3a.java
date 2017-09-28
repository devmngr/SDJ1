import java.util.Scanner;


public class Ex3a
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      double n = 1;
      double p = 0;
      double count=0;
      
      while(p<100)
      {
         System.out.println("Enter number: ");
         
         
         
         for(double i=p;i<100;i++)
         {n = keyboard.nextDouble();
            p=n*10;
            count++;
            System.out.println("aaa" + count++ + "aaa"+ p);
         }
      }

   }

}
