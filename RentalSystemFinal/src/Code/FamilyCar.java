package Code;

import java.io.Serializable;

/**
 * A class containing a Vehicle object the type FamilyCar which extends the
 * Vehicle class and implements Serializable.
 * 
 * @author Bogdan Mitrache
 * @version 1.0
 */
public class FamilyCar extends Vehicle implements Serializable
{
   /**
    * Constructor initializing the FamilyCar .
    * 
    * @param type
    *           the type of the Vehicle object (FamilyCar).
    * @param model
    *           the model of the FamilyCar.
    * @param year
    *           the build year of the FamilyCar.
    * @param pricePerDay
    *           the price per day of the FamilyCar.
    * @param kilometers
    *           the kilometers of the FamilyCar.
    * @param passengerNumber
    *           the maximum passenger number of the FamilyCar.
    * @param motorSize
    *           the size of the motor of the FamilyCar.
    * @param fuelType
    *           the fuel type of the FamilyCar.
    * @param fuelUsage
    *           the fuel usage of the FamilyCar.
    * @param transmission
    *           the transmission of the FamilyCar.
    * @param doorNumber
    *           the number of doors of the FamilyCar including the trunk.
    * @param airCondition
    *           the FamilyCar has or does not have air conditioner.
    * @param auxConnection
    *           the FamilyCar has or does not have AUX connection.
    * @param numberOfAirbags
    *           the number of airbags of the FamilyCar.
    * @param armRest
    *           the FamilyCar has or does not have a center arm rest.
    * @param color
    *           the color of the FamilyCar.
    * @param numberPlates
    *           the number plates (registration number) of the FamilyCar.
    * @param lastService
    *           the kilometers representing the last service of the FamilyCar.
    */
   public FamilyCar(String type, String model, int year, int pricePerDay,
         int kilometers, int passengerNumber, double motorSize,
         String fuelType, double fuelUsage, String transmission,
         int doorNumber, boolean airCondition, boolean auxConnection,
         int numberOfAirbags, boolean armRest, String color,
         String numberPlates, int lastService)
   {
      super(type, model, year, pricePerDay, kilometers, passengerNumber,
            motorSize, fuelType, fuelUsage, transmission, doorNumber,
            airCondition, auxConnection, numberOfAirbags, armRest, color,
            numberPlates, lastService);
   }

   /**
    * Indicates whether some other FamilyCar object is "equal to" this one.
    */
   public boolean equals(Object obj)
   {
      if (!(obj instanceof FamilyCar))
      {
         return false;
      }

      FamilyCar other = (FamilyCar) obj;
      return super.equals(obj);
   }

   /**
    * Returns a string representation of the FamilyCar object.
    */
   public String toString()
   {
      return super.toString();
   }
}
