import java.util.ArrayList;


public class Shop
{
   private String name;
   private String address;
   private Manager manager;
   private ArrayList<Item> items;
   
   public Shop(String name, String address)
   {
      this.name = name;
      this.address=address;
      manager=null;
      items = new ArrayList<Item>();
      
   }
   public  void addItem(Item item)
   {
      items.add(item);
   }
   
   public Item getItem(String itemName)
   {
      for(int i=0;i<items.size(); i++)
      {
         if(items.get(i).getName().equals(itemName))
         {
            return items.get(i);
         }
      }
      return null;
   }
   
   public Item[] getAllItems()
   {
      Item[] temp = new Item[items.size()];
      
      for(int i = 0; i<items.size(); i++)
      {
         temp[i] = items.get(i);
      }
      
      return temp;
         
   }
   
   
   public  Item[] getItemsOnSale()
   {
      ArrayList<Item> temp = new ArrayList<Item>();
     
      for(int i= 0; i< items.size(); i++)
      {
         if (items.get(i).getOnSale() == true)
         {
            temp.add(items.get(i));
         }
      }
      Item [] other = Item[temp.size()];
      
      for(int i = 0; i< temp.size();i++)
      {
         other[i] = temp.get(i);
      }
      return other;
      
      
   }
   
}
