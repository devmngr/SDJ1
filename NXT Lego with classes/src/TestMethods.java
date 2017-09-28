import lejos.nxt.Button;
import lejos.nxt.LCD;


public class TestMethods
{

   public static void main(String[] args)
   {
      String[] stringarray = new String[5];
      int index = 0;
      while(true)
      {
      stringarray[0] = "Hello";
      stringarray[1] = "My";
      stringarray[2] = "Name";
      stringarray[3] = "Is";
      stringarray[4] = "Botters";
        
      LCD.refresh();
      LCD.drawString(stringarray[index], 5, 4);
      
      
      
      if (Button.RIGHT.isDown())
      {
         LCD.clear();
         index++;
         if (index==5)
         {
            index=0;
         }

            
         LCD.clear();
         while (Button.RIGHT.isDown())
         {
         }
      }
      if (Button.LEFT.isDown())
      {
         
         LCD.clear();
         index--;
         if (index==-1)
         {
            index=0;
         }
       
            
         LCD.clear();
         while (Button.LEFT.isDown())
         {
         }
      }
      
      }
   }

}
