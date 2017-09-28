import java.util.Scanner;


public class PersonTest1
{
   public static void main(String[] args)
   {
     
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter name: ");
      String name = keyboard.nextLine(); 
     
      
      System.out.println("Enter birthday: ");
      String birthday = keyboard.nextLine();
      
      
       Person1 pers = new Person1(name, birthday);
      
      
      System.out.println("Name: " + pers.getName());
      
      System.out.println("Birthday: " + pers.getBirthday());
          
   }
   
   

}
