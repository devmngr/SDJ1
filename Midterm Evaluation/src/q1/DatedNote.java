package q1;
public class DatedNote extends Note
{
   private MyDate date;

   public DatedNote(String message, MyDate date)
   {
      super(message);
      this.date = date.copy();
   }
   
   public MyDate getDate()
   {
      return date.copy();
   }
   public Note copy()
   {
      Note note = new DatedNote(super.getMessage(), date);
      return note;
   }
   public String toString()
   {
      return super.toString() + "\tDate " + date + "\n";
   }
}
