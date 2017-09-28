package Code;

import java.io.Serializable;

public class AutoCamper extends Vehicle implements Serializable
{
  private int bedNumber;

   public AutoCamper(String type, String model, int year, int pricePerDay,
         int kilometers, int passengerNumber, double motorSize,
         String fuelType, double fuelUsage, String transmission,
         int doorNumber, boolean airCondition,
         boolean auxConnection, int numberOfAirbags, boolean armRest,
         String color, String numberPlates, int lastService,int bedNumber)
   {
      super(type, model, year, pricePerDay, kilometers, passengerNumber, motorSize,
            fuelType, fuelUsage, transmission, doorNumber, airCondition, auxConnection, numberOfAirbags,
            armRest, color, numberPlates, lastService);
      this.bedNumber=bedNumber;
   }
   public boolean equals(Object obj)
   {
      if (!(obj instanceof AutoCamper))
      {
         return false;
      }

      AutoCamper other = (AutoCamper) obj;
      return super.equals(obj) && bedNumber == other.bedNumber;
      
   }

      public String toString()
      {
         
         return super.toString();
      }

}
