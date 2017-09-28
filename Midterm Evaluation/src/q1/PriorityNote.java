package q1;
public class PriorityNote extends Note
{
   private int priority;

   public PriorityNote(String message, int priority)
   {
      super(message);
      this.priority = priority;
   }

   public int getPriority()
   {
      return priority;
   }

   public Note copy()
   {
      Note note  = new PriorityNote(super.getMessage(), priority);
      return note;
   }
   
   public String toString()
   {
      return  super.toString() +"\tPriority " + priority + "\n";
   }

}
