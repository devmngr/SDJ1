package exercise;

public class Book extends Item
{
   
   private String author;
   private String publisher;
   public int edition;

   public Book(String name, String author,String publisher, int edition)
   {
      super(name);
      this.author =author;
      this.publisher= publisher;
      this.edition = edition;
   }
   
   public String getAuthor()
   {
      return author;
   }
   public String getPublisher()
   {
      return publisher;
   }
   public int getEdition()
   {
      return edition;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Book))
      {
         return false;
      }
      
      Book other = (Book) obj;
      
      return  super.getName().equals(other.getName()) && author.equals(other.author) && publisher.equals(other.publisher) 
            && edition == other.edition;
   }
   
   public String toString()
   {
      return "Name" + super.getName() + "\nAuthor" + author + "\nPublisher" + publisher + "\nEdition" + edition;
   }
   
}
