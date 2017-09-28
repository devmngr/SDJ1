import java.util.Scanner;


public class PayrollTest1
{

   public static void main(String[] args)
   {

      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter name: ");
      String name = keyboard.nextLine(); 
      
      
      System.out.println("Enter hourly pay rate: ");
      double payRate = keyboard.nextDouble();
      
      System.out.println("Enter worked hours: ");
      double workHours = keyboard.nextDouble();
      
      Payroll1 payroll = new Payroll1(name, payRate, workHours);
      
      
      double grossPay = payRate * workHours; 
      System.out.println("Name: " + name);
      System.out.println("Hourly pay rate: " + payRate);
      System.out.println("Worked hours: " + workHours);
      System.out.println("Gross Pay: " + grossPay);
      

   }

}
