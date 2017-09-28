
public class Ex5
{

   public static void main(String[] args)
   {
      int x = 80;
      int y = 140;
      int z = 230;
      double salesTax = 0.25;
      
      double taxX = x * salesTax;
      double taxY = y * salesTax;
      double taxZ = z * salesTax;
      
      double totalPriceX = x + taxX;
      double totalPriceY = y + taxY;
      double totalPriceZ = z + taxZ;
      
      System.out.print("x=" + x + "\t" + "Tax=" + taxX 
            + "\t" + "Total Price=" + totalPriceX 
            + "\n" + "y=" + y + "\t" + "Tax=" + taxY
            + "\t" + "Total Price=" + totalPriceY
            + "\n" + "z=" + z + "\t" + "Tax z=" + taxZ
            + "\t" + "Total Price=" + totalPriceZ);
      

   }

}
