
import java.io.Serializable;

public class MovingTruck extends Vehicle implements Serializable
{
   private String maxCapacity;

   public MovingTruck(String type, String model, int year, int pricePerDay,
         int kilometers, int passengerNumber, double motorSize,
         String fuelType, double fuelUsage, String transmission,
         int doorNumber, boolean airCondition, boolean auxConnection,
         int numberOfAirbags, boolean armRest, String color,
         String numberPlates, int lastService, String maxCapacity)
   {
      super(type, model, year, pricePerDay, kilometers, passengerNumber,
            motorSize, fuelType, fuelUsage, transmission, doorNumber,
            airCondition, auxConnection, numberOfAirbags, armRest, color,
            numberPlates, lastService);
      this.maxCapacity = maxCapacity;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof MovingTruck))
      {
         return false;
      }

      MovingTruck other = (MovingTruck) obj;
      return super.equals(obj) && maxCapacity == other.maxCapacity;
   }

   public String toString()
   {
      return super.toString() + "\nMax Capacity: " + maxCapacity;
   }

}
