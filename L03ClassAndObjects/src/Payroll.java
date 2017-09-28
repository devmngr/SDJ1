
public class Payroll
{
   private String name;
   private double payRate;
   private double workHours;
   private double grossPay;
   
   public void setName(String n)
   {
      name = n;
   }
   
   public void setPayRate(double pay)
   {
      payRate = pay;
   }
   
   public void setWorkHours(double hours)
   {
      workHours = hours;
   }
   
   public String getName()
   {
      return name;
   }
   
   public double getPayRate()
   {
      return payRate;
   }
   
   public double getWorkHours()
   {
      return workHours;
   }
   
   public double getGrossPay()
   {
      return grossPay;
   }
}
