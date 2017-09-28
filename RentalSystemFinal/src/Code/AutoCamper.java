package Code;
import java.io.Serializable;

/**
 * A class containing a Vehicle object the type AutoCamperwhich extends the
 * Vehicle class and implements Serializable.
 * @author Bogdan Mitrache
 * @version 1.0
 *
 */
public class AutoCamper extends Vehicle implements Serializable
{
  private int bedNumber;

  /**
   * Constructor initializing the AutoCamper .
   * @param type the type of the Vehicle object (AutoCamper).
   * @param model the model of the AutoCamper.
   * @param year the build year of the AutoCamper.
   * @param pricePerDay the price per day of the AutoCamper.
   * @param kilometers the kilometers of the AutoCamper.
   * @param passengerNumber the maximum passenger number of the AutoCamper.
   * @param motorSize the size of the motor of the AutoCamper.
   * @param fuelType the fuel type of the AutoCamper.
   * @param fuelUsage the fuel usage of the AutoCamper.
   * @param transmission the transmission of the AutoCamper.
   * @param doorNumber the number of doors of the AutoCamper  including the trunk.
   * @param airCondition the AutoCamper has or does not have air conditioner.
   * @param auxConnection the AutoCamper has or does not have AUX connection.
   * @param numberOfAirbags the number of airbags of the AutoCamper.
   * @param armRest  the AutoCamper has or does not have a center arm rest.
   * @param color the color of the AutoCamper.
   * @param numberPlates the number plates (registration number) of the AutoCamper.
   * @param lastService the kilometers representing the last service of the AutoCamper.
   * @param bedNumber the bed number of the AutoCamper.
   */
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
   
   /**
    * Indicates whether some other AutoCamper object is "equal to" this one.
    */
   public boolean equals(Object obj)
   {
      if (!(obj instanceof AutoCamper))
      {
         return false;
      }

      AutoCamper other = (AutoCamper) obj;
      return super.equals(obj) && bedNumber == other.bedNumber;
      
   }
   /**
    * Returns a string representation of the AutoCamper object.
    */
      public String toString()
      {
         
         return super.toString();
      }

}
