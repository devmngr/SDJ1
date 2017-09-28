package ex2;
import java.util.GregorianCalendar;

public class MyDate
{
   private int day;
   private int month;
   private int year;

   public MyDate(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public int getDay()
   {
      return day;
   }

   public int getMonth()
   {
      return month;
   }

   public int getYear()
   {
      return year;
   }

   public void set(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public MyDate copy()
   {
      return new MyDate(day, month, year);
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof MyDate))
      {
         return false;
      }
      MyDate other = (MyDate) obj;
      return day == other.day && month == other.month && year == other.year;
   }

   public String toString()
   {
      return "Rented from: " + day + "/" + month + "/" + year;
   }
   
   public MyDate now()
   {
      GregorianCalendar currentDate = new GregorianCalendar();
      int currentDay = currentDate.get(GregorianCalendar.DATE);
      int currentMonth = currentDate.get(GregorianCalendar.MONTH);
      int currentYear = currentDate.get(GregorianCalendar.YEAR);
      MyDate Current = new MyDate(currentDay, currentMonth, currentYear);
      return Current;
   }

}
