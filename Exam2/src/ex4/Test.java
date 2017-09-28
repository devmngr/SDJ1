package ex4;

public class Test
{
   public static void main(String[] args)
   {
      Van van1 = new Van("ax", 100, 3500);
      Van van2 = new Van("ZZ", 200, 3500);
      Van van3 = new Van("qq", 300, 2000);
      
      SportsCar sport1 = new SportsCar("SS", 1000);
      SportsCar sport2 = new SportsCar("SP", 2000);
      SportsCar sport3 = new SportsCar("Spo", 3000);
      SportsCar sport4 = new SportsCar("SPorts", 4000);
      
      Customer cus1 = new Customer("BLA", "BLA");
      
      CarRental rent1 = new CarRental("Firm", "adresso of firm");
      
      rent1.addCar(sport1);
      rent1.addCar(sport2);
      rent1.addCar(sport3);
      rent1.addCar(sport4);
      rent1.addCar(van1);
      rent1.addCar(van2);
      rent1.addCar(van3);
      
    
      //System.out.println(rent1.getAvailableVan(3500));
      System.out.println(rent1.getAvailableSportsCar());
   }
}
