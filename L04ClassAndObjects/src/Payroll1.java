
public class Payroll1
{
   private String name;
   private double payRate;
   private double workHours;
   private double grossPay;
   
   
   public Payroll1(String name, double payRate, double workHours)
   {
      this.name=name;
      this.payRate = payRate;
      this.workHours = workHours;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public void setPayRate(double payRate)
   {
      this.payRate = payRate;
   }
   
   public void setWorkHours(double workHours)
   {
      this.workHours = workHours;
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
