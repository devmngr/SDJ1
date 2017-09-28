package ex2;
import java.io.ObjectInputStream.GetField;

public class Test
{

   public static void main(String[] args)
   {
      MyDate date = new MyDate(1, 04, 2016);
      MyDate date2 = new MyDate(11, 8, 1992);
      
      Tenant tenant = new Tenant("Bogdan");
      tenant.setRentedFrom(date);
      
      Tenant bogdan = new Tenant("Bogdan");
      bogdan.setRentedFrom(date2);
      
      Tenant alex = new Tenant("Alex");
      alex.setRentedFrom(date2);
      
      Apartment boss = new Apartment(1);
      boss.rentTo(tenant, date);
      Apartment lux = new Apartment(3);
      lux.rentTo(bogdan, date2);
      Apartment cocioaba = new Apartment(66);
      cocioaba.rentTo(alex, date2);
      Apartment casa = new Apartment(20);
      
      ApartmentComplex complex = new ApartmentComplex("Sibiu");
      complex.add(boss);
      complex.add(lux);
      complex.add(cocioaba);
      complex.add(casa);
    
      

      System.out.println(complex.getApartmentByTenant(tenant));
      System.out.println(complex.getApartmentByTenant(bogdan));

      

      

   }

}
