
public class Electronics extends Item
{
   private int warrentyPeriod;
   
   public Electronics (String  name,  double price, int warretyPeriod)
   {
      super(name, price);
      this.warrentyPeriod=warretyPeriod;
   }
   public int getWarrentyPeriod()
   {
      return warrentyPeriod;
   }
   public String itemInfo()
   {
      return super.getName()+ ", "+super.getPrice()+ ", Warranty" + warrentyPeriod; 
   }
}
