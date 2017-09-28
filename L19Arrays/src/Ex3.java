public class Ex3
{

   public static void main(String[] args)
   {
      int[] sourceArray = { 1, 5, 2, 3, 6 };
      int[] destinationArray = new int[2 * sourceArray.length];

      for (int i = 0; i < sourceArray.length; i++)
      {
         destinationArray[i] = sourceArray[i];
      }

      for(int i=0; i<sourceArray.length; i++)
      {
         System.out.print(sourceArray[i] + " ");
      }
      
      System.out.println();
      
      for (int i = 0; i < destinationArray.length; i++)
      {
 
         System.out.print(destinationArray[i] + " ");

      }

   }

}
