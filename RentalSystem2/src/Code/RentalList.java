package Code;

import java.io.Serializable;
import java.util.ArrayList;

public class RentalList implements Serializable
{
   private ArrayList<Rental> rentals;

   public RentalList()
   {
      rentals = new ArrayList<Rental>();
   }

   public void addRental(Rental rental)
   {    
         rentals.add(rental);
   }
   public Rental getRentalByBookingID(int bookingid)
   {
      for (int i = 0; i < rentals.size(); i++)
      {
         if (rentals.get(i).getBookingID() == bookingid)
         {
           return rentals.get(i);
         }
      }
      return null;
   }
   public String toString()
   {
      String returnStr = "";

      for (int i = 0; i < rentals.size(); i++)
      {
         Rental temp = rentals.get(i);

         returnStr += temp + "\n";
      }
      return returnStr;
   }

}
