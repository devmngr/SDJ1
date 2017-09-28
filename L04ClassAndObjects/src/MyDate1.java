
public class MyDate1
{
   private int day;
   private int month;
   private int year;
   private String displayDate;
   
   
   public MyDate1 (int day, int month, int year)
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
   
   public String getDisplayDate()
   {
      return displayDate;
   }
}
