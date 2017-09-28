import java.util.Scanner;


public class Ex3
{

   public static void main(String[] args)
   {
      //
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter x:");
      double x = keyboard.nextDouble();
      
      System.out.print("Enter y: ");
      double y = keyboard.nextDouble();
      
      System.out.print("Enter z: ");
      double z = keyboard.nextDouble();
      
      
      System.out.print("Enter Sales Tax:");
      double salesTax = keyboard.nextDouble();
      
      double taxX = x * salesTax;
      double taxY = y * salesTax;
      double taxZ = z * salesTax;
      
      double totalPriceX = x + taxX;
      double totalPriceY = y + taxY;
      double totalPriceZ = z + taxZ;
      
      System.out.print("x=" + x + "\n" + "Tax=" + taxX + "\n"
            + "Total Price=" + totalPriceX 
            + "\n" + "y=" + y + "\n" + "Tax=" + taxY
            + "\n" + "Total Price=" + totalPriceY
            + "\n" + "z=" + z + "\n" + "Tax z=" + taxZ
            + "\n" + "Total Price=" + totalPriceZ);

   }

}
