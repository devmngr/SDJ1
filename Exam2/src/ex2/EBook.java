package ex2;

public class EBook extends Book
{
   private String url;

   public EBook(String title, String isbn, String url)
   {
      super(title, isbn);
      this.url=url;
   }
   
   public String getUrl()
   {
      return url;
   }

   public String getBookType()
   {
     return "E-Book";
   }
   
   public String toString()
   {
      return super.toString() + "Book type: " + getBookType();
   }
   public boolean equale(Object obj)
   {
      if(!(obj instanceof EBook))
      {
         return false;
      }
      
      EBook other = (EBook) obj;
      
      return super.equals(other) && url == other.url;
   }
   

}
