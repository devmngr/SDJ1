public class Fibonacci
{

   public static void main(String[] args)
   {

      int number = 1;
      int a = 0;
      int b = 1;
      int count = 0;

      for (int j = 0; j <= 20; j++)
      {
         number++;
      }

      for (int i = 1; i < number; i++)
      {
         int c = a + b;
         a = b;
         b = c;

         System.out.println("Fibonacci(" + count++ + ")" + c);
      }
   }

}
