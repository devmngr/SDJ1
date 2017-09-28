public class HotelRoomTest
{

   public static void main(String[] args)
   {
      int roomNumberOne = 10;
      double rentOne = 2500;
      String guestOne = "Bogdan";
      HotelRoom hotelRoomOne = new HotelRoom(roomNumberOne, rentOne, guestOne);

      int roomNumber2 = 25;
      double rent2 = 3250;
      String guest2 = null;
      
      HotelRoom hotelRoom2 = new HotelRoom(roomNumber2, rent2);
      
      
      if (guestOne.equals("No One"))
      {
         System.out.println("The Room is for Rent");
      }
      else
      {
        hotelRoomOne.checkIn(guest2);
         System.out.println(guest2);
      }

   }

}
