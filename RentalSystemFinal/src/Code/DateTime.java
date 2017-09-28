package Code;
import java.io.Serializable;
import java.util.GregorianCalendar;
/**
 * A class containing a DateTime object and implements Serializable.
 * @author Bogdan Mitrache
 *@version 1.0
 */
public class DateTime implements Serializable
{
   private int day;
   private int month;
   private int year;
   private int hour;
   private int minute;
   private int second;

   // /For rental
   /**
    * Constructor initializing the DateTime object for the booking of a vehicle.
    * @param day the day used for the booking date.
    * @param month the month used for the booking date.
    * @param year the year used for the booking date.
    * @param hour the hour used for the booking time.
    * @param minute the minute used for the booking time.
    * @param second the second used for the booking time.
    */
   public DateTime(int day, int month, int year, int hour, int minute,
         int second)
   {
      this.day = day;
      this.month = month;
      this.year = year;
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }
/**
 *     * Constructor initializing the time of DateTime object.
    * @param hour the hour used for the booking time.
    * @param minute the minute used for the booking time.
 */
   public DateTime(int hour, int minute)
   {
      this.day = 0;
      this.month = 0;
      this.year = 0;
      this.hour = hour;
      this.minute = minute;
      this.second = 0;
   }
/**
 * Gets the day.
 * @return the day of the DateTime object.
 */
   public int getDay()
   {
      return day;
   }
/**
 * * Gets the month.
 * @return the month of the DateTime object.
 */
   public int getMonth()
   {
      return month;
   }
/**
 * * Gets the year.
 * @return the year of the DateTime object.
 */
   public int getYear()
   {
      return year;
   }
/**
 * * Gets the hour.
 * @return the hour of the DateTime object.
 */
   public int getHour()
   {

      return hour;
   }
/**
 * * Gets the minute.
 * @return the minute of the DateTime object.
 */
   public int getMinute()
   {
      return minute;
   }
/**
 * * Gets the second.
 * @return the second of the DateTime object.
 */
   public int getSecond()
   {
      return second;
   }
/**
 * Gets the date of a DateTime object.
 * @return the date of DateTime object in the format d/m/y.
 */
   public String getDate()
   {
      return day + "/" + month + "/" + year;
   }

   /**
    * Gets the time of a DateTime object.
    * @return the time of DateTime object in the format h:m.
    */
   public String getTime()
   {
      return hour + " : " + minute;
   }
/**
 * Gets a String containing the name of a month
 * @return the name of the month of a DateTime object.
 */
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
/**
 * Indicates if a year is or is not a leap year. A Leap year is a year  is a year containing one additional day (February has 29 days). 
 * @return true if a year is a leap year, else it returns false.
 */
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
/**
 * indicates how many days a month has.
 * @return the days in a month.
 */
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
/**
 * Gets the days of this month.
 * @param month the name of the month you want to see how many days has.
 * @return the days in this month
 */
   private int daysInTotal(int month)
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
/**
 * Gets the total days in this month
 * @param month the name of the month you want to see how many days has.
 * @return number of total days in the month
 */
   public int totalDaysInMonths(int month)
   {

      int totalDays = 0;

      for (int i = 1; i < month; i++)
      {
         totalDays += daysInTotal(i);
      }

      return totalDays;

   }
/**
 * Counts up a date
 */
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
/**
 * Counts up this number of days
 * @param days the number of days to count
 */
   public void nextDays(int days)
   {
      for (int i = 0; i <= days; i++)
      {
         nextDay();
      }

   }
/**
 * Gets number of days between 2 DateTime objects.
 * @param deliveryDate the DateTime object to compare to..
 * @return the number of days.
 */
   public int differenceBetweenDates(DateTime deliveryDate)
   {

      int yearsLeft = deliveryDate.getYear() - this.getYear();
      int monthsLeft = deliveryDate.getMonth() - this.getMonth();
      int daysLeft = deliveryDate.getDay() - this.getDay();
      int deliveryDays = totalDaysInMonths(deliveryDate.getMonth())
            + deliveryDate.getDay();
      int pickUpDays = totalDaysInMonths(this.getMonth()) + this.getDay();

      if (yearsLeft != 0)
      {

         if (this.isLeapYear())
         {
            return 366 - pickUpDays + deliveryDays;
         }
         else
         {
            return 365 - pickUpDays + deliveryDays;
         }
      }

      return deliveryDays - pickUpDays + 1;

   }
/**
 * Compares a DateTime objects to see if it is before this DateTime object.
 * @param date2 the DateTime object to compare to.
 * @return true if the DateTime is before , else returns false.
 */
   public boolean isBefore(DateTime date2)
   {
      if (year > date2.year)
      {
         return true;
      }
      else if (year < date2.year)
      {
         return false;
      }
      else
      {
         if (month > date2.month)
         {
            return true;
         }
         else if (month < date2.month)
         {
            return false;
         }
         else
         {
            if (day > date2.day)
            {
               return true;
            }
            else if (day < date2.day)
            {
               return false;
            }
            else
               return false;
         }
      }

   }
/**
 * Gets a DateTime with the current date and time
 * @return the current date and time
 */
   public static DateTime today()
   {
      GregorianCalendar currentDate = new GregorianCalendar();
      int currentDay = currentDate.get(GregorianCalendar.DATE);
      int currentMonth = currentDate.get(GregorianCalendar.MONTH);
      int currentYear = currentDate.get(GregorianCalendar.YEAR);
      int currentHour = currentDate.get(GregorianCalendar.HOUR);
      int currentMinute = currentDate.get(GregorianCalendar.MINUTE);
      int currentSecond = currentDate.get(GregorianCalendar.SECOND);
      DateTime Current = new DateTime(currentDay, currentMonth, currentYear,
            currentHour, currentMinute, currentSecond);
      return Current;
   }

   /**
    * Indicates whether some other DateTime object is "equal to" this one.
    */
   public boolean equals(Object obj)
   {
      if (!(obj instanceof DateTime))
      {
         return false;
      }

      DateTime other = (DateTime) obj;

      return day == other.day && month == other.month && year == other.year
            && second == other.second && minute == other.minute
            && hour == other.hour;
   }
   /**
    * Returns a string representation of the DateTime object.
    */
   public String toString()
   {
      if (hour == 0 && minute == 0 && second == 0)
      {
         return "Date: " + day + "/" + month + "/" + year;
      }

      else
         return "\nDate: " + day + "/" + month + "/" + year + "\tTime: " + hour
               + ":" + minute + ":" + second;
   }

}
