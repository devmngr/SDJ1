import java.util.Scanner;


public class EX5ReverseString
{

   public static void main(String[] args)
   {
      Scanner keyboard=new Scanner(System.in);
      
      
      while (true)
      {
         System.out.println("Enter String to see it reversed: ");
         String input = keyboard.nextLine();
         
         String reverse = "";
         String quit = "quit";
         
         for ( int i = input.length()-1; i>=0;i--)
         {
            reverse+=input.charAt(i);
            
         }
         if (input.equals("QUIT") || input.equals("Quit") || input.equals("quit"))
         {
            break;
         }
         System.out.println("Reversed: "+ reverse);
      }

   }

}
