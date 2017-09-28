package ex1;
public class Test
{

   public static void main(String[] args)
   {
      MyDate date1 = new MyDate(18, 05, 2016);
      Tenant tenant1 = new Tenant("Bogdan");

      Apartment ap1 = new Apartment(1, 30, 5);
      Apartment ap2 = new Apartment(2, 29, 3);
      Apartment ap3 = new Apartment(3, 60, 5);

      Room room4 = new Room(4, 20);
      Room room5 = new Room(5, 25);
      Room room6 = new Room(6, 26);
      
      ApartmentComplex complex = new ApartmentComplex("Arhus");
      
      complex.add(ap1);
      complex.add(ap2);
      complex.add(ap3);
      complex.add(room4);
      complex.add(room5);
      complex.add(room6);
      
      System.out.println(complex.getResidencebyNumber(5));
   }

}
