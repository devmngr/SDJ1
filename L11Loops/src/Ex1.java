import java.util.Scanner;

public class Ex1
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String user = "username";
      String pass = "password";

      while (true)
      {
         System.out.println("Enter username: ");
         String userGuess = keyboard.nextLine();

         System.out.println("Enter password: ");
         String passGuess = keyboard.nextLine();

         if (userGuess.equals(user) && passGuess.equals(pass))
         {
            System.out.println("Username: " + user + "\nPassword: " + pass);
            break;
         }

         else if (userGuess.equals(user) && !passGuess.equals(pass))
         {
            System.out.println("WRONG Password!!! \tTry again!");
         }
         else if (passGuess.equals(pass) && !userGuess.equals(user))
         {
            System.out.println("WRONG Username!!! \tTry again!");
         }
         else
         {
            System.out.println("WRONG Username and Password!!! \tTry again!");
         }
      }

   }

}
