
import java.io.Serializable;
import java.util.ArrayList;

public class RentalList implements Serializable
{
   private int numberOfRentals;
   private ArrayList<Rental> rentals;
   
   public RentalList(int maxNumberofRentals)
   {
      this.numberOfRentals=maxNumberofRentals;
      rentals = new ArrayList<Rental>();
   }
   
   public void addRental(Rental rental)
   {
      if(rentals.size()< numberOfRentals)
      {
         rentals.add(rental);
      }
   }
   
   public String toString()
   {
      String returnStr = "";
      
      for(int i = 0; i<rentals.size(); i++)
      {
         Rental temp = rentals.get(i);
      
         returnStr += temp +"\n";
      }  
      return returnStr;
   }
   
}
