package exercise;
import java.util.ArrayList;


public class ItemList
{
   private int maxNumberOfItems;
   private int numberOfItems;
   private ArrayList<Item> items;
   
   public ItemList(int maxNumberOfItems)
   {
      this.maxNumberOfItems = maxNumberOfItems;
      this.numberOfItems = maxNumberOfItems;
      items = new ArrayList<Item>();
   }
   
   public void addItem(Item item)
   {
      items.add(item);
   }
   public Book[] getAllBooks()
   {
      Book [] temp = new Book[items.size()];
      
      for(int i=0; i<items.size(); i++)
      {
         if (items.get(i) instanceof Book)
         {
            temp[i] = (Book) items.get(i);
         }
      }
      return temp;
   }
   public DVD[] getAllDVDs()
   {
      DVD [] temp = new DVD[items.size()];
      
      for(int i=0; i<items.size(); i++)
      {
         if (items.get(i) instanceof DVD)
         {
            temp[i] = (DVD) items.get(i);
         }
      }
      return temp;
   }
   
   public boolean equals(Object obj)
   {
      if(!(obj instanceof ItemList))
      {
         return false;
      }
      
      ItemList other = (ItemList) obj;
      return maxNumberOfItems == other.maxNumberOfItems && numberOfItems == other.numberOfItems 
            && items.equals(other.items);
   }
   public String toString()
   {
      return "Number of items" + numberOfItems; 
   }
   
   
}
