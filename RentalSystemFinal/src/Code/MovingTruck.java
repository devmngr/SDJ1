package Code;
import java.io.Serializable;

/**
 * A class containing a Vehicle object the type MovingTruck which extends the
 * Vehicle class and implements Serializable.
 * 
 * @author Bogdan Mitrache
 * @version 1.0
 */
public class MovingTruck extends Vehicle implements Serializable
{
   private String maxCapacity;

   /**
    * Constructor initializing the MovingTruck .
    * 
    * @param type
    *           the type of the Vehicle object (MovingTruck).
    * @param model
    *           the model of the MovingTruck.
    * @param year
    *           the build year of the MovingTruck.
    * @param pricePerDay
    *           the price per day of the MovingTruck.
    * @param kilometers
    *           the kilometers of the MovingTruck.
    * @param passengerNumber
    *           the maximum passenger number of the MovingTruck.
    * @param motorSize
    *           the size of the motor of the MovingTruck.
    * @param fuelType
    *           the fuel type of the MovingTruck.
    * @param fuelUsage
    *           the fuel usage of the MovingTruck.
    * @param transmission
    *           the transmission of the MovingTruck.
    * @param doorNumber
    *           the number of doors of the MovingTruck including the trunk.
    * @param airCondition
    *           the MovingTruck has or does not have air conditioner.
    * @param auxConnection
    *           the MovingTruck has or does not have AUX connection.
    * @param numberOfAirbags
    *           the number of airbags of the MovingTruck.
    * @param armRest
    *           the MovingTruck has or does not have a center arm rest.
    * @param color
    *           the color of the MovingTruck.
    * @param numberPlates
    *           the number plates (registration number) of the MovingTruck.
    * @param lastService
    *           the kilometers representing the last service of the MovingTruck.
    * @param maxCapacity the maxim capacity of the MovingTruck.
    */
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
   /**
    * Indicates whether some other MovingTruck object is "equal to" this one.
    */
   public boolean equals(Object obj)
   {
      if (!(obj instanceof MovingTruck))
      {
         return false;
      }

      MovingTruck other = (MovingTruck) obj;
      return super.equals(obj) && maxCapacity == other.maxCapacity;
   }
   /**
    * Returns a string representation of the MovingTruck object.
    */
   public String toString()
   {
      return super.toString();
   }

}
