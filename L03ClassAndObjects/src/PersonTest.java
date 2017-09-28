import java.util.*;


public class PersonTest
{
   public static void main(String[] args)
   {
      Person pers = new Person();
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter name: ");
      String name = keyboard.nextLine(); 
      pers.setName(name);
      
      System.out.println("Enter birthday: ");
      String birthday = keyboard.nextLine();
      pers.setBirthday(birthday);
      
      
      
      
      System.out.println("Name: " + pers.getName());
      
      System.out.println("Birthday: " + pers.getBirthday());
          
   }
   
   

}
