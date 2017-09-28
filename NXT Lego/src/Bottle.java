import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;

public class Bottle
{

   public static void main(String[] args)
   {
      int pwrLeft = 65;
      int pwrRight = 65;
      MotorPort motorLeft = MotorPort.A;
      MotorPort motorRight = MotorPort.C;
      UltrasonicSensor ultrasonic = new UltrasonicSensor(SensorPort.S4);
      TouchSensor touch = new TouchSensor(SensorPort.S1);
      boolean flag = false;

      double pi = Math.PI;
      double wheelDiameter = 5.6;
      double wheelRadius = wheelDiameter / 2.0;
      double distanceBetween = 9;
      double wheelCircumference = 2 * pi * wheelRadius;
      double turnDistance = (2 * pi * distanceBetween) * 2; // 720 degrees
      double tachoTurnFwd = ((turnDistance / wheelCircumference) * 360) / 2;
      double tachoTurnBack = tachoTurnFwd / 2;

      LCD.clear();
      LCD.drawString("Press any key ", 0, 0);
      LCD.drawString("turnD: " + turnDistance, 0, 1);
      LCD.drawString("FWD " + tachoTurnFwd, 0, 2);
      LCD.drawString("BACk " + tachoTurnBack, 0, 3);
      Button.waitForAnyPress();
      LCD.clear();

      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();
      motorLeft.controlMotor(pwrLeft, 1);
      motorRight.controlMotor(pwrRight, 2);
      while (true)
      {
         while (motorLeft.getTachoCount() < tachoTurnFwd
               && motorRight.getTachoCount() < tachoTurnBack)
         {
            if (ultrasonic.getDistance() > 35)
            {
               LCD.clear();
               LCD.drawString("Distance: " + ultrasonic.getDistance(), 0, 3);

            }
            else if (ultrasonic.getDistance() <= 35)
            {
               LCD.clear();
               LCD.drawString("Distance: " + ultrasonic.getDistance(), 0, 3);
               Sound.playTone(4000, 500);
               MotorPort.A.resetTachoCount();
               MotorPort.C.resetTachoCount();
               double tachoTurn1 = 0;

               motorLeft.controlMotor(pwrLeft, 2);
               motorRight.controlMotor(pwrRight, 1);

               if (ultrasonic.getDistance() > 35)
               {

                  motorLeft.controlMotor(0, 3);
                  motorRight.controlMotor(0, 3);
                  double tachoTurn = motorLeft.getTachoCount() - tachoTurn1;
                  double tachoTurnFR = tachoTurn / 2;
                  while (motorLeft.getTachoCount() == tachoTurnFR)
                  {
                     motorLeft.controlMotor(pwrLeft, 1);
                     motorRight.controlMotor(pwrRight, 2);
                  }
                 

               }

            }

            else if (motorLeft.getTachoCount() >= tachoTurnFwd
                  || motorRight.getTachoCount() >= tachoTurnBack)
            {
               motorLeft.controlMotor(0, 3);
               motorRight.controlMotor(0, 3);
            }

         }

      }
   }
}
