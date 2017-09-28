
public class Ex7
{

   public static void main(String[] args)
   {
      //Purchased Shares
      double   buyShares            =  1000;
      double   buySharesPrice       =  32.87;      //price per share
      double   buyBrokerCommission  =  0.02;        //2%
      double   buyPrice             =  buyShares * buySharesPrice;
      double   buyCommission        =  buyPrice * buyBrokerCommission;
      
      
      
      //Sold Shares
      double   soldShares           =  1000;
      double   soldSharesPrice      =  33.92;       //price per share
      double   soldBrokerCommission =  0.02;       //2%
      double   soldPrice            =  soldShares * soldSharesPrice;
      double   soldCommission       =  soldPrice * soldBrokerCommission;
      double   soldCost             =  soldPrice - soldCommission;
      
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
