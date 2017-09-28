import lejos.nxt.*;

public class Bottle
{

   public static void main(String[] args) throws InterruptedException
   {
      int pwrLeft = 65;
      int pwrRight = 65;
      int dist = 40;
      double tachoA = 0;

      MotorPort motorLeft = MotorPort.A;
      MotorPort motorRight = MotorPort.C;

      UltrasonicSensor ultrasonic = new UltrasonicSensor(SensorPort.S4);

      TouchSensor touch = new TouchSensor(SensorPort.S1);
      boolean flag = false;

      double pi = Math.PI;
      double wheelDiameter = 5.6;
      double wheelRadius = wheelDiameter / 2.0;
      double distanceBetween = 16.5;
      double wheelCircumference = 2 * pi * wheelRadius;
      double turnDistance = (2 * pi * distanceBetween) * 2; // 720 degrees
      double tachoTurnFwd = ((turnDistance / wheelCircumference) * 360) / 2;
      double tachoTurnBack = tachoTurnFwd / 2;

      LCD.clear();
      LCD.drawString("Press any key ", 0, 0);
      LCD.drawString("turnD: " + turnDistance, 0, 1);

      Button.waitForAnyPress();
      LCD.clear();

      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();

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

            if (touch.isPressed() == true)
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