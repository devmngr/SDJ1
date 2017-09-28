import java.util.Scanner;


public class Ex4c
{

   public static void main(String[] args)
   {
      
      Scanner keyboard = new Scanner(System.in);
     
      System.out.println("Enter three different numbers!");
      System.out.println("Enter first number: ");
      double x = keyboard.nextDouble();
      System.out.println("Enter second number: ");
      double y = keyboard.nextDouble();
      System.out.println("Enter third number: ");
      double z = keyboard.nextDouble();
      
      //x first
      if (x<y && y<z)
      {
         System.out.println( x + "<"+ y + "<" +z);
      }
      else if(x<z && y>z)
      {
         System.out.println(x+ "<" + z + "<" + y);
      }
      
      //y first
      else if(y<z && z<x)
      {
         System.out.println(y + "<"+ z + "<"  + x);
      }
      else if (y<x && z>x)
      {
         System.out.println(y +"<" + x + "<" + z);
      }
      
      //z first
      else if (z<x && x<y)
      {
         System.out.println( z + "<"+ x + "<" + y);
      }
      else if (z<y && x>y)
      {
         System.out.println( z + "<"+ y + "<" + x);
      }
      
      else
      {
         System.out.println("Invalid value entered!!!");
      }
   }
   
   
   

}
