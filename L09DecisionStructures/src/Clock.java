public class Clock
{

   private int hour;
   private int minute;
   private int second;

   public Clock(int h, int m, int s)
   {
      this.hour = h;
      this.minute = m;
      this.second = s;
   }

   public Clock(int totalTimeInSeconds)
   {
      int hourInSeconds = hour * 3600;
      int minutesInSeconds = minute * 60;
      int secondsInSeconds = second;
      totalTimeInSeconds = hourInSeconds + minutesInSeconds + secondsInSeconds;
      
   }

   public void set(int h, int m, int s)
   {
      this.hour = h;
      this.minute = m;
      this.second = s;
   }

   public int getHour()
   {
      return hour;
   }

   public int getMinute()
   {
      return minute;
   }

   public int getSecond()
   {
      return second;
   }

   public void tic()
   {

   }

}
