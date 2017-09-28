package Code;

import java.io.Serializable;

/**
 * A class containing a Vehicle object the type Van which extends the Vehicle
 * class and implements Serializable.
 * 
 * @author Bogdan Mitrache
 * @version 1.0
 */
public class Van extends Vehicle implements Serializable
{
   private int loadSize;

   /**
    * Constructor initializing the Van .
    * 
    * @param type
    *           the type of the Vehicle object (Van).
    * @param model
    *           the model of the Van.
    * @param year
    *           the build year of the Van.
    * @param pricePerDay
    *           the price per day of the Van.
    * @param kilometers
    *           the kilometers of the Van.
    * @param passengerNumber
    *           the maximum passenger number of the Van.
    * @param motorSize
    *           the size of the motor of the Van.
    * @param fuelType
    *           the fuel type of the Van.
    * @param fuelUsage
    *           the fuel usage of the Van.
    * @param transmission
    *           the transmission of the Van.
    * @param doorNumber
    *           the number of doors of the Van including the trunk.
    * @param airCondition
    *           the Van has or does not have air conditioner.
    * @param auxConnection
    *           the Van has or does not have AUX connection.
    * @param numberOfAirbags
    *           the number of airbags of the Van.
    * @param armRest
    *           the Van has or does not have a center arm rest.
    * @param color
    *           the color of the Van.
    * @param numberPlates
    *           the number plates (registration number) of the Van.
    * @param lastService
    *           the kilometers representing the last service of the Van.
    * @param loadSize the maxim load size of the Van.
    */
   public Van(String type, String model, int year, int pricePerDay,
         int kilometers, int passengerNumber, double motorSize,
         String fuelType, double fuelUsage, String transmission,
         int doorNumber, boolean airCondition, boolean auxConnection,
         int numberOfAirbags, boolean armRest, String color,
         String numberPlates, int lastService, int loadSize)
   {
      super(type, model, year, pricePerDay, kilometers, passengerNumber,
            motorSize, fuelType, fuelUsage, transmission, doorNumber,
            airCondition, auxConnection, numberOfAirbags, armRest, color,
            numberPlates, lastService);
      this.loadSize = loadSize;
   }

   /**
    * Indicates whether some other Van object is "equal to" this one.
    */
   public boolean equals(Object obj)
   {
      if (!(obj instanceof Van))
      {
         return false;
      }

      Van other = (Van) obj;
      return super.equals(obj) && loadSize == other.loadSize;
   }

   /**
    * Returns a string representation of the Van object.
    */
   public String toString()

   {
      return super.toString();
   }

}
