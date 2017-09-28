package ex4;

public class SportsCar extends Car
{
   public SportsCar(String licenseNo, double price)
   {
      super(licenseNo, price);
      
   }

   public String getType()
   {
      return "Sports car";
   }
   
}
