package ex2;
import java.util.*;

public class ApartmentComplex
{
   private String address;
   private ArrayList<Apartment> apartments = new ArrayList<Apartment>();

   public ApartmentComplex(String address)
   {
      this.address = address;
   }

   public int getNumberOfApartments()
   {
      return apartments.size();
   }

   public void add(Apartment apartment)
   {
      apartments.add(apartment);
   }

   public Apartment getApartment(int index)
   {
      return apartments.get(index);
   }

   public Apartment getApartmentByNumber(int number) //I think is wrong
                                                     ///Not working as supposed                                                     
   {
      for (int i = 0; i < apartments.size(); i++)     
      {
         if (apartments.get(i).equals(apartments.get(number)))
         {
            return getApartment(number);
         }
      }
      return null;
   }

   public Apartment getApartmentByTenant(Tenant tenant) ///do not get it. for some reason i can not use .getTenant or similar...
   {
      for (int i = 0; i < apartments.size(); i++)
      {
         if(apartments.get(i).getTenant().equals(tenant))
         {
            return apartments.get(i);
         }
      }
      return null;
   }
   
   public Apartment getFirstAvailableApartment() ////same shit 
   {
      for(int i=0; i<apartments.size(); i++)
      {
         if(apartments.get(i))
         {
            
         }
      }
   }

   public String toString()
   {
      return "Apartment Complex " + address + "\nNumber of Apartments "
            + getNumberOfApartments();
   }

}
