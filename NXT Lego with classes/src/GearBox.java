import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class GearBox
{

   public static void main(String[] args) throws InterruptedException
   {
      MotorPort motorA = MotorPort.A;
      MotorPort motorB = MotorPort.B;
      MotorPort motorC = MotorPort.C;
      TouchSensor touch = new TouchSensor(SensorPort.S2);

      LCD.drawString("Waiting...", 4 ,4);
      Button.waitForAnyPress();
      LCD.clear();
      LCD.drawString("Destroy...", 4, 4);
      while (true)
      {
         motorB.controlMotor(100, 2);
         motorC.controlMotor(100, 2);
         motorA.controlMotor(100, 2);

         if (!(touch.isPressed()))
         {
            motorB.controlMotor(100, 1);
            motorC.controlMotor(100, 1);
         }
        
      }

   }

}
