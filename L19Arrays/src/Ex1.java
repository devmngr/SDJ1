public class Ex1
{

   public static void main(String[] args)
   {
      int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };

      for (int i = 0; i < arr1.length; i++)
      {
         arr1[i] = arr1[i] * 2;
      }

      for (int i = 0; i < arr1.length; i++)
      {
         System.out.println("NR " + (i+1) + ": " + arr1[i]);
      }
   }

}
