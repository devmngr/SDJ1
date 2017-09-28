package ex1;

public class Room
{
   private int number;
   private Guest guest;
   private Bed bed;
   
   public Room(int number, String bedType)
   {
      this.number=number;
      this.bed=new Bed(bedType);
      this.guest=null;
   }
   
   public int getNumber()
   {
      return number;
   }
   
   public  int getFloor()
   {
      return number/100;
   }
   
   public double getPrice()
   {
      if(bed.isSingle())
      {
         return 59.50;
      }
      else if(bed.isDouble())
      {
         return 72.40;
      }
      else
      {
         return 89.00;
      }
   }
   
   public boolean isOccupied()
   {
      return guest != null;
   }
   
   public void registerGuest(Guest guest)
   {
      this.guest=guest;
   }
   public void vacate()
   {
      guest=null;
   }
   
   public String getBedType()
   {
      if(bed.isSingle())
      {
         return "Single";
      }
      else if(bed.isDouble())
      {
         return "Double";
      }
      else
      {
         return "King Size";
      }
   }
   public Guest getGuest()
   {
      return guest;
   }
   
   
}
