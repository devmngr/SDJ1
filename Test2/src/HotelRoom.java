public class HotelRoom
{
   private int roomNumber;
   private double rent;
   private String guest;

   public HotelRoom(int roomNumber, double rent, String guest)
   {
      this.roomNumber = roomNumber;
      this.rent = rent;
      this.guest = guest;
   }

   public HotelRoom(int roomNumber, double rent)
   {
      this.roomNumber = roomNumber;
      this.rent = rent;
      guest = "No one";
   }

   public int getRoomNumber()
   {
      return roomNumber;
   }

   public String getGuest()
   {
      return guest;
   }

   public double getRent()
   {
      return rent;
   }

   public void setRent(double rent)
   {
      this.rent = rent;
   }

   public boolean isAvailable()
   {
      if (guest.equals("No one"))
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   public void checkIn(String guest)
   {
      if (isAvailable() == true)
      {
         this.guest = guest;
      }

   }

   public void checkOut()
   {
      guest = "No one";
   }

   public String toString()
   {
      if (isAvailable() == true)
      {
         return "Room: " + roomNumber + "\tRent: " + rent;
      }
      else
      {
         return "Room: " + roomNumber + "\tRent: " + rent + "\tGuest: " + guest;
      }
   }

}
