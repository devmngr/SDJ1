
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadInitialData
{

   public static void main(String[] args)
   {
      VehicleList vehicles = new VehicleList(50);

      MyTextFileIO mtfio = new MyTextFileIO();
      String[] vehicleArray = null;
      try
      {
         vehicleArray = mtfio.readArrayFromFile("Vehicles.txt");

         for (int i = 0; i < vehicleArray.length; i++)
         {
            String temp = vehicleArray[i];
            String[] tempArr = temp.split(",");

            String type = tempArr[0];
            String model = tempArr[1];
            int year = Integer.parseInt(tempArr[2]);
            int pricePerDay = Integer.parseInt(tempArr[3]);
            int kilometers = Integer.parseInt(tempArr[4]);
            int passengerNumber = Integer.parseInt(tempArr[5]);
            double motorSize = Double.parseDouble(tempArr[6]);
            String fuelType = tempArr[7];
            double fuelUsage = Double.parseDouble(tempArr[8]);
            String transmission = tempArr[9];
            int doorNumber = Integer.parseInt(tempArr[10]);
            boolean airCondition = Boolean.parseBoolean(tempArr[11]);
            boolean auxConnection = Boolean.parseBoolean(tempArr[12]);
            int numberOfAirbags = Integer.parseInt(tempArr[13]);
            boolean armRest = Boolean.parseBoolean(tempArr[14]);
            String color = tempArr[15];
            String numberPlates = tempArr[16];
            int lastService = Integer.parseInt(tempArr[17]);
            
            int loadSize = Integer.parseInt(tempArr[18]);
            String maxCapacity = tempArr[19];
            int bedNumber = Integer.parseInt(tempArr[20]);

            if (type.equals("Family Car"))
            {
               vehicles.addVehicle(new FamilyCar(type, model, year,
                     pricePerDay, kilometers, passengerNumber, motorSize,
                     fuelType, fuelUsage, transmission, doorNumber,
                     airCondition, auxConnection, numberOfAirbags, armRest,
                     color, numberPlates, lastService));
            }
            else if (type.equals("Van"))
            {
               vehicles.addVehicle(new Van(type, model, year, pricePerDay,
                     kilometers, passengerNumber, motorSize, fuelType,
                     fuelUsage, transmission, doorNumber, airCondition,
                     auxConnection, numberOfAirbags, armRest, color,
                     numberPlates, lastService, loadSize));
               
            }
            else if (type.equals("Moving Truck"))
            {
               vehicles.addVehicle(new MovingTruck(type, model, year, pricePerDay, kilometers, passengerNumber, motorSize, fuelType, fuelUsage, transmission, doorNumber, airCondition, auxConnection, numberOfAirbags, armRest, color, numberPlates, lastService, maxCapacity));
            }
          
            else if (type.equals("Auto Camper"))
            {
               vehicles.addVehicle(new AutoCamper(type, model, year, pricePerDay, kilometers, passengerNumber, motorSize, fuelType, fuelUsage, transmission, doorNumber, airCondition, auxConnection, numberOfAirbags, armRest, color, numberPlates, lastService, bedNumber));
               
            }
            

         }

      }
      catch (FileNotFoundException e)
      {
         System.out.println("File not found, or could not be opened");
      }

      MyFileIO mfio = new MyFileIO();

      try
      {
         mfio.writeToFile("VehicleList.bin", vehicles);
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Error opening file ");
      }
      catch (IOException e)
      {
         System.out.println("IO Error writing to file ");
      }

      System.out.println("Done");
   }
}
