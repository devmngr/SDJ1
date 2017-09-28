import lejos.nxt.*;



public class UltrasonicDist
{

   public static void main(String[] args) throws InterruptedException
   {
      
      UltrasonicSensor ultrasonic = new UltrasonicSensor(SensorPort.S4);
      
         
         LCD.clear();
         LCD.drawString("Press any key ", 0,7);
         Button.waitForAnyPress();
         LCD.clear();
         
         
         while (true)
         {  
         
            if (ultrasonic.getDistance()>10)
            {  
               LCD.drawString("Distance: " + ultrasonic.getDistance(), 0,3);
               Thread.sleep(500);
               LCD.clear();
            }
            
            else
            {               
               LCD.drawString("Distance: " + ultrasonic.getDistance(), 0,3);
               Sound.playTone(4000, 500);
               Thread.sleep(500);
               LCD.clear();
            }
            
         }    
             

   }

}
