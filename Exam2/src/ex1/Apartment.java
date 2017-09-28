package ex1;

public class Apartment extends Residence
{
   private int numberOfRooms;
   
   public Apartment(int number, double size, int numberOfRooms)
   {
      super(number,size,"Apartament");
      this.numberOfRooms=numberOfRooms;
   }
   @Override
   public int getNumberOfRooms()
   {
      return numberOfRooms;
   }
}
