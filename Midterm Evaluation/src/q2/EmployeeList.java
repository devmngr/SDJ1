package q2;
import java.util.ArrayList;

public class EmployeeList
{
   private int size;
   private ArrayList<Employee> employees;

   public EmployeeList(int maxNumberOfEmployees)
   {
      this.size = maxNumberOfEmployees;
      employees = new ArrayList<Employee>();
   }

   public void addEmployee(Employee employee)
   {
      employees.add(employee);
   }

   public void removeEmployee(Employee employee)
   {
      employees.remove(employee);
   }

   public double getNumberOfEmployees()
   {
      int count = 0;
      for (int i = 0; i < employees.size(); i++)
      {
         if (employees.get(i) instanceof Employee)
         {
            count++;
         }
      }
      return count;
   }

   public Employee[] getAllEmployees()
   {
      Employee[] emp = new Employee[employees.size()];
      return employees.toArray(emp);
   }

   public double getTotalEarningsPerWeek()
   { 
      double total = 0;
      
      for(int i=0; i<employees.size(); i++)
      {
        if(employees.get(i) instanceof Employee)
        {
           total+= employees.get(i).earningsPerWeek();
        }
      }
      return total;
   }
   public String toString()
   {
      String str = "";
      for (int i = 0; i < employees.size(); i++)
      {
         str += employees.get(i);
      }
      return str;
   }
   
   public boolean equals(Object obj)
   {
      if (!(obj instanceof EmployeeList))
      {
         return false;
      }
      EmployeeList other = (EmployeeList) obj;

      if (size == other.size)
      {
         return true;
      }
      return false;
   }
   
   
   }
