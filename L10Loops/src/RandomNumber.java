import java.util.Random;
import java.util.Scanner;

public class RandomNumber
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Random randomNumbers = new Random();
      int number = randomNumbers.nextInt(1000) + 1;
      int tries = 0;
      int numberGuess=0;

      System.out.println("Guess the number from 1 to 1000: ");
      

      while (numberGuess != number)
      {
         numberGuess = keyboard.nextInt();
         tries++;
         if (numberGuess == number)
         {

            System.out.println("Correct! the number was: " + number );
            if (tries > 0)
            {
               System.out.println("Tries: " + tries++);
            }

         }
         else if (numberGuess < number)
         {

            System.out.println("The guess was too low! \n Try again: ");
         }
         else if (numberGuess > number)
         {
            System.out.println("The guess was too high! \n Try again: ");
         }
      }

   }
}
