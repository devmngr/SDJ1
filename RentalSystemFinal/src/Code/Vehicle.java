package Code;

import java.io.Serializable;

/**
 * A class containing a Vehicle object and implements Serializable and implements Serializable.
 * 
 * @author Bogdan Mitrache
 * @version 1.0
 */
public class Vehicle implements Serializable
{
   private String type;
   private String model;
   private int year;
   private int pricePerDay;
   private int kilometers;
   private int passengerNumber;
   private double motorSize;
   private String fuelType;
   private double fuelUsage;
   private String transmision;
   private int doorNumber;
   private boolean airCondition;
   private boolean auxConnection;
   private int numberOfAirbags;
   private boolean armRest;
   private String color;
   private String numberPlates;
   private int lastService;
   private boolean reserve;
   private boolean book;

   /**
    * Constructor initializing the Vehicle object .
    * 
    * @param type
    *           the type of the Vehicle.
    * @param model
    *           the model of the Vehicle.
    * @param year
    *           the build year of the Vehicle.
    * @param pricePerDay
    *           the price per day of the Vehicle.
    * @param kilometers
    *           the kilometers of the Vehicle.
    * @param passengerNumber
    *           the maximum passenger number of the Vehicle.
    * @param motorSize
    *           the size of the motor of the Vehicle.
    * @param fuelType
    *           the fuel type of the Vehicle.
    * @param fuelUsage
    *           the fuel usage of the Vehicle.
    * @param transmission
    *           the transmission of the Vehicle.
    * @param doorNumber
    *           the number of doors of the Vehicle including the trunk.
    * @param airCondition
    *           the Vehicle has or does not have air conditioner.
    * @param auxConnection
    *           the Vehicle has or does not have AUX connection.
    * @param numberOfAirbags
    *           the number of airbags of the Vehicle.
    * @param armRest
    *           the Vehicle has or does not have a center arm rest.
    * @param color
    *           the color of the Vehicle.
    * @param numberPlates
    *           the number plates (registration number) of the Vehicle.
    * @param lastService
    *           the kilometers representing the last service of the Vehicle.
    */
   public Vehicle(String type, String model, int year, int pricePerDay,
         int kilometers, int passengerNumber, double motorSize,
         String fuelType, double fuelUsage, String transmission,
         int doorNumber, boolean airCondition, boolean auxConnection,
         int numberOfAirbags, boolean armRest, String color,
         String numberPlates, int lastService)
   {
      this.type = type;
      this.model = model;
      this.year = year;
      this.pricePerDay = pricePerDay;
      this.kilometers = kilometers;
      this.passengerNumber = passengerNumber;
      this.motorSize = motorSize;
      this.fuelType = fuelType;
      this.fuelUsage = fuelUsage;
      this.transmision = transmission;
      this.doorNumber = doorNumber;
      this.airCondition = airCondition;
      this.auxConnection = auxConnection;
      this.numberOfAirbags = numberOfAirbags;
      this.armRest = armRest;
      this.color = color;
      this.numberPlates = numberPlates;
      this.lastService = lastService;
      this.reserve = false;
      this.book = false;
   }

   /**
    * * Gets the type of the Vehicle object.
    * 
    * @return the type.
    */
   public String getType()
   {
      return type;
   }

   /**
    * * Gets the model of the Vehicle object.
    * 
    * @return the model.
    */
   public String getModel()
   {
      return model;
   }

   /**
    * * Gets the year of the Vehicle object.
    * 
    * @return the year.
    */
   public int getYear()
   {
      return year;
   }

   /**
    * * Gets the price per day of the Vehicle object.
    * 
    * @return the price per one day.
    */
   public int getPricePerDay()
   {
      return pricePerDay;
   }

   /**
    * * Gets the kilometers of the Vehicle object.
    * 
    * @return the kilometers.
    */
   public int getKilometers()
   {
      return kilometers;
   }

   /**
    * * Gets the maximum number of passenger of the Vehicle object.
    * 
    * @return the max number of passenger.
    */
   public int getPassengerNumber()
   {
      return passengerNumber;
   }

   /**
    * * Gets the motor size of the Vehicle object.
    * 
    * @return the size of the motor.
    */
   public double getMotorSize()
   {
      return motorSize;
   }

   /**
    * * Gets the type of fuel of the Vehicle object.
    * 
    * @return the fuel type.
    */
   public String getFuelType()
   {
      return fuelType;
   }

   /**
    * * Gets the usage of fuel of the Vehicle object.
    * 
    * @return the usage of fuel.
    */
   public double getFuelUsage()
   {
      return fuelUsage;
   }

   /**
    * * Gets the type of transmission of the Vehicle object.
    * 
    * @return the transmission type.
    */
   public String getTransmision()
   {
      return transmision;
   }

   /**
    * * Gets the number of doors of the Vehicle object includin the trunk.
    * 
    * @return the number of doors.
    */
   public int getDoorNumber()
   {
      return doorNumber;
   }

   /**
    * * Gets the number of airbags of the Vehicle object.
    * 
    * @return the number of airbags.
    */
   public int getNumberOfAirbags()
   {
      return numberOfAirbags;
   }

