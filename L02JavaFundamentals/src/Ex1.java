import java.util.Scanner;


public class Ex1
{

   public static void main(String[] args)
   {
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the name of your favorite city: ");
      
      String name = keyboard.nextLine();
      int stringsize = name.length();
      String upper = name.toUpperCase();
      String lower = name.toLowerCase();
      char letter = name.charAt(0);
      
      
     
      
      
      System.out.print("Number of charachters: " + stringsize + "\n" 
            + "Uppercase name: " + upper + "\n"
            + "Lowercase name: " + lower + "\n"
            + "First character: " + letter);

   }

}
