import java.util.Scanner;


public class BookTest
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
     
      
      //1
      System.out.println("Enter author: ");
      String author= keyboard.nextLine();
      
      System.out.println("Enter title: ");
      String title = keyboard.nextLine();
      
      System.out.println("Enter price: ");
      double price = keyboard.nextDouble();
      
      
      System.out.println("Enter pages: ");
      int pages = keyboard.nextInt();
      
      
      keyboard.nextLine();
      
      
      //2
      
      System.out.println("Enter author: ");
      String author1 = keyboard.nextLine();
      
      System.out.println("Enter title: ");
      String title1 = keyboard.nextLine();
      
      System.out.println("Enter price: ");
      double price1 = keyboard.nextDouble();
      
      
      System.out.println("Enter pages: ");
      int pages1 = keyboard.nextInt();
      
      
      
      Book book = new Book(author, title, price, pages);      
      Book book1 = new Book (author1, title1, price1, pages1);
      
      System.out.println(book + " New Price: " + book.getPrice());
      System.out.println(book1 + " New Price: " + book1.getPrice());

   }

}
