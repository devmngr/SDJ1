package ex1;
import java.util.ArrayList;

public class Hotel
{
   private String name;
   private Room[] rooms;
   
   public Hotel(String name, Room[] rooms)
   {
      this.name=name;
      this.rooms = rooms;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getNumberOfRooms()
   {
      return rooms.length;
   }
   
   public int getNumberOfAvailableRooms()
   {
      int count=0;
      for(int i=0;i<rooms.length;i++)
      {
         if (!rooms[i].isOccupied())
         {
            count++;
         }
         
      }
      return count;
   }
   
   public Room getFirstAvailableRoom()
   {
      
      for (int i=0; i<rooms.length; i++)
      {
         if(!rooms[i].isOccupied())
         {
            return rooms[i];
         }
      }
      return null;
   }
   public Room getFirstAvailablRoom(double maxPrice)
   {
      for(int i=0; i<rooms.length;i++)
      {
         if(!rooms[i].isOccupied() && rooms[i].getPrice()<=maxPrice)
         {
            return rooms[i];
         }
      }
      return null;
   }
   public Room[] getAllAvailablRoom(String bedType)
   {
      ArrayList <Room> list = new ArrayList<>();
      
      for(int i=0; i<rooms.length;i++)
      {
         if(!rooms[i].isOccupied() && rooms[i].getBedType().equals(bedType))
         {
            list.add(rooms[i]);
         }
      }
      return (Room[])list.toArray();
   }
   
   
   public boolean hasGuest(Guest guest)
   {
      for (int i=0; i<rooms.length; i++)
      {
         if (rooms[i].isOccupied() && rooms[i].getGuest().equals(guest))
         {
            return true;
         }
      }
      return false;
   }
   
   public Room getRoom(Guest guest)
   {
      for (int i=0; i<rooms.length; i++)
      {
         if (rooms[i].isOccupied() && rooms[i].getGuest().equals(guest))
         {
            return rooms[i];
         }
      }
      return null;
   }
   
   
   
}
