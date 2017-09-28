package Code;

import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * A class containing a RentalFileAdapter object which implements Serializable
 * @author Bogdan Mitrache
 * @version 1.0
 */
public class RentalFileAdapter
{
   private MyFileIO mfio;
   private String fileName;

   /**
    * Constructor initializing the RentalFileAdapter object for writing Rentals to a binary file.
    * @param fileName the name of the file to read and write to
    */
   public RentalFileAdapter(String fileName)
   {
      this.mfio = new MyFileIO();
      this.fileName = fileName;
   }

   /**
    * Use the MyFileIO class to retrieve a RentalList object with all Rentals
    * @return a list of rentals
    */
   public RentalList getRentalList()
   {
      RentalList rentals = new RentalList();

      try
      {
         rentals = (RentalList) mfio.readObjectFromFile(fileName);

      }
      catch (FileNotFoundException e)
      {
         System.out.println("File not found");
      }
      catch (IOException e)
      {
         System.out.println("IO Error reading file");
         e.printStackTrace();
      }
      catch (ClassNotFoundException e)
      {
         System.out.println("Class Not Found");
      }
      return rentals;
   }

   /**
    * Use the MyFileIO class to write to a file a RentalList object
    * @param rentals the RentalList object to write to file
    */
   public void saveRentals(RentalList rentals)
   {
      try
      {
         mfio.writeToFile(fileName, rentals);
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
   
   /**
    * Use the MyFileIO class to delete from a file a Rental object
    * @param rental the RentalList object to delete from file
    */
   public void deleteRental(Rental rental)
   {
      deleteRentalByBookingID(rental.getBookingID());
   }
   
   
/**
 * Use the MyFileIO class to delete from a file a Rental object by a booking ID
 * @param bookingID the Rental object booking ID
 */
   public void deleteRentalByBookingID(int bookingID)
   {
      RentalList rentals = getRentalList();
      
      int index = rentals.indexOfRental(bookingID);
      
      if(index !=-1)
      {
         RentalList rentals2 = new RentalList();
         for (int i = 0; i < rentals.size(); i++)
         {
            if (i != index)
            {
               rentals2.addRental(rentals.getRental(i));
            }
         }
         try
         {
            mfio.writeToFile(fileName, rentals2);
         }
         catch (FileNotFoundException e)
         {
            System.out.println("File not found");
         }
         catch (IOException e)
         {
            System.out.println("IO Error reading file");
         }
         
         
      }
   }
}
