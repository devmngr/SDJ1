import java.util.Scanner;


public class EmployeeTest
{

   public static void main(String[] args)
   {
      Employee empOne    = new Employee();
      Employee empTwo    = new Employee();
      Employee empThree  = new Employee();
      
      String printTable = "Name"+ "\t" + "\t" + "ID number" + "\t" + "\t"
            + "Department" + "\t" + "\t" +"Position";

      
      //Employee 1
      empOne.setName("Susan Meyers");
      empOne.setIdNumber(47899);
      empOne.setDepartment("Accounting");
      empOne.setPosition("Vice President");
      

        
      //Employee 2  
      empTwo.setName("Mark Jones");
      empTwo.setIdNumber(39119);
      empTwo.setDepartment("IT");
      empTwo.setPosition("Programmer");
      
      //Employee 3
      empThree.setName("Joy Rogers");
      empThree.setIdNumber(81774);
      empThree.setDepartment("Manufacturing");
      empThree.setPosition("Engineer");
     
      
      
      
      
      
      System.out.println(printTable);
      System.out.println(empOne.getDisplayData());
      System.out.println(empTwo.getDisplayData());
      System.out.println(empThree.getDisplayData());

   }

}
