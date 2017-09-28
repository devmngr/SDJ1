package ex2;
public class Apartment
{
   private int number;
   private Tenant tenant;

   public Apartment(int number)
   {
      this.number = number;
      tenant=null;
   }

   public int getNumber()
   {
      return number;
   }

   public boolean isAvailable()
   {
      if (tenant != null)
      {
         return false;
      }
      else
      {
         return true;
      }
   }
   
   public void rentTo(Tenant tenant, MyDate rentedFrom)
   {
      this.tenant=tenant;
      rentedFrom = tenant.getRentedFrom().copy();
      
   }
   
   public Tenant getTenant()
   {
      return tenant;
   }
   
   public String toString()
   {
      return "Apartment " + number;
   }

}
