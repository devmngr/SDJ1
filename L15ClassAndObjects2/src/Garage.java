
public class Garage
{
   private Car Car1;
   private Car Car2;
   
   public Garage()
   {
      Car1 = null;
      Car2 = null;
   }
   public boolean isParkingAreaTaken(int position)
   {
      if(position==1 || position == 2)
      {
         return true;
      }
      else
      {
      return false;
      }
   }
   public void park(Car Car1, int position)
   {
      
      
      if(isParkingAreaTaken(1) || isParkingAreaTaken(2))
            {
               
            }
   }
   
   
}
