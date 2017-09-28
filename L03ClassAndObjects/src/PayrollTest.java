import java.util.Scanner;


public class PayrollTest
{

   public static void main(String[] args)
   {
      Payroll payroll = new Payroll();
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter name: ");
      String name = keyboard.nextLine(); 
      payroll.setName(name);
      
      
      System.out.println("Enter hourly pay rate: ");
      double payRate = keyboard.nextDouble();
      payroll.setPayRate(payRate);
      
      System.out.println("Enter worked hours: ");
      double workHours = keyboard.nextDouble();
      payroll.setWorkHours(workHours);
      
      
      double grossPay = payRate * workHours; 
      System.out.println("Name: " + name);
      System.out.println("Hourly pay rate: " + payRate);
      System.out.println("Worked hours: " + workHours);
      System.out.println("Gross Pay: " + grossPay);
      

   }

}
