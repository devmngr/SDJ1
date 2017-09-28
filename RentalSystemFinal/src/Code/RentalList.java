package Code;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * A class containing a RentalList object and implements Serializable.
 * 
 * @author Bogdan Mitrache
 * @version 1.0
 */
public class RentalList implements Serializable
{
   private ArrayList<Rental> rentals;

   /**
    * Constructor initializing the list of rentals.
    */
   public RentalList()
   {
      rentals = new ArrayList<Rental>();
   }
   /**
   * Adds a Rental to the list.
   * @param rental the Rental object to add to the list
   */
   public void addRental(Rental rental)
   {    
         rentals.add(rental);
   }
   /**
    * Gets a Rental from the list at the position index in the list.
    * @param index the position in the list of the Rental object.
    * @return the Rental at index if one exists, else null.
    */
   public Rental getRental(int index)

   {
      if(index<rentals.size())
      {
         return rentals.get(index);
      }
      else
      {
         return null;
      }
   }
   /**
    * Gets the number of Rentals in the list
    * @return the number of Rental objects in a list
    */
   public int size()
   {
      return rentals.size();
   }
   /**
    * Gets a Rental from the list containing the same booking ID.
    * @param bookingid the booking ID/number to search in the list of Rentals.
    * @return the Rental having the given booking ID if one exists, else null.
    */
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
   /**
    * Gets a Rental from the list containing the same booking ID.
    * @param bookingID the booking ID to check for, in the list of the Rental objects.
    * @return the index of Rental if one exists, else null.
    */
   public int indexOfRental(int bookingID)
   {
      for (int i = 0; i<rentals.size();i++)
      {
         Rental temp = rentals.get(i);
         
         if(temp.getBookingID() == bookingID)
         {
            return i;
         }
      }
      return -1;
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
