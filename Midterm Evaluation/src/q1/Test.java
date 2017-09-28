package q1;
public class Test
{

   public static void main(String[] args)
   {
      MyDate date = new MyDate(11, 8, 1992);
      MyDate date2 = new MyDate(1, 1, 2016);

      DatedNote datedNote = new DatedNote("HELLO", date);
      DatedNote datedNote2 = new DatedNote("Hello1", date2);

      PriorityNote prior1 = new PriorityNote("Bye1", 1);
      PriorityNote prior2 = new PriorityNote("Bye2", 2);
      PriorityNote prior3 = new PriorityNote("Bye3", 3);

      Notebook book = new Notebook(100);
      
      book.addNote(datedNote);
      book.addNote(datedNote2);
      book.addNote(prior1);
      book.addNote(prior2);
      book.addNote(prior3);
      
      System.out.println(book);

      System.out.println("\n" + book.getNumberOfPriorityNotes());
   }
}
