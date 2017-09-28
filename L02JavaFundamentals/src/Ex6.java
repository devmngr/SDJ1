import java.util.*;


public class Ex6
{

   public static void main(String[] args)
   {
      
      Scanner keyboard = new Scanner(System.in);
      
      //Collecting data
      
      System.out.print("Enter your name: ");
      String name = keyboard.nextLine();
      
      System.out.print("Enter your age: ");
      int age = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.print("Enter a name of a city: ");;
      String city = keyboard.nextLine();
      
      System.out.print("Enter a name of a college: ");
      String college = keyboard.nextLine();
      
      System.out.print("Enter a profession: ");
      String profession = keyboard.nextLine();
      
      System.out.print("Enter a type of animal: ");
      String animal = keyboard.nextLine();
      
      System.out.print("Enter a name for a Pet: ");
      String pet = keyboard.nextLine();
      
      

      
      
      
      //Printing out story with uppercase letters
      System.out.print("There once was a person named " + name.toUpperCase()
            + " who lived in " + city.toUpperCase()+ "." + "\n" 
            + "At the age of " + age + ", " +  name.toUpperCase() 
            + " went to the college at " + college.toUpperCase() 
            + "." + "\n" 
            + name.toUpperCase() + " graduated and went to work as a " 
            + profession.toUpperCase() + "." + "\n"
            + "Then, " + name.toUpperCase() + " adopted a(n) " 
            + animal.toUpperCase() + " named " + pet.toUpperCase() + "."
            + "\n" + "They both lived happily ever after!");

   }

}
