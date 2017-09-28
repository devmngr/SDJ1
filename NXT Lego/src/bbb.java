import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.MotorPort;

public class bbb
{

   public static void main(String[] args)
   {
      int pwrLeft = 70;
      int pwrRight = 70;
      MotorPort motorLeft = MotorPort.A;
      MotorPort motorRight = MotorPort.C;

      double A = 100;
      double B = 100;
      double pi = Math.PI;
      double wheelDiameter = 5.6;
      double wheelRadius = wheelDiameter / 2.0;
      double distanceBetween = 10.8;
      double turn1 = 360 / 90; // 35 angle (180-35)
      double turn2 = 360 / 270; // 72.5 angle (180-72.5)
      double wheelCircumference = 2 * pi * wheelRadius;
      // Turn distance for angles A, B and C
      double turnDistanceA = (2 * pi * distanceBetween) / turn1;
      double turnDistanceB = (2 * pi * distanceBetween) / turn2;
      // Turn tachos for angles A, B and C
      double tachoA = (A / wheelCircumference) * 360;
      double tachoB = (B / wheelCircumference) * 360;
      double tachoTurnA = (turnDistanceA / wheelCircumference) * 360;
      double tachoTurnB = (turnDistanceB / wheelCircumference) * 360;

      // backwards turn
      double tachoBackA = tachoTurnA / 2;
      double tachoBackB = tachoTurnB / 2;

      
      LCD.drawString("press", 1, 3);
      Button.waitForAnyPress();
      
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();

         while (motorLeft.getTachoCount() < tachoA)
         {
            motorLeft.controlMotor(pwrLeft, 1);
            motorRight.controlMotor(pwrRight, 1);

            if (motorLeft.getTachoCount() < motorRight.getTachoCount())
            {
               motorRight.controlMotor(0, 3);
            }
            if (motorLeft.getTachoCount() > motorRight.getTachoCount())
            {
               motorLeft.controlMotor(0, 3);
            }
         }
         motorLeft.controlMotor(0, 3);
         motorRight.controlMotor(0, 3);

         MotorPort.A.resetTachoCount();
         MotorPort.C.resetTachoCount();

         // turn 1 = 90 degree
         while (motorLeft.getTachoCount() < tachoTurnA
               && motorRight.getTachoCount() < tachoBackA)
         {
            motorLeft.controlMotor(pwrLeft, 1);
            motorRight.controlMotor(pwrRight, 2);
         }
         motorLeft.controlMotor(0, 3);
         motorRight.controlMotor(0, 3);

         /*
         //
         MotorPort.A.resetTachoCount();
         MotorPort.C.resetTachoCount();

         while (motorLeft.getTachoCount() < tachoB)
         {
            motorLeft.controlMotor(pwrLeft, 1);
            motorRight.controlMotor(pwrRight, 1);

            if (motorLeft.getTachoCount() < motorRight.getTachoCount())
            {
               motorRight.controlMotor(0, 3);
            }
            if (motorLeft.getTachoCount() > motorRight.getTachoCount())
            {
               motorLeft.controlMotor(0, 3);
            }
         }
         motorLeft.controlMotor(0, 3);
         motorRight.controlMotor(0, 3);

         //
         MotorPort.A.resetTachoCount();
         MotorPort.C.resetTachoCount();

         while (motorLeft.getTachoCount() < tachoTurnB
               && motorRight.getTachoCount() < tachoBackB)
         {
            motorLeft.controlMotor(pwrLeft, 1);
            motorRight.controlMotor(0, 3);
         }

         motorLeft.controlMotor(0, 3);
         motorRight.controlMotor(0, 3);
         //
         MotorPort.A.resetTachoCount();
         MotorPort.C.resetTachoCount();

         while (motorLeft.getTachoCount() < tachoA)
         {
            motorLeft.controlMotor(pwrLeft, 1);
            motorRight.controlMotor(pwrRight, 1);

            if (motorLeft.getTachoCount() < motorRight.getTachoCount())
            {
               motorRight.controlMotor(0, 3);
            }
            if (motorLeft.getTachoCount() > motorRight.getTachoCount())
            {
               motorLeft.controlMotor(0, 3);
            }
         
         motorLeft.controlMotor(0, 3);
         motorRight.controlMotor(0, 3);

         MotorPort.A.resetTachoCount();
         MotorPort.C.resetTachoCount();
      }
*/
   

   }
}
