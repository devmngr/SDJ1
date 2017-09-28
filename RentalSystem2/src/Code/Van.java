package Code;

import java.io.Serializable;

public class Van extends Vehicle implements Serializable
{
   private int loadSize;

   public Van(String type, String model, int year, int pricePerDay,
         int kilometers, int passengerNumber, double motorSize,
         String fuelType, double fuelUsage, String transmission,
         int doorNumber, boolean airCondition,
         boolean auxConnection, int numberOfAirbags, boolean armRest,
         String color, String numberPlates, int lastService,int loadSize)
   {
      super(type, model, year, pricePerDay, kilometers, passengerNumber, motorSize,
            fuelType, fuelUsage, transmission, doorNumber,
            airCondition, auxConnection, numberOfAirbags, armRest, color,
            numberPlates, lastService);
      this.loadSize = loadSize;
   }
   
   public boolean equals(Object obj)
   {
      if (!(obj instanceof Van))
      {
         return false;
      }

      Van other = (Van) obj;
      return super.equals(obj)&& loadSize ==other.loadSize;
   }
   public String toString()
   
   {
     return super.toString();
   }
   
   
   
}
