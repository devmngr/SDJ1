import java.util.Scanner;


public class MyDateTest
{

   public static void main(String[] args)
   {
      MyDate myDate = new MyDate();
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter day number: ");
      int day = keyboard.nextInt();
      myDate.setDay(day);
      
      System.out.println("Enter month number: ");
      int month = keyboard.nextInt();
      myDate.setMonth(month);
      
      System.out.println("Enter year: ");
      int year = keyboard.nextInt();
      myDate.setYear(year);
     
      
      ///DisplayDate
     
      String displayDate = day + "/" + month + "/" + year; 
      System.out.println("Date: " + displayDate);
   }

}
