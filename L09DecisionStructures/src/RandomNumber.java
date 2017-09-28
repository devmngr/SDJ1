import java.util.Random;
import java.util.Scanner;


      public class RandomNumber
      {

         public static void main(String[] args)
         {
            Scanner keyboard = new Scanner (System.in);
            Random randomNumbers = new Random();
            int number = randomNumbers.nextInt(10) +1;
            
          
            
            System.out.println("Guess the number from 1 to 10: ");
            int numberGuess= keyboard.nextInt();
            
            if (numberGuess == number)
            {
               System.out.println("Correct");
               
            }
            else 
            {
               System.out.println("Incorrect \nThe number is: " + number);
            }

   }

}
