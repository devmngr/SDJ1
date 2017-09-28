public class Ex2Chess
{

   public static void main(String[] args)
   {
      double a=0;
      double b=1;
      double square = 64 -1;  ///number of squares on a 8x8 chess board
      double count = 1;
      double number =0;
      double c =1;
      for (double i= 0; i<=square; i++ )
      {
         number++;
      }
      for (double j=0; j<number;j++)
      {
         System.out.println("Square("+ count++ + "):\tGrains: " + c);
          c= b * 2;
         a=b;
         b=c;
         
      }
   }
}
