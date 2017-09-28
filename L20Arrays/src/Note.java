import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class Note
{
   private String message;
   private boolean highPriority;

   public Note(String message)
   {
      this.message = message;
      highPriority = false;
   }
   
   public String getMessage()
   {
      return message;
   }
   
   public void setMessage(String message)
   {
      this.message=message;
   }
   public boolean isHighPriority()
   {
      return highPriority;
   }
   public void setToHighPriority()
   {
      highPriority=true;
   }
   public void setToLowPriority()
   {
      highPriority=false;
   }

   public Note copy()
   {
      Note note= new Note(message);
      if(highPriority)
      {
         note.setToHighPriority();
      }
      return note;
   }
   
   public String toString()
   {
      String str = message;
      if(highPriority)
      {
         str+=" (high priority";
      }
      return str;
   }

}
