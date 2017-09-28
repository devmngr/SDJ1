package q2;
public class testEMP
{
   public static void main(String[] args)
{
   

   Date date = new Date(11,8,1992);
   Date date2 = new Date(26,11,1992);
   

   SalariedEmployee salEmp2 = new SalariedEmployee("Denisa", date2, 20000);
   
   HourlyEmployee hourEmp = new HourlyEmployee("Bogdan", date, 200, 1);
   
   EmployeeList emp = new EmployeeList(100);
   

   emp.addEmployee(salEmp2);
   emp.addEmployee(hourEmp);
   
   
   System.out.println("Employees\n" + emp);
   System.out.println("Total earnings per week: " + emp.getTotalEarningsPerWeek()+ "\n");
   
   emp.removeEmployee(salEmp2);
   System.out.println("Employees\n" + emp);
   System.out.println("Total earnings per week: " + emp.getTotalEarningsPerWeek() + "\n");

}
}
