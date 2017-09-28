package ex2;
public class Tenant
{
   private String name;
   private MyDate rentedFrom;

   public Tenant(String name)
   {
      this.name = name;

   }

   public String getName()
   {
      return name;
   }

   public MyDate getRentedFrom()
   {
      return rentedFrom.copy();
   }

   public void setRentedFrom(MyDate rentedFrom)
   {
      this.rentedFrom = rentedFrom.copy();
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Tenant))
      {
         return false;
      }

      Tenant other = (Tenant) obj;
      return name.equals(other.name);
   }

   public String toString()
   {
      return "Tenant: " + name + "\n" + getRentedFrom();
   }
}
