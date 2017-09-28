
public class Notebook
{
private int numberOfNotes;
private Note[] notes;

public Notebook(int maxNumberOfNotes)
{
   numberOfNotes=0;
   notes= new Note[maxNumberOfNotes];
}
public int getNumberOfNotes()
{
  return numberOfNotes; 
}
public Note getNote(int index)
{
   if(index<notes.length)
   {
      return notes[index].copy();
   }
   else 
   {
      return null;
   }
}

public String getMessage(int index)
{
   if(index<notes.length)
   {
      return notes[index].getMessage();
   }
   else 
   {
      return "";
   }
}
   

public void addNote(Note note)
{
   if(numberOfNotes<notes.length)
   {
      notes[numberOfNotes]=note.copy();
      numberOfNotes++;
   }
}

public void addHighPriorityNote(String message)
{
   if(numberOfNotes<notes.length)
   {
      notes[numberOfNotes] = new Note(message);
      notes[numberOfNotes].setToHighPriority();
      numberOfNotes++;
   }
}

public void removeNote(int index)
{
   for(int i = index; i<numberOfNotes; i++)
   {
      notes[i]=notes[i+1];
   }
   if(numberOfNotes>0)
   {
      notes[numberOfNotes -1] = null;
   }
   numberOfNotes--;
}

public Note[] getAllNotes()
{
   Note[] temp = new Note[numberOfNotes];
   
   for (int i=0;i<temp.length; i++)
   {
      temp[i]=notes[i].copy();
   }
   return temp;
}

public int getNumberOfHighPriorityNotes()
{
   int count=0;
   
   for (int i =0; i<numberOfNotes; i++)
   {
      if(notes[i].isHighPriority())
      {
         count++;
      }
   }
   return count;
}

public  Note[] getAllPriorityNotes()
{
   Note[] temp = new Note[getNumberOfHighPriorityNotes()];
   int index =0;
   
   for(int i=0; i<numberOfNotes; i++)
   {
      if(notes[i].isHighPriority())
      {
         temp[index]=notes[i].copy();
         index++;
      }
   }
   return temp;
}

public String toString()
{
   String str = "";
   for(int i = 0; i<numberOfNotes; i++)
   {
      str+=notes[i] + "\n";
   }
   return str;
}
}
