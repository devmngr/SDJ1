package ex3;

public class Service
{
   private int mileage;
   private Date date;
   
   public Service (int mileage, Date date)
   {
      this.mileage=mileage;
      this.date=date.copy();
   }
   
   public int getMileage()
   {
      return mileage;
   }
   public Date getDate()
   {
      return date.copy();
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Service))
      {
         return false;
      }
      
      Service other = (Service) obj;
      return mileage==other.mileage && date.copy().equals(other.date.copy());
   }
   public String toString()
   {
      return "Service: " +  mileage;
   }
   
   
}
