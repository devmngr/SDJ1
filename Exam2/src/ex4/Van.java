package ex4;

public class Van extends Car
{
   private int capacity;
   
   
   public Van(String licenseNo, double price, int capacity)
   {
      super(licenseNo, price);
      this.capacity=capacity;
   }
   
   public int getCapacity()
   {
      return capacity;
   }
   
   @Override
   public String getType()
   {
      
      return "Van";
   }
   
}
