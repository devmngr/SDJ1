import java.util.Scanner;


public class MyDateTest
{

   public static void main(String[] args)
   {
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter day number: ");
      int day = keyboard.nextInt();

      
      System.out.println("Enter month number: ");
      int month = keyboard.nextInt();
      
      System.out.println("Enter year: ");
      int year = keyboard.nextInt();
   
     
      MyDate myDate = new MyDate(day, month, year);
      ///DisplayDate
     
      String displayDate = day + "/" + month + "/" + year; 
      System.out.println("Date: " + displayDate);
      
      System.out.println("Year is a leap year: " + myDate.isLeapYear());
   }

}