   /**
    * * Gets the color of the Vehicle object.
    * 
    * @return the color.
    */
   public String getColor()
   {
      return color;
   }

   /**
    * * Gets the number plates/registration number of the Vehicle object.
    * 
    * @return the number plates.
    */
   public String getNumberPlates()
   {
      return numberPlates;
   }

   /**
    * * Gets the amount of kilometers of the Vehicle object at the last service.
    * 
    * @return the amount of kilometers.
    */
   public int getLastService()
   {
      return lastService;
   }

   /**
    * Sets the amount of kilometers of the Vehicle object at last service.
    * 
    * @param lastService
    *           the amount of kilometers at last service
    */
   public void setLastService(int lastService)
   {
      this.lastService = lastService;
      ;
   }

   /**
    * Sets the amount of kilometers of a Vehicle object.
    * 
    * @param kilometers
    *           the amount of kilometers the car has
    */
   public void setKilometers(int kilometers)
   {
      this.kilometers = kilometers;
   }

   /**
    * Tells if the Vehicle object needs to have service or not.
    * 
    * @return true if the car needs service, else returns false
    */
   public boolean needsService()
   {
      int warning = 20000;
      int service = lastService + warning;
      if (this.kilometers >= service)
      {
         return true;
      }
      else
         return false;

   }

   /**
    * Displays a warning message when a Vehicle object needs to have service or
    * informs the number of kilometers at which the Vehicle object needs to have
    * service.
    * 
    * @return message "Service Check: 20000 kilometers exceeded" if the Vehicle has
    *         Exceeded 20000 kilometers from last service, else it returns a message
    *         containing the amount of kilometers at which the Vehicle needs to
    *         make service.
    */
   public String getServiceMessage()
   {
      if (needsService())
      {
         return "\nService Check: 20000 km exeeded";
      }
      else
         return "\nService at: " + (getLastService() + 20000) + " km";
   }

   /**
    * Sets the status of a Vehicle object to reserved.
    */
   public void reserve()
   {
      reserve = true;
   }

   /**
    * Sets the status of a Vehicle object to booked.
    */
   public void book()
   {
      book = true;
   }

   /**
    * Sets the status of a Vehicle object to available.
    */
   public void available()
   {
      reserve = false;
      book = false;
   }

   /**
    * Tells weather a Vehicle object is reserved or not.
    * 
    * @return true if the vehicle is reserved, else returns false
    */
   public boolean isReserved()
   {
      if (reserve == true)
      {
         return true;
      }
      else
         return false;
   }

   /**
    * Tells weather a Vehicle object is booked or not.
    * 
    * @return true if the vehicle is booked, else returns false
    */
   public boolean isBooked()
   {
      if (book == true)
      {
         return true;
      }
      else
         return false;
   }

   /**
    * Tells weather a Vehicle object is available or not.
    * 
    * @return true if the vehicle is available, else returns false
    */
   public boolean isAvailable()
   {
      if (reserve == false && book == false)
      {
         return true;
      }
      else
         return false;
   }

   /**
    * Displays a different message if the Vehicle object is booked, reserved or
    * available, telling the status of the Vehicle object.
    * 
    * @return a message with the status of the vehicle
    */
   public String Availability()
   {
      if (isBooked())
      {
         return "Booked";
      }
      else if (isReserved())
      {
         return "Reserved";
      }
      else
         return "Available";
   }

   /**
    * Indicates whether some other Vehicle object is "equal to" this one.
    */
   public boolean equals(Object obj)
   {
      if (!(obj instanceof Vehicle))
      {
         return false;
      }

      Vehicle other = (Vehicle) obj;
      return type.equals(other.type) && model.equals(other.model)
            && year == other.year && pricePerDay == other.pricePerDay
            && kilometers == other.kilometers
            && passengerNumber == other.passengerNumber
            && motorSize == other.motorSize && fuelType.equals(other.fuelType)
            && fuelUsage == other.fuelUsage
            && transmision.equals(other.transmision)
            && doorNumber == other.doorNumber
            && airCondition == other.airCondition
            && auxConnection == other.auxConnection
            && numberOfAirbags == other.numberOfAirbags
            && armRest == other.armRest && color.equals(other.color)
            && numberPlates.equals(other.numberPlates)
            && lastService == other.lastService;

   }

   /**
    * Returns a string containing all the details of the Vehicle object.
    */
   public String getVehicleDetails()
   {
      return "\nVehicle: " + type + "\nModel: " + model + "\nYear: " + year
            + "\nKilometers: " + kilometers + "\nMotor size: " + motorSize
            + "\nPassenger: " + passengerNumber + "\nFuel: " + fuelType
            + "\nFuel Usage: " + fuelUsage + "\nTransmision: " + transmision
            + "\nDoors: " + doorNumber + "\nAircondition: " + airCondition
            + "\nAUX: " + auxConnection + "\nAirbags: " + numberOfAirbags
            + "\nArm rest: " + armRest + "\nColor: " + color
            + "\nNumberplates: " + numberPlates + getServiceMessage();
   }

   /**
    * Returns a string representation of the Vehicle object.
    */
   public String toString()
   {
      return "\n" + model + " " + year;
   }
}
