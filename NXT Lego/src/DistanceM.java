import lejos.nxt.*;
public class DistanceM
{

   public static void main(String[] args) throws InterruptedException
   {
      int pwrLeft;
      int pwrRight;
      MotorPort motorLeft;
      MotorPort motorRight;

      
      pwrLeft = 100;
      pwrRight= 100;
      motorLeft = MotorPort.A;
      motorRight = MotorPort.C;
      UltrasonicSensor ultrasonic = new UltrasonicSensor(SensorPort.S4);
      
      
      ////
      LCD.clear();
      LCD.drawString("Press any key ", 0,7);
      Button.waitForAnyPress();
      LCD.clear();
      
      motorRight.controlMotor(pwrRight, 1);
      motorLeft.controlMotor(pwrLeft, 1);
      
     
      
      while (ultrasonic.getDistance()<30)
      {

         ///ultrasonic
         if (ultrasonic.getDistance() < 30)
         {
            motorRight.controlMotor(pwrRight, 3);
            motorLeft.controlMotor(pwrLeft, 1);
            Thread.sleep(500);
         }
         else if(ultrasonic.getDistance() > 30)
         {
            motorRight.controlMotor(pwrRight, 1);
            motorLeft.controlMotor(pwrLeft, 1);
         
            
            if (motorLeft.getTachoCount() < motorRight.getTachoCount())
            {
               motorRight.controlMotor(0, 3);
            }
            else if (motorLeft.getTachoCount() > motorRight.getTachoCount())
            {
               motorLeft.controlMotor(0, 3);
            }
           
            else if (motorRight.getTachoCount() < motorLeft.getTachoCount())
            {
               motorLeft.controlMotor(0, 3);
            }
            else if (motorRight.getTachoCount() > motorLeft.getTachoCount())
            {
               motorRight.controlMotor(0, 3);
            }
            Thread.sleep(60000);
         }
         
         
     
      
      }
      
      
      
      
   }
}
      
