import java.util.Scanner;


public class MyDateTest1
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
   
     
      MyDate1 myDate = new MyDate1(day, month, year);
      ///DisplayDate
     
      String displayDate = day + "/" + month + "/" + year; 
      System.out.println("Date: " + displayDate);
   }

}
