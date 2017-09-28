import java.util.Scanner;


public class testScoreTest
{

   public static void main(String[] args)
   {
      double testScore;
      double testScore1;
      double testScore2;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter test score: ");
      testScore = keyboard.nextDouble();
      
      System.out.println("Enter test score: ");
      testScore1 = keyboard.nextDouble();
      
      System.out.println("Enter test score: ");
      testScore2 = keyboard.nextDouble();
      
      TestScore Test = new TestScore(testScore, testScore1, testScore2);
      
      System.out.println("Avarage: " + Test.getAvarage());

      
      

   }

}
