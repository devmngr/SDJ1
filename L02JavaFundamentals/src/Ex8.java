import java.util.*;


public class Ex8
{

   public static void main(String[] args)
   {
      Scanner  keyboard = new Scanner(System.in);
      
    //Purchased Shares
      System.out.print("Enter number of bought shares: ");
      double   buyShares  =  keyboard.nextDouble();
      
      System.out.print("Enter price per bought share: $");
      double   buySharesPrice =  keyboard.nextDouble();  //price per share
      
      System.out.print("Enter stockbroker commission in %: ");
      double   buyBrokerCommission  =  keyboard.nextDouble() / 100;        //%
      
      double   buyPrice             =  buyShares * buySharesPrice;
      double   buyCommission        =  buyPrice * buyBrokerCommission;
      
      //Buying Price and paid commission
      System.out.println("Bought shares price: $" + buyPrice); 
      System.out.println("Stockroker's commission for bought shares: $"
                        + buyCommission);
      
      
      
      //Sold Shares
      System.out.print("Enter number of sold shares: $");
      double   soldShares =  keyboard.nextDouble();
      
      System.out.print("Enter price per sold share: $");
      double   soldSharesPrice = keyboard.nextDouble();  //price per share
      
      System.out.print("Enter stockbroker commission for sold shares in %: ");
      double   soldBrokerCommission =  keyboard.nextDouble() / 100;       //%
      
      
      double   soldPrice            =  soldShares * soldSharesPrice;
      double   soldCommission       =  soldPrice * soldBrokerCommission;
      double   soldCost             =  soldPrice - soldCommission;
      
    //Selling Price and paid commission
      System.out.println("Sold shares price: $" + buyPrice); 
      System.out.println("Stockroker's commission for sold shares: $"
                        + soldCommission);
      
      
      //Profit or Loss
      
      double   profit               =  soldCost - buyPrice ;
      
      //Displaying 
       System.out.print("Purchased stock price: $" + buyPrice + "\n"
             + "Commission paid for bought shares: $" 
             + buyCommission + "\n"
             + "Sold stock price: $" + soldPrice + "\n"
             + "Commission paid for sold shares: $" + soldCommission + "\n"
             + "Profit: $" + profit);

   }

}
