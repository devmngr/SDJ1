import lejos.nxt.*;

public class RoomEdge
{

   public static void main(String[] args) throws InterruptedException
   {
      
      int pwrLeft = 90;          //Power to the left motor
      int pwrRight = 90;         //Power to the right motor
      int turnSpeed = 75;        //Power used for motors at turns
      
    //Declaring the ports used by the motors
      MotorPort motorLeft = MotorPort.A;     
      MotorPort motorRight = MotorPort.C;
      UltrasonicSensor ultrasonic = new UltrasonicSensor(SensorPort.S4);

      // LCD clears, prints a Text and waits for a press of the button to go further in the program
      LCD.clear();
      LCD.drawString("Press any key ", 0, 7);
      Button.waitForAnyPress();
      LCD.clear();

      // Start both motors
      motorLeft.controlMotor(pwrLeft, 1);
      motorRight.controlMotor(pwrRight, 1);

      while (true)
      {
         // If the distance from the wall is bigger than 35, the right motor reduces speed
         if (ultrasonic.getDistance() > 35)
         {
            motorLeft.controlMotor(pwrLeft, 1);
            motorRight.controlMotor(turnSpeed, 1);
         }
         
         // If the distance is smaller or equal to 35, the left motor reduces speed 
         else if (ultrasonic.getDistance() <= 45)
         {
            motorLeft.controlMotor(turnSpeed, 1);
            motorRight.controlMotor(pwrRight, 1);
         }
         
         else
         {
            motorLeft.controlMotor(pwrLeft, 1);
            motorRight.controlMotor(pwrRight, 1);
         }
      }
      

   }
}
