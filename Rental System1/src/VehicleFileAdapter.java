
import java.io.FileNotFoundException;
import java.io.IOException;


public class VehicleFileAdapter
{
private MyFileIO mfio;
private String fileName;


public VehicleFileAdapter(String fileName)
{
   this.mfio= new MyFileIO();
   this.fileName =fileName;
}

//Use the MyFileIO class to retrieve a VehicleList object with all Vehicles
public VehicleList getAllVehicles()
{
   VehicleList vehicles = null;

   try
   {
      vehicles = (VehicleList)mfio.readObjectFromFile(fileName);
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

// Use the MyFileIO class to retrieve a VehicleList object with all available Vehicles
public VehicleList getAvailableVehicles()
{
   VehicleList vehicles = new VehicleList(50);

   try
   {
      VehicleList result = (VehicleList)mfio.readObjectFromFile(fileName);

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
//Use the MyFileIO class to retrieve a VehicleList object with all reserved Vehicles
public VehicleList getReservedVehicles()
{
   VehicleList vehicles = new VehicleList(50);

   try
   {
      VehicleList result = (VehicleList)mfio.readObjectFromFile(fileName);

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

//Use the MyFileIO class to retrieve a VehicleList object with all booked Vehicles
public VehicleList getBookedVehicles()
{
   VehicleList vehicles = new VehicleList(50);

   try
   {
      VehicleList result = (VehicleList)mfio.readObjectFromFile(fileName);

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


////// Use the MyFileIO class to retrieve a VehicleList object with all unavailable Vehicles!!!!!!!!!!!!!
public VehicleList getUnavailableVehicles()
{
   VehicleList vehicles = new VehicleList(50);

   try
   {
      VehicleList result = (VehicleList)mfio.readObjectFromFile(fileName);

      for (int i = 0; i < result.size(); i++)
      {
         if (!(result.getVehicle(i).isAvailable()))
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

// Use the MyFileIO class to save all Vehicles in the VehicleList object
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




