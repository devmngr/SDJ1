
public class TestScore
{

   private double testScore;
   private double testScore1;
   private double testScore2;
   
   
   
   public TestScore(double testScore, double testScore1, double testScore2)
   {
      this.testScore = testScore;
      this.testScore1 = testScore1;
      this.testScore2 = testScore2;           
      
   }
   public void setTestScore(double testScore)
   {
      this.testScore = testScore;
   }
   public void setTestScore1(double testScore1)
   {
      this.testScore1 = testScore1;
   }
   public void setTestScore2(double testScore2)
   {
      this.testScore2 = testScore2;
   }
   
   public double getTestScore()
   {
      return testScore;
   }
   public double getTestScore1()
   {
      return testScore1;
   }
   public double getTestScore2()
   {
      return testScore2;
   }
   
   public double getAvarage()
   {
      return (testScore + testScore1 + testScore2) / 3;
   }
}
