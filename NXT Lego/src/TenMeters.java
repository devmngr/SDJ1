import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;

public class TenMeters
{

   public static void main(String[] args)
   {
      int pwrLeft = 100;
      int pwrRight = 100;
      MotorPort motorLeft = MotorPort.A;
      MotorPort motorRight = MotorPort.C;
      double length = 1000;
      double pi = Math.PI;
      double wheelDiameter = 5.6;
      double wheelRadius = wheelDiameter / 2.0;
      double wheelCircumference = 2 * pi * wheelRadius;
      double tacho10Meter = (length / wheelCircumference) * 360;

      // LCD clears prints a Text and waits for a press of the button to go
      // further
      LCD.clear();
      LCD.drawString("Press any key ", 0, 7);
      Button.waitForAnyPress();
      LCD.clear();

      // Reset tacho count and start both motors
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();
      motorLeft.controlMotor(pwrLeft, 1);
      motorRight.controlMotor(pwrRight, 1);

      while (tacho10Meter <= motorLeft.getTachoCount()
            && tacho10Meter <= motorRight.getTachoCount())
      {

         
         if (motorLeft.getTachoCount() < motorRight.getTachoCount())
         {
            motorLeft.controlMotor(pwrLeft, 1);
            motorRight.controlMotor(0, 3);
         }
         if (motorRight.getTachoCount() < motorLeft.getTachoCount())
         {
            motorRight.controlMotor(pwrRight, 1);
            motorLeft.controlMotor(0, 3);
         }
         else 
            motorLeft.controlMotor(pwrLeft, 1);
         motorRight.controlMotor(pwrRight, 1);

      }

   }

}
