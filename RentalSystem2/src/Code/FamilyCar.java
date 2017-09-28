package Code;

import java.io.Serializable;

public class FamilyCar extends Vehicle implements Serializable
{

   public FamilyCar(String type, String model, int year, int pricePerDay,
         int kilometers, int passengerNumber, double motorSize,
         String fuelType, double fuelUsage, String transmission,
         int doorNumber,boolean airCondition,
         boolean auxConnection, int numberOfAirbags, boolean armRest,
         String color, String numberPlates, int lastService)
   {
      super(type, model, year, pricePerDay, kilometers, passengerNumber,
            motorSize, fuelType, fuelUsage, transmission, doorNumber,
            airCondition, auxConnection, numberOfAirbags,
            armRest, color, numberPlates, lastService);
   }
   public boolean equals(Object obj)
   {
      if (!(obj instanceof FamilyCar))
      {
         return false;
      }

      FamilyCar other = (FamilyCar) obj;
      return super.equals(obj);
   }

   public String toString()
   {
      return super.toString();
   }
}
