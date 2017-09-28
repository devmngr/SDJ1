
public abstract class Item
{
   private String name;
   private double price;
   private boolean onSale;
   
   public Item(String name, double price)
   {  
      this.name = name;
      this.price=price;
      this.onSale = false;

   }
   
   public String getName()
   {
      return name;
   }
   
   public  abstract  String itemInfo();
}
