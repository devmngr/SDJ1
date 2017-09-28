package q1;
import java.util.ArrayList;

public class Notebook
{
   private int numberOfNotes;
   private ArrayList<Note> notes;

   public Notebook(int maxNumberOfNotes)
   {
      this.numberOfNotes = maxNumberOfNotes;
      notes = new ArrayList<Note>();
   }

   public void addNote(Note note)
   {
      if (notes.size() < numberOfNotes)
      {
         notes.add(note.copy());
      }

   }

   public void setNote(Note note, int index)
   {
      notes.set(index, note.copy());
   }

   public void removeNote(int index)
   {
      notes.remove(index);
   }

   public Note getNote(int index)
   {
      return notes.get(index).copy();
   }

   public int getNumberOfPriorityNotes()
   {
      int count = 0;
      for (int i = 0; i < notes.size(); i++)
      {
         if (notes.get(i) instanceof PriorityNote)
         {
            count++;
         }
      }
      return count;
   }

   public PriorityNote[] getPriorityNotes()
   {
      PriorityNote[] temp = new PriorityNote[getNumberOfPriorityNotes()];
      int index = 0;

      for (int i = 0; i < notes.size(); i++)
      {
         if (notes.get(i) instanceof PriorityNote)
         {
            PriorityNote temp1 = (PriorityNote) notes.get(i);
            if (temp1.getPriority() == 1)
            {
               temp[index++] = temp1;
            }
         }
         for (int j = 0; j < notes.size(); j++)
         {
            if (notes.get(i) instanceof PriorityNote)
            {
               PriorityNote temp2 = (PriorityNote) notes.get(i);
               if (temp2.getPriority() == 2)
               {
                  temp[index++] = temp2;
               }
            }
         }
         for (int k = 0; k < notes.size(); k++)
         {
            if (notes.get(i) instanceof PriorityNote)
            {
               PriorityNote temp3 = (PriorityNote) notes.get(i);
               if (temp3.getPriority() == 3)
               {
                  temp[index++] = temp3;
               }
            }
         }

      }
      return temp;
   }

   public String toString()
   {
      String str = "";
      for (int i = 0; i < notes.size(); i++)
      {
         str += notes.get(i);
      }
      return str;
   }
}
