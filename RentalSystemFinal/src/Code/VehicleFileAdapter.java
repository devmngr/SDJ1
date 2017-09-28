package Code;

import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * A class containing a VehicleFileAdapter object which implements Serializable
 * @author Bogdan Mitrache
 * @version 1.0
 */
public class VehicleFileAdapter
{
   private MyFileIO mfio;
   private String fileName;
   /**
    * Constructor initializing the VehicleFileAdapter object for writing Rentals to a binary file.
    * @param fileName  the name of the file to read and write to
    */
   public VehicleFileAdapter(String fileName)
   {
      this.mfio = new MyFileIO();
      this.fileName = fileName;
   }


   /**
    * Use the MyFileIO class to retrieve a VehicleList object with all Vehicles
    * @return a list of vehicles
    */
   public VehicleList getAllVehicles()
   {
      VehicleList vehicles = null;

      try
      {
         vehicles = (VehicleList) mfio.readObjectFromFile(fileName);
      }
      catch (FileNotFoundException e)
      {
         System.out.println("File not found");
      }
      catch (IOException e)
      {
         System.out.println("IO Error reading file");
      }
      catch (ClassNotFoundException e)
      {
         System.out.println("Class Not Found");
      }
      return vehicles;
   }

   /**
    *    Use the MyFileIO class to retrieve a VehicleList object with all available Vehicles
    * @return a list of all available Vehicle objects.
    */
   public VehicleList getAvailableVehicles()
   {
      VehicleList vehicles = new VehicleList();

      try
      {
         VehicleList result = (VehicleList) mfio.readObjectFromFile(fileName);

         for (int i = 0; i < result.size(); i++)
         {
            if (result.getVehicle(i).isAvailable())
            {
               vehicles.addVehicle(result.getVehicle(i));
            }
         }
      }

      catch (FileNotFoundException e)
      {
         System.out.println("File not found");
      }
      catch (IOException e)
      {
         System.out.println("IO Error reading file");
      }
      catch (ClassNotFoundException e)
      {
         System.out.println("Class Not Found");
      }

      return vehicles;
   }

   /**
    * Use the MyFileIO class to retrieve a VehicleList object with all reserved Vehicles
    * @return a list of all reserved Vehicle objects.
    */
   public VehicleList getReservedVehicles()
   {
      VehicleList vehicles = new VehicleList();

      try
      {
         VehicleList result = (VehicleList) mfio.readObjectFromFile(fileName);

         for (int i = 0; i < result.size(); i++)
         {
            if (result.getVehicle(i).isReserved())
            {
               vehicles.addVehicle(result.getVehicle(i));
            }
         }
      }

      catch (FileNotFoundException e)
      {
         System.out.println("File not found");
      }
      catch (IOException e)
      {
         System.out.println("IO Error reading file");
      }
      catch (ClassNotFoundException e)
      {
         System.out.println("Class Not Found");
      }

      return vehicles;
   }

   /**
    * Use the MyFileIO class to retrieve a VehicleList object with all booked Vehicles  
    * @return a list of all booked Vehicle objects
    */
   public VehicleList getBookedVehicles()
   {
      VehicleList vehicles = new VehicleList();

      try
      {
         VehicleList result = (VehicleList) mfio.readObjectFromFile(fileName);

         for (int i = 0; i < result.size(); i++)
         {
            if (result.getVehicle(i).isBooked())
            {
               vehicles.addVehicle(result.getVehicle(i));
            }
         }
      }

      catch (FileNotFoundException e)
      {
         System.out.println("File not found");
      }
      catch (IOException e)
      {
         System.out.println("IO Error reading file");
      }
      catch (ClassNotFoundException e)
      {
         System.out.println("Class Not Found");
      }

      return vehicles;
   }

   /**
    * Use the MyFileIO class to retrieve all unavailable Vehicles
    * @return a string of all unavailable Vehicles
    */
   public String getUnavailableVehicles()
   {
      VehicleList vehicles = new VehicleList();
      String str = "";

      try
      {
         VehicleList result = (VehicleList) mfio.readObjectFromFile(fileName);

         for (int i = 0; i < result.size(); i++)
         {
            if (!(result.getVehicle(i).isAvailable()))
            {
               vehicles.addVehicle(result.getVehicle(i));
            }
         }
         for (int i = 0; i < vehicles.size(); i++)
         {
            str += "\t" + vehicles.getVehicle(i).getType() + "\t\t"
                  + vehicles.getVehicle(i).getModel() + "\t\t"
                  + vehicles.getVehicle(i).getNumberPlates() + "\t\t"
                  + vehicles.getVehicle(i).Availability() + "\n";
         }

      }

      catch (FileNotFoundException e)
      {
         System.out.println("File not found");
      }
      catch (IOException e)
      {
         System.out.println("IO Error reading file");
      }
      catch (ClassNotFoundException e)
      {
         System.out.println("Class Not Found");
      }

      return str;
   }
/**
 * Changes the status of a Vehicle to booked
 * @param numberPlates the number plates of the Vehicle object to change the status
 */
   public void changeStatusBooked(String numberPlates)
   {
      VehicleList vehicles = getAllVehicles();

      for (int i = 0; i < vehicles.size(); i++)
      {
         Vehicle vehicle = vehicles.getVehicle(i);

         if (vehicle.getNumberPlates().equals(numberPlates))
         {
            vehicle.book();
         }
      }

      saveVehicles(vehicles);
   }
   /**
    * Changes the status of a Vehicle to reserved
    * @param numberPlates the number plates of the Vehicle object to change the status
    */
   public void changeStatusReserved(String numberPlates)
   {
      VehicleList vehicles = getAllVehicles();

      for (int i = 0; i < vehicles.size(); i++)
      {
         Vehicle vehicle = vehicles.getVehicle(i);

         if (vehicle.getNumberPlates().equals(numberPlates))
         {
            vehicle.reserve();
         }
      }

      saveVehicles(vehicles);
   }
   /**
    * Changes the status of a Vehicle to available
    * @param numberPlates the number plates of the Vehicle object to change the status
    */
   public void changeStatusAvailable(String numberPlates)
   {
      VehicleList vehicles = getAllVehicles();

      for (int i = 0; i < vehicles.size(); i++)
      {
         Vehicle vehicle = vehicles.getVehicle(i);

         if (vehicle.getNumberPlates().equals(numberPlates))
         {
            vehicle.available();
         }
      }

      saveVehicles(vehicles);
   }
/**
 * Sets the number of kilometers at service of a Vehicle by the number plates.
 * @param numberPlates the number plates of the Vehicle object
 * @param kilometersAtService the number of kilometers of the Vehicle when finished the service
 */
   public void setService(String numberPlates, int kilometersAtService)
   {
      VehicleList vehicles = getAllVehicles();

      for (int i = 0; i < vehicles.size(); i++)
      {
         Vehicle vehicle = vehicles.getVehicle(i);

         if (vehicle.getNumberPlates().equals(numberPlates))
         {
            vehicle.setLastService(kilometersAtService);
         }
      }

      saveVehicles(vehicles);
   }

   // Use the MyFileIO class to save all Vehicles in the VehicleList object
   /**
    * Saves a list of vehicles to a binary file
    * @param vehicles the VehicleList object to save
    */
   public void saveVehicles(VehicleList vehicles)
   {
      try
      {
         mfio.writeToFile(fileName, vehicles);
      }
      catch (FileNotFoundException e)
      {
         System.out.println("File not found");
      }
      catch (IOException e)
      {
         System.out.println("IO Error writing to file");
      }
   }

}