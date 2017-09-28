
public class TestLeapYearMyDate
{

   public static void main(String[] args)
   {

       MyDate leap = new MyDate(1,1,1);
      int count =0;
      for (int year = 1582; year<=2016; year++)
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
