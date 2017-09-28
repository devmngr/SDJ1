package Code;

import java.io.Serializable;

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

   public String getType()
   {
      return type;
   }
   public String getModel()
   {
      return model;
   }
   public int getYear()
   {
      return year;
   }
   public int getPricePerDay()
   {
      return pricePerDay;
   }
   public int getKilometers()
   {
      return kilometers;
   }
   public int getPassengerNumber()
   {
      return passengerNumber;
   }
   public double getMotorSize()
   {
      return motorSize;
   }
   public String getFuelType()
   {
      return fuelType;
   }
   public double getFuelUsage()
   {
      return fuelUsage;
   }
   public String getTransmision()
   {
      return transmision;
   }
   public int getDoorNumber()
   {
      return doorNumber;
   }
   public int getNumberOfAirbags()
   {
      return numberOfAirbags;
   }
   public String getColor()
   {
      return color;
   }
   public String getNumberPlates()
   {
      return numberPlates;
   }
   public int getLastService()
   {
      return lastService;
   }

   public void setLastService(int kilometer)
   {
      this.lastService = kilometer;
   }

   public String getWarningMesage()
   {
      int warning = 20000;
      int service = kilometers - lastService;
      if (service >= warning)
      {
         return "\nService Check - 20000 km exeeded";
      }
      else
         return "\nService in " + service + " km";
   }

   public void reserve()
   {
      reserve = true;
   }

   public void book()
   {
      book = true;
   }

   public void available()
   {
      reserve = false;
      book = false;
   }

   public boolean isReserved()
   {
      if (reserve == true)
      {
         return true;
      }
      else
         return false;
   }

   public boolean isBooked()
   {
      if (book == true)
      {
         return true;
      }
      else
         return false;
   }

   public boolean isAvailable()
   {
      if (reserve == false && book == false)
      {
         return true;
      }
      else
         return false;
   }

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

   @Override
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

   public String getVehicleDetails()
   {
      return "\nVehicle: " + type + "\nModel: " + model + "\nYear: " + year
            + "\nKilometers: " + kilometers + "\nMotor size: " + motorSize
            + "\nPassenger: " + passengerNumber + "\nFuel: " + fuelType
            + "\nFuel Usage: " + fuelUsage + "\nTransmision: " + transmision
            + "\nDoors: " + doorNumber + "\nAircondition: " + airCondition
            + "\nAUX: " + auxConnection + "\nAirbags: " + numberOfAirbags
            + "\nArm rest: " + armRest + "\nColor: " + color
            + "\nNumberplates: " + numberPlates + getWarningMesage();
   }

   @Override
   public String toString()
   {
      return model + " " + year;
   }

   // public String toString()
   // {
   // if (isBooked() || isReserved())
   // {
   // return model + "\nNumberplates: "
   // + numberPlates + "\nPrice per day: " + pricePerDay;
   // }
   // else
   // return model + "\nYear: " + year
   // + "\nKilometers: " + kilometers + "\nMotor size: " + motorSize
   // + "\nPassenger: " + passengerNumber + "\nFuel: " + fuelType
   // + "\nFuel Usage: " + fuelUsage + "\nTransmision: " + transmision
   // + "\nDoors: " + doorNumber + "\nAircondition: " + airCondition
   // + "\nAUX: " + auxConnection + "\nAirbags: " + numberOfAirbags
   // + "\nArm rest: " + armRest + "\nColor: " + color
   // + "\nNumberplates: " + numberPlates + getWarningMesage()
   // + "\nPrice per day: " + pricePerDay;
   // }
}
