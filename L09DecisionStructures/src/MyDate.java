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

   public void setDay(int day)
   {
      this.day = day;
   }

   public void setMonth(int month)
   {
      this.month = month;
   }

   public void setYear(int year)
   {
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

   public boolean isLeapYear()
   {
      if (year % 4 == 0 && year % 100 != 0 || year % 4 == 0 && year % 100 == 0
            && year % 400 == 400)
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

   public String getAstroSign()
   {
      if (month == 3 && day >= 21 || month == 4 && day <= 19)
      {
         return "Aries";
      }
      else if (month == 4 && day >= 20 || month <= 5 && day <= 20)
      {
         return "Taurus";
      }

      else if (month == 5 && day >= 21 || month == 6 && day <= 20)
      {
         return "Gemini";
      }
      else if (month == 6 && day >= 21 || month == 7 && day <= 22)
      {
         return "Cancer";
      }
      else if (month == 7 && day >= 23 || month == 8 && day <= 22)
      {
         return "Leo";
      }
      else if (month == 8 && day >= 23 || month == 9 && day <= 22)
      {
         return "Virgo";
      }
      else if (month == 9 && day >= 23 || month == 10 && day <= 22)
      {
         return "Libra";
      }
      else if (month == 10 && day >= 23 || month == 11 && day <= 21)
      {
         return "Scorpio";
      }
      else if (month == 11 && day >= 22 || month == 12 && day <= 21)
      {
         return "Sagittarius";
      }
      else if (month == 12 && day >= 22 || month == 1 && day <= 19)
      {
         return "Capricorn";
      }
      else if (month == 1 && day >= 20 || month == 2 && day <= 18)
      {
         return "Aquarius";
      }
      else if (month == 2 && day >= 19 || month == 3 && day <= 20)
      {
         return "Pisces";
      }
      else
      {
         return "The date is not valid";
      }
   }

   // Week days
   // h=(q+((13*(m+1))/5)+ k + (k/4)+(j/4) +5*j)%7
   public String dayOfWeek()
   {

      if (month != 1
            && month != 2
            && 0 == (day + ((13 * (month + 1)) / 5) + (year % 100)
                  + ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100))) % 7)
      {
         return "Saturday";
      }
      else if (month != 1
            && month != 2
            && 1 == (day + ((13 * (month + 1)) / 5) + (year % 100)
                  + ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100))) % 7)
      {
         return "Sunday";
      }
      else if (month != 1
            && month != 2
            && 2 == (day + ((13 * (month + 1)) / 5) + (year % 100)
                  + ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100))) % 7)
      {
         return "Monday";
      }
      else if (month != 1
            && month != 2
            && 3 == (day + ((13 * (month + 1)) / 5) + (year % 100)
                  + ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100))) % 7)
      {
         return "Tuesday";
      }
      else if (month != 1
            && month != 2
            && 4 == (day + ((13 * (month + 1)) / 5) + (year % 100)
                  + ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100))) % 7)
      {
         return "Wednesday";
      }
      else if (month != 1
            && month != 2
            && 5 == (day + ((13 * (month + 1)) / 5) + (year % 100)
                  + ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100))) % 7)
      {
         return "Thursday";
      }
      else if (month != 1
            && month != 2
            && 6 == (day + ((13 * (month + 1)) / 5) + (year % 100)
                  + ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100))) % 7)
      {
         return "Friday";
      }
      // /January (month 13) and February (month14)
      else if (month == 1
            || month == 2
            && 0 == (day + ((13 * (month + 12 + 1)) / 5) + ((year - 1) % 100)
                  + (((year - 1) % 100) / 4) + (((year - 1) / 100) / 4) + 5 * ((year - 1) / 100)) % 7)
      {
         return "Saturday";
      }
      else if (month == 1
            || month == 2
            && 1 == (day + ((13 * (month + 12 + 1)) / 5) + ((year - 1) % 100)
                  + (((year - 1) % 100) / 4) + (((year - 1) / 100) / 4) + 5 * ((year - 1) / 100)) % 7)
      {
         return "Sunday";
      }
      else if (month == 1
            || month == 2
            && 2 == (day + ((13 * (month + 12 + 1)) / 5) + ((year - 1) % 100)
                  + (((year - 1) % 100) / 4) + (((year - 1) / 100) / 4) + 5 * ((year - 1) / 100)) % 7)
      {
         return "Monday";
      }
      else if (month == 1
            || month == 2
            && 3 == (day + ((13 * (month + 12 + 1)) / 5) + ((year - 1) % 100)
                  + (((year - 1) % 100) / 4) + (((year - 1) / 100) / 4) + 5 * ((year - 1) / 100)) % 7)
      {
         return "Tuesday";
      }
      else if (month == 1
            || month == 2
            && 4 == (day + ((13 * (month + 12 + 1)) / 5) + ((year - 1) % 100)
                  + (((year - 1) % 100) / 4) + (((year - 1) / 100) / 4) + 5 * ((year - 1) / 100)) % 7)
      {
         return "Wednesday";
      }
      else if (month == 1
            || month == 2
            && 5 == (day + ((13 * (month + 12 + 1)) / 5) + ((year - 1) % 100)
                  + (((year - 1) % 100) / 4) + (((year - 1) / 100) / 4) + 5 * ((year - 1) / 100)) % 7)
      {
         return "Thursday";
      }
      else if (month == 1
            || month == 2
            && 6 == (day + ((13 * (month + 12 + 1)) / 5) + ((year - 1) % 100)
                  + (((year - 1) % 100) / 4) + (((year - 1) / 100) / 4) + 5 * ((year - 1) / 100)) % 7)
      {
         return "Friday";
      }

      else
      {
         return "Invalid date entered";
      }
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
}
