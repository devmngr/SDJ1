import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;
import lejos.nxt.UltrasonicSensor;


public class BallPicker
{

   public static void main(String[] args)
   {
      int pwrLeft = 65;
      int pwrRight = 65;
      int dist = 40;
      double tachoA = 0;

      MotorPort motorLeft = MotorPort.A;
      MotorPort motorRight = MotorPort.B;

      UltrasonicSensor ultrasonic = new UltrasonicSensor(SensorPort.S4);
      LightSensor light = new LightSensor(SensorPort.S1);
      
      System.out.println("Cal. LOW:");
      Button.waitForAnyPress();
      light.calibrateLow();
      LCD.drawString("Low: " + light.getLow(), 0, 2);

      Button.waitForAnyPress();
      LCD.clear();

      System.out.println("Cal. HIGH:");
      Button.waitForAnyPress();
      light.calibrateHigh();
      LCD.drawString("Low: " + light.getHigh(), 0, 2);

      Button.waitForAnyPress();
      LCD.clear();
      
      
      
      while (true)
      {
         if (ultrasonic.getDistance() > dist)
         {
            MotorPort.A.resetTachoCount();
            MotorPort.C.resetTachoCount();
            LCD.drawString("Distance: " + ultrasonic.getDistance(), 0, 3);
            motorLeft.controlMotor(pwrLeft, 1);
            motorRight.controlMotor(pwrRight, 2);
         }

         else if (ultrasonic.getDistance() <= dist)
         {

            LCD.clear();
            LCD.drawString("Distance: " + ultrasonic.getDistance(), 0, 3);
            Sound.playTone(4000, 500);
            motorLeft.controlMotor(0, 3);
            motorRight.controlMotor(0, 3);
            MotorPort.A.resetTachoCount();
            MotorPort.C.resetTachoCount();
            tachoA += motorLeft.getTachoCount();
            tachoA++;
            LCD.drawString("T: " + tachoA, 0, 4);

            motorLeft.controlMotor(pwrLeft, 1);
            motorRight.controlMotor(pwrRight, 1);

            if (light.getLightValue()<50)
            {
               motorLeft.controlMotor(0, 3);
               motorRight.controlMotor(0, 3);
               
               while (motorLeft.getTachoCount() <= tachoA)
               {
                  motorLeft.controlMotor(pwrLeft, 2);
                  motorRight.controlMotor(pwrRight, 2);
                  if (motorLeft.getTachoCount()>tachoA)
                  {
                     MotorPort.A.resetTachoCount();
                     MotorPort.C.resetTachoCount();
                     tachoA=0;
                  }
                  else
                     break;
                
               }

            }

         }
      }

   }

}
