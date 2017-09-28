package ex4;
import java.util.ArrayList;

import javax.lang.model.type.ArrayType;


public class CarRental 
{
   private String companyName;
   private String address;
   private ArrayList<Car> carsForRent;
   
   public CarRental(String companyName, String address)
   {
      this.companyName=companyName;
      this.address=address;
      carsForRent = new ArrayList<Car>();
   }
   public String getCompanyName()
   {
      return companyName;
   }
   public String getAddress()
   {
      return address;
   }
   public  int getNumberOfCars()
   {
      return carsForRent.size();
   }
   public Car getCar(int index)
   {
      return carsForRent.get(index);
   }
   public void addCar(Car car)
   {
      carsForRent.add(car);
   }
   public  Car getCarByLicense(String licenseNo)
   {
      for (int i = 0; i<carsForRent.size(); i++)
      {
         if(carsForRent.get(i).getLicenseNo().equals(licenseNo))
         {
            return carsForRent.get(i);
         }
      }
      return null;
   }
   
   public SportsCar getAvailableSportsCar()
   {
      ArrayList<SportsCar> temp = new ArrayList<SportsCar>();
      for (int i = 0; i<carsForRent.size(); i++)
      {
         if(carsForRent.get(i).isAvailable() && carsForRent.get(i) instanceof SportsCar)
         {
            temp.add((SportsCar)carsForRent.get(i));
           
         }
         return temp.get(i);
         
      }
      
      return null;
   }
   
   public Van getAvailableVan(int minCapacity)
   {
      Van temp = null;
      Van[] vans = new Van[carsForRent.size()];
      int index =0;
      
      for (int i = 0; i<carsForRent.size(); i++)
      {
         if(carsForRent.get(i).isAvailable() && carsForRent.get(i) instanceof Van)
         {
            temp = (Van)carsForRent.get(i);
            
            if (temp.getCapacity() >= minCapacity)
            {
               vans[index] = temp;
               index++;
            }
         }
      }
      for(int i= 0; i<carsForRent.size(); i++)
      {
         return vans[i];
      }
      return null;
   }
   
   
}
