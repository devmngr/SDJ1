import java.util.Scanner;


public class JobTest
{

   public static void main(String[] args)
   {
      String title;
      double salary;
      String name;
      String birthday;
      double percentage;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Person
      System.out.println("Enter employee");
      System.out.println("Name: ");
      name = keyboard.nextLine();
      System.out.println("Birthday: ");
      birthday = keyboard.nextLine();
      Person2 employee = new Person2(name, birthday);
      
      //Job
      System.out.println("Title: ");
      title = keyboard.nextLine();
      System.out.println("Salary: ");
      salary = keyboard.nextDouble();
      Job job = new Job(title, salary, employee);
      
      keyboard.nextLine();
      //Person2
      System.out.println("Enter new employee");
      System.out.println("Name: ");
      name = keyboard.nextLine();
      System.out.println("Birthday: ");
      birthday = keyboard.nextLine();
      Person2 employee2 = new Person2(name, birthday);
      
      //Job2
      System.out.println("Title: ");
      title = keyboard.nextLine();
      System.out.println("Salary: ");
      salary = keyboard.nextDouble();
      Job job1 = new Job(title, salary, employee2);

      System.out.println(job);
      System.out.println(job1);
      
      System.out.println("Change salary with: %");
      percentage = keyboard.nextDouble();
      
      System.out.println("Employee" + job + "\nNew Salary: " + job.givePercentageRaise(percentage));
      
///Set....Get....
      String title1 = "CEO";
      job.setTitle(title1);
      
      double salary1 = 3000;
      job.setSalary(salary1);
      
      System.out.println("\nSET...GET...");
      System.out.println("Changed title and salary for job1 " + "\n"+ job.getTitle() 
           +"\n" + job.getSalary());
      
      
      

   }

}
