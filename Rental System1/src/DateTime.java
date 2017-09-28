
import java.util.GregorianCalendar;

public class DateTime
{
   private int day;
   private int month;
   private int year;
   private int hour;
   private int minute;
   private int second;
   
   ///For rental
   public DateTime(int day, int month, int year, int hour, int minute, int second)
   {
      this.day=day;
      this.month =month;
      this.year=year;
      this.hour=hour;
      this.minute=minute;
      this.second=second;
   }
   
   //for Customer
   public DateTime(int day, int month, int year)
   {
      this.day=day;
      this.month=month;
      this.year=year;
      this.hour=0;
      this.minute=0;
      this.second=0;
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
   public String getMonthName()
   {
      switch (month)
      {
         case 1:
            return "January";
         case 2:
            return "February";
         case 3:
            return "March";
         case 4:
            return "April";
         case 5:
            return "May";
         case 6:
            return "June";
         case 7:
            return "July";
         case 8:
            return "August";
         case 9:
            return "September";
         case 10:
            return "October";
         case 11:
            return "November";
         case 12:
            return "December";

         default:
            return "Invalid Month";
      }

   }
   public boolean isLeapYear()
   {
      if (year % 4 == 0 && year % 100 != 0 || year % 4 == 0 && year % 100 == 0
            && year % 400 == 0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public int daysInMonth()
   {
      if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
            || month == 10 || month == 12)
      {
         return 31;
      }
      else if (month == 4 || month == 6 || month == 9 || month == 11)
      {
         return 30;
      }
      else
      {
         if (isLeapYear())
         {
            return 29;
         }
         else
         {
            return 28;
         }
      }
   }
   
   public void nextDay()
   {
      day++;

      if (day > daysInMonth())
      {
         day = 1;
         month++;
      }

      if (month > 12)
      {
         month = 1;
         year++;
      }
   }

   public void nextDays(int days)
   {
      for (int i = 0; i <= days; i++)
      {
         nextDay();
      }

   }
   
   public static DateTime today()
   {
      GregorianCalendar currentDate = new GregorianCalendar();
      int currentDay = currentDate.get(GregorianCalendar.DATE);
      int currentMonth = currentDate.get(GregorianCalendar.MONTH);
      int currentYear = currentDate.get(GregorianCalendar.YEAR);
      int currentHour = currentDate.get(GregorianCalendar.HOUR);
      int currentMinute = currentDate.get(GregorianCalendar.MINUTE);
      int currentSecond = currentDate.get(GregorianCalendar.SECOND);
      DateTime Current = new DateTime(currentDay, currentMonth, currentYear, currentHour, currentMinute, currentSecond);
      return Current;
   }
   
   public String toString()
   {
      if(hour == 0 && minute == 0 && second == 0)
      {
      return "Date: " + day + "/" + month + "/" + year;
      }
      
      else return "\nDate: " + day + "/" + month + "/" + year + "\tTime: " + hour + ":" + minute + ":" + second;
   }
   
}
