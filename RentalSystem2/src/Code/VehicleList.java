package Code;

import java.io.Serializable;
import java.util.ArrayList;

public class VehicleList implements Serializable
{
   private ArrayList<Vehicle> vehicles;

   public VehicleList()
   {
      vehicles = new ArrayList<Vehicle>();
   }

   public VehicleList getVehicleModels()
   {
      VehicleList temp = new VehicleList();
      for (int i = 0; i<vehicles.size();i++)
      {
         
         Vehicle list = vehicles.get(i);
         temp.addVehicle(list);
      
      }
      return temp;
   }
   public void addVehicle(Vehicle vehicle)
   {
     
         vehicles.add(vehicle);
      
   }
   
   public Vehicle getVehicle(int index)
   {
      return vehicles.get(index);
   }

   public int size()
   {
      return vehicles.size();
   }
   public String getVehicleByType(String type)
   {
      String temp = "";
      for (int i = 0; i<vehicles.size();i++)
      {
      if(vehicles.get(i).getType().equals(type))
      {
         Vehicle list = vehicles.get(i);
         temp += list + "\n";
      }
      }
      return temp;
   }

   public int getNumberOfAvailableVehiclesByType(String type)
   {
      int count = 0;
      for (int i = 0; i < vehicles.size(); i++)
      {
         if (vehicles.get(i) instanceof Vehicle
               && vehicles.get(i).isAvailable()&& vehicles.get(i).getType().equals(type))
         {
            count++;
         }
      }
      return count;
   }

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
  /* public String getUnavailableVehicles()
   {
      String temp = "";
      for (int i = 0; i < vehicles.size(); i++)
      {
         if (vehicles.get(i).isAvailable())
         {
            Vehicle list = vehicles.get(i);
            temp += list.getType() + "\t" + list.getModel() + "\t" + list.Availability() + "\t" 
                   +"Time Left";
         }
      }
      return temp;
   }
   */
   public VehicleList getAvailableVehicleModelsByType(String type)
   {
      VehicleList temp = new VehicleList();
      for (int i = 0; i < vehicles.size(); i++)
      {
         if (vehicles.get(i).isAvailable()&& vehicles.get(i).getType().equals(type))
         {
            Vehicle list = vehicles.get(i);
            temp.addVehicle(list);
         }
      }
      return temp.getVehicleModels();
   }

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
   
   public boolean equals(Object obj)
   {
      if(!(obj instanceof VehicleList))
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
