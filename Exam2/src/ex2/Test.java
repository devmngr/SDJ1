package ex2;

public class Test
{

   public static void main(String[] args)
   {
      PrintedBook prin1 = new PrintedBook("aa", "isbn", true);
      PrintedBook prin2 = new PrintedBook("bb", "isbn", false);
      PrintedBook prin3 = new PrintedBook("cc", "isbn", true);
      
      EBook ebook = new EBook("title", "isbn", "url");
      
      BookList books = new BookList();
      books.addBook(ebook);
      books.addBook(prin1);
      books.addBook(prin2);
      books.addBook(prin3);
      
      BookList books1 = new BookList();
      books1.addBook(ebook);
      books1.addBook(prin1);
      books1.addBook(prin2);
      books1.addBook(prin3);
     
      
      
     Book[] boo = books.getBooksByType("E-Book");

     for (int i = 0; i<boo.length; i++)
     {
      System.out.println(boo[i]);
     }

   }

}
