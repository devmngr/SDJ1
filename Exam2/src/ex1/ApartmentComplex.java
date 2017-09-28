package ex1;
import java.util.ArrayList;
import java.util.Iterator;

public class ApartmentComplex
{
   private String address;
   private ArrayList<Residence> residences;

   public ApartmentComplex(String address)
   {
      this.address = address;
      residences = new ArrayList<Residence>();
   }

   public int getNumberOfResidences()
   {
      return residences.size();
   }

   public void add(Residence residence)
   {
      residences.add(residence);
   }

   public Residence getResidences(int index)
   {
      return residences.get(index);
   }

   public Residence getResidencebyNumber(int number)
   {
      for (int i = 0; i < residences.size(); i++)
      {
         if (residences.get(i).getNumber() == number)
         {
            return residences.get(i);
         }
      }
      return null;
   }

   public Room getFirstAvailableRoom()
   {
      Room temp = null;
      for (int i = 0; i < residences.size(); i++)
      {
         if (residences.get(i) instanceof Room
               && residences.get(i).isAvailable())
         {
            temp = (Room) residences.get(i);

         }
      }
      return temp;
   }

   public Apartment getFirstAvailableApartment(int minNoOfRooms)
   {
      Apartment temp = null;
      for (int i = 0; i < residences.size(); i++)
      {
         if (residences.get(i) instanceof Apartment
               && residences.get(i).isAvailable()
               && residences.get(i).getNumberOfRooms() >= minNoOfRooms)
         {
            temp = (Apartment) residences.get(i);

         }
      }
      return temp;
   }

}
