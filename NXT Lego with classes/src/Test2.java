import lejos.nxt.Button;
import lejos.nxt.LCD;


public class Test2
{

   public static void main(String[] args) throws InterruptedException
   {
      String[] stringarray = new String[5];
      int index = 0;
      stringarray[0] = "Hello";
      stringarray[1] = "My";
      stringarray[2] = "Name";
      stringarray[3] = "Is";
      stringarray[4] = "Botters";
      
      
      LCD.drawString("FOR-Loop", 0, 0);
      Button.waitForAnyPress();
      
      for(int i=0; i<stringarray.length;i++)
      {
         LCD.drawString(stringarray[i], 5, 4);
         Thread.sleep(700);
         LCD.clear();
      }
      
      LCD.clear();
      LCD.drawString("WHILE-Loop", 0, 0);
      Button.waitForAnyPress();
      
      while(index < stringarray.length)
      {
         LCD.drawString(stringarray[index], 5, 4);
         Thread.sleep(700);
         LCD.clear();
         index+=1;
      }
      
      LCD.clear();
      LCD.drawString("DO-Loop", 0, 0);
      Button.waitForAnyPress();
      

      
      do
      {
         LCD.drawString(stringarray[index], 5, 4);
         Thread.sleep(700);
         LCD.clear();
         index+=1;
         while (index < stringarray.length)
      }
      
   }

}
