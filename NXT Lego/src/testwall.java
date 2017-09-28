import lejos.nxt.*;

public class testwall
{

   public static void main(String[] args) throws InterruptedException
   {
      int pwrLeft = 90;
      int pwrRight = 90;
      int turnSpeed= 75;
      MotorPort motorLeft = MotorPort.A;
      MotorPort motorRight = MotorPort.C;
      UltrasonicSensor ultrasonic = new UltrasonicSensor(SensorPort.S4);
      

      //LCD
      LCD.clear();
      LCD.drawString("Press any key ", 0,7);
      Button.waitForAnyPress();
      LCD.clear();
         
      //Reset and Start
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();
      motorLeft.controlMotor(pwrLeft, 1);
      motorRight.controlMotor(pwrRight, 1);
      
      while (true)
      { 
      //Straight if distance >40
         if (ultrasonic.getDistance()>35)
         {
            motorLeft.controlMotor(pwrLeft, 1);
            motorRight.controlMotor(turnSpeed,1);
          }   
  
         else 
         {
            motorLeft.controlMotor(turnSpeed, 1);
            motorRight.controlMotor(pwrRight, 1);
         }
         
      }
      
      
      
         
   }

}
