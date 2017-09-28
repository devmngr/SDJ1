import java.util.Scanner;



public class EmployeeTest2
{

   public static void main(String[] args)
   {
      Employee empOne    = new Employee();
      Employee empTwo    = new Employee();
      Employee empThree  = new Employee();
      Scanner keyboard   = new Scanner(System.in);
      
      String printTable = "Name"+ "\t " + " " + "ID number" + " " 
            + "Department" + " " +"Position";
      

      
      //Employee 1
      System.out.println("Enter Name: ");
      String n = keyboard.nextLine();
      empOne.setName(n);
      
      System.out.println("Enter ID: ");
      int id = keyboard.nextInt();
      empOne.setIdNumber(id);
      
      keyboard.nextLine();
      
      System.out.print("Enter department");
      String dep = keyboard.nextLine();
      empOne.setDepartment(dep);
      
      System.out.print("Enter position");
      String pos = keyboard.nextLine();
      empOne.setPosition(pos);
      
      
      //Employee 2
      System.out.println("Enter Name: ");
      String n1 = keyboard.nextLine();
      empTwo.setName(n1);
      
      System.out.println("Enter ID: ");
      int id1 = keyboard.nextInt();
      empTwo.setIdNumber(id1);
      
      keyboard.nextLine();
      
      System.out.print("Enter department");
      String dep1 = keyboard.nextLine();
      empTwo.setDepartment(dep1);
      
      System.out.print("Enter position");
      String pos1 = keyboard.nextLine();
      empTwo.setPosition(pos1);
      
      
    //Employee 3
      System.out.println("Enter Name: ");
      String n2 = keyboard.nextLine();
      empThree.setName(n2);
      
      System.out.println("Enter ID: ");
      int id2 = keyboard.nextInt();
      empThree.setIdNumber(id2);
      
      keyboard.nextLine();
      
      System.out.print("Enter department");
      String dep2 = keyboard.nextLine();
      empThree.setDepartment(dep2);
      
      System.out.print("Enter position");
      String pos2 = keyboard.nextLine();
      empThree.setPosition(pos2);
      
      System.out.println(printTable);
      System.out.println(empOne.getDisplayData() + "\n");
      System.out.println(empTwo.getDisplayData() + "\n");
      System.out.println(empThree.getDisplayData()+ "\n");

   }

}
