package ex2;
import java.util.ArrayList;

public class BookList
{
   private ArrayList<Book> books;

   public BookList()
   {
      books = new ArrayList<Book>();
   }

   public int getNumberOfBooks()
   {
      return books.size();
   }

   public void addBook(Book book)
   {
      books.add(book);
   }

   public Book getBook(int index)
   {
      return books.get(index);
   }

   public Book getBook(String isbn)
   {
      for (int i = 0; i < books.size(); i++)
      {
         if (books.get(i).equals(isbn))
         {
            return books.get(i);
         }
      }
      return null;
   }

   public Book removeBook(int index)
   {
      return books.remove(index);
   }

   public int getIndexOfFirstPrintedBook()
   {
      for (int i = 0; i < books.size(); i++)
      {
         if (books.get(i) instanceof PrintedBook)
         {
            return i;
         }

      }
      return -1;
   }

   public int getNumberOfBooksByType(String bookType)
   {
      int count = 0;
      for (int i = 0; i < books.size(); i++)
      {
         if (books.get(i).getBookType().equals(bookType))
         {
            count++;
         }
      }
      return count;
   }
   
   public Book[] getBooksByType(String bookType)
   {
      Book[] temp = new Book[getNumberOfBooksByType(bookType)];
      int index = 0;
      
      for(int i=0; i<books.size(); i++)
      {
         if(books.get(i).getBookType().equals(bookType))
         {
            temp[index]  = books.get(index);
            index++;
         }
      }
      return temp;   
   }
   
   public EBook[] getAllEBooks()
   {
      return (EBook[]) getBooksByType("E-Book");
   }
   
   public String toString()
   {
      String returnStr = "";

      for (int i = 0; i < books.size(); i++)
      {
         Book temp = books.get(i);

         returnStr += temp + "\n";
      }
      return returnStr;
   }
   public boolean equals(Object obj)
   {
      if(!(obj instanceof BookList))
      {
         return false;
      }
      
      BookList other = (BookList) obj;
      return books.equals(other.books);
   }

}
