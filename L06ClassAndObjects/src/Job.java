
public class Job
{

      private String title;
      private double salary;
      private Person2 employee;
      
      
      public Job(String title, double salary, Person2 employee)
      {
         this.title = title;
         this.salary = salary;
         this.employee =  new Person2(employee.getName(), employee.getBirthday());
      }
      
      public Job(String title, double salary)
      {
         this.title = title;
         this.salary = salary;
         employee = null;
      }
      
      public void  setTitle(String title)
      {
         this.title = title;
      }
      
      public void setSalary(double salary)
      {
         this.salary = salary;
      }
      
      public void setEmployee(Person2 employee)
      {
         this.employee = employee;
      }
      
      public String getTitle()
      {
         return "Titel: " + title;
      }
      
      public String getSalary()
      {
         return  "Salary: " + salary;
      }
      
      public Person2 getEmployee()
      {
         return employee;
      }
      
      public double givePercentageRaise(double percentage)
      {
         return (salary + (salary * (percentage / 100)));
      }
      
      public String toString()
      {
         return employee + "Title: " + title + "\nSalary: " + salary; 
      }
      

      
      

}
