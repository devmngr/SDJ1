import java.util.Scanner;


public class MyDateTest
{

   public static void main(String[] args)
   {
      //Equals method
      MyDate Date1 = new MyDate(11,8, 1992);
      MyDate Date2 = new MyDate(11,8,1992);
      
      if(Date1.equals(Date2))
      {
         System.out.println("Date is equal!");
      }
      else
      {
         System.out.println("DAte is different!");
      }
      
      //Copy method
      
      
      
   }

}
