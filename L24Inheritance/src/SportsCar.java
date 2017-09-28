public class SportsCar extends Car
{
   private int maxVelocity;

   public SportsCar(String owner, double price, String regNo, int maxVelocity)
   {
      super(owner, price, regNo);
      this.maxVelocity = maxVelocity;
   }
   public int getMaxVelocity()
   {
      return maxVelocity;
   }
   
   public String toString()
   {
      return super.toString() + "Max Velocity: " + maxVelocity + "\n"; 
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof SportsCar))
      {
         return false;
      }
      SportsCar other = (SportsCar) obj;
      return super.equals(other) && maxVelocity == other.maxVelocity; 
      
   }
}
