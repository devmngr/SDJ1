
public class Ex3
{

   public static void main(String[] args)
   {
      MyDate birth = new MyDate(11, 8, 1992);
      MyDate today = new MyDate(3,3,2016);
      int count =0;
     while(!(birth.getDay() == today.getDay() && birth.getMonth() ==today.getMonth() &&
           birth.getYear() == today.getYear()))
     {
        birth.nextDay();
        count++;
     }
      System.out.println(count);
     
     
      
   }

}
