import java.util.Scanner;


public class Ex6
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter valuea for a: ");
      double a = keyboard.nextDouble();
      
      System.out.println("Enter valuea for b: ");
      double b = keyboard.nextDouble();
      
      System.out.println("Enter valuea for c: ");
      double c = keyboard.nextDouble();
      
      double D = b*b - 4*a*c;
      
      double x = -2/(2*a);
      double x1 = (-b + Math.sqrt(D)/ (2*a));
      double x2 = (-b - Math.sqrt(D)/ (2*a));
      
      System.out.println("D = " + D);
      
      if (D<0)
      {
         System.out.println("There is no solutio!");
      }
      else if (D==0)
      {
         System.out.println("There is one solution \nx=" + x);
      }
      
      
      //D>0
      else
      {
         System.out.print("There are two solutions \nx1 = " + x1 + "\nx2 = " + x2);
      }
   }

}
