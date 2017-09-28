package Code;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 * A class containing a VehicleList object and implements Serializable.
 * 
 * @author Bogdan Mitrache
 * @version 1.0
 */
public class VehicleList implements Serializable
{
   private ArrayList<Vehicle> vehicles;

   /**
    * Constructor initializing the list of vehicles.
    */
   public VehicleList()
   {
      vehicles = new ArrayList<Vehicle>();
   }
/**
 * Gets all models of a Vehicle object from a list of Vehicles
 * @return all vehicle models
 */
   public VehicleList getVehicleModels()
   {
      VehicleList temp = new VehicleList();
      for (int i = 0; i < vehicles.size(); i++)
      {

         Vehicle list = vehicles.get(i);
         temp.addVehicle(list);

      }
      return temp;
   }

   /**
   * Adds a Vehicle to the list.
   * @param vehicle the vehicle to add to the list
   */
   public void addVehicle(Vehicle vehicle)
   {

      vehicles.add(vehicle);

   }
/**
 * Adds a Vehicle to the list at the position index in the list.
 * @param index the position in the list of the Vehicle object.
 * @return the Vehicle at index if one exists, else null.
 */
   public Vehicle getVehicle(int index)
   {
      return vehicles.get(index);
   }
/**
 * Gets the size of a list of Vehicles
 * @return the number of Vehicles the list has.
 */
   public int size()
   {
      return vehicles.size();
   }
   
   /**
    * Pops up a dialog message with e warning message, or displays an information message
    * @return a warning message if the car has exceeded the amount of kilometers until service. 
    */
   public String getWarningMesage()
   {
      String str = "";

      for (int i = 0; i < vehicles.size(); i++)
      {
         if (vehicles.get(i).needsService())
         {
            
            JOptionPane.showMessageDialog(null,
                  vehicles.get(i).getNumberPlates()
                  + " needs service !!!", "WARNING",
                  JOptionPane.WARNING_MESSAGE);
         }
         else
            str = "\nService at: "
                  + (vehicles.get(i).getLastService() + 20000) + " km";
      }
      return str;
   }
/**
 * Gets a Vehicle from the list by the type
 * @param type the type of the Vehicle object
 * @return all the Vehicles of the same type
 */
   public String getVehicleByType(String type)
   {
      String temp = "";
      for (int i = 0; i < vehicles.size(); i++)
      {
         if (vehicles.get(i).getType().equals(type))
         {
            Vehicle list = vehicles.get(i);
            temp += list + "\n";
         }
      }
      return temp;
   }
   /**
    * Gets the index of a Vehicle from the list by the number plates
    * @param numberPlates the number plates of the Vehicle object 
    * @return the index of the Vehicle matching the given number plates
    */
   public int indexOfNumberPlates(String numberPlates)
   {
      for (int i = 0; i < vehicles.size(); i++)
      {
         Vehicle temp = vehicles.get(i);

         if (temp.getNumberPlates().equals(numberPlates))
         {
            return i;
         }
      }
      return -1;
   }

   /**
    * Gets a Vehicle from the list by the number plates
    * @param the number plates of the Vehicle object
    * @return all the Vehicles that have the same number plates
    */
   public Vehicle getVehicleByNumberPlates(String numberPlates)
   {
      if (indexOfNumberPlates(numberPlates) != -1)
      {
         return vehicles.get(indexOfNumberPlates(numberPlates));
      }
      else
      {
         return null;
      }
   }
/**
 * Gets the number of available Vehicle objects from the list by type of the Vehicle
 * @param type the type of the Vehicle
 * @return number of available Vehicles
 */
   public int getNumberOfAvailableVehiclesByType(String type)
   {
      int count = 0;
      for (int i = 0; i < vehicles.size(); i++)
      {
         if (vehicles.get(i) instanceof Vehicle
               && vehicles.get(i).isAvailable()
               && vehicles.get(i).getType().equals(type))
         {
            count++;
         }
      }
      return count;
   }
   /**
    * Gets the number of booked Vehicle objects from the list
    * @return number of booked Vehicles
    */
   public int getNumberOfBookedVehicles()
   {
      int count = 0;
      for (int i = 0; i < vehicles.size(); i++)
      {
         if (vehicles.get(i) instanceof Vehicle && vehicles.get(i).isBooked())
         {
            count++;
         }
      }
      return count;
   }
   /**
    * Gets the number of reserved Vehicle objects from the list
    * @return number of reserved Vehicles
    */
   public int getNumberOfReservedVehicles()
   {
      int count = 0;
      for (int i = 0; i < vehicles.size(); i++)
      {
         if (vehicles.get(i) instanceof Vehicle && vehicles.get(i).isReserved())
         {
            count++;
         }
      }
      return count;
   }
/**
 * Gets a string of all available Vehicle objects from the list
 * @return all available Vehicles
 */
   public String getAvailableVehicles()
   {
      String temp = "";
      for (int i = 0; i < vehicles.size(); i++)
      {
         if (vehicles.get(i).isAvailable())
         {
            Vehicle list = vehicles.get(i);
            temp += list + "\n";
         }
      }
      return temp;
   }
/**
 *  Gets a list of all available Vehicle objects of this type
 * @param type the type of Vehicle
 * @return all available Vehicles of the given type
 */
   public VehicleList getAvailableVehicleModelsByType(String type)
   {
      VehicleList temp = new VehicleList();
      for (int i = 0; i < vehicles.size(); i++)
      {
         if (vehicles.get(i).isAvailable()
               && vehicles.get(i).getType().equals(type))
         {
            Vehicle list = vehicles.get(i);
            temp.addVehicle(list);
         }
      }
      return temp.getVehicleModels();
   }
   /**
    * Gets a string of all booked Vehicle objects from the list
    * @return all booked Vehicles
    */
   public String getBookedVehicles()
   {
      String temp = "";
      for (int i = 0; i < vehicles.size(); i++)
      {
         if (vehicles.get(i).isBooked())
         {
            Vehicle list = vehicles.get(i);
            temp += list + "\n";
         }
      }
      return temp;
   }
   /**
    * Gets a string of all reserved Vehicle objects from the list
    * @return all reserved Vehicles
    */
   public String getReservedVehicles()
   {
      String temp = "";
      for (int i = 0; i < vehicles.size(); i++)
      {
         if (vehicles.get(i).isReserved())
         {
            Vehicle list = vehicles.get(i);
            temp += list + "\n";
         }
      }
      return temp;
   }
   /**
    * Indicates whether some other VehicleList object is "equal to" this one.
    */
   public boolean equals(Object obj)
   {
      if (!(obj instanceof VehicleList))
      {
         return false;
      }

      VehicleList other = (VehicleList) obj;

      if (vehicles.size() != other.vehicles.size())
      {
         return false;
      }
      else
      {
         for (int i = 0; i < vehicles.size(); i++)
         {
            if (vehicles.get(i) == null && other.vehicles.get(i) != null)
            {
               return false;
            }
            else if (vehicles.get(i) != null)
            {
               if (!(vehicles.get(i) == (other.vehicles.get(i))))
               {
                  return false;
               }
            }

         }
         return true;
      }
   }
   /**
    * Returns a string representation of the VehicleList object.
    */
   public String toString()
   {
      String returnStr = "";

      for (int i = 0; i < vehicles.size(); i++)
      {
         Vehicle temp = vehicles.get(i);

         returnStr += temp + "\n";
      }
      return returnStr;
   }

}
