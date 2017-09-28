import java.util.Scanner;

public class leapYearCountWithScanner
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      MyDate leap = new MyDate(1, 1, 1);
      int count = 0;

      System.out.println("Enter start year: ");
      int i = keyboard.nextInt();
      leap.setYear(i);

      System.out.println("Enter end year: ");
      int j = keyboard.nextInt();
      leap.setYear(j);

      for (int year = i; year<= j; year++)
      {
         leap.setYear(year);

         if (leap.isLeapYear() == true)
         {
            count++;
         }
      }
      System.out.print(count);

   }

}
