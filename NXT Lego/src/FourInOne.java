import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;
import lejos.nxt.UltrasonicSensor;

public class FourInOne
{

   public static void main(String[] args) throws InterruptedException
   {
      int menuContr = 1;
      boolean flag = false;

      while (true)
      {
         // Menu1
         if (menuContr == 1)
         {
            LCD.refresh();
            LCD.drawString("MENU 1", 0, 0);
            LCD.drawString("2 Meters", 0, 2);
            LCD.drawString("ENTER to run!", 0, 7);

            // Program 1 start
            if (Button.ENTER.isPressed())
            {
               int pwrLeft = 90;
               int pwrRight = 90;
               MotorPort motorLeft = MotorPort.A;
               MotorPort motorRight = MotorPort.C;
               double length = 200;
               double pi = Math.PI;
               double wheelDiameter = 5.6;
               double wheelRadius = wheelDiameter / 2.0;
               double wheelCircumference = 2 * pi * wheelRadius;
               double tacho1Meter = (length / wheelCircumference) * 360;

               LCD.refresh();
               MotorPort.A.resetTachoCount();
               MotorPort.C.resetTachoCount();
               motorLeft.controlMotor(pwrLeft, 1);
               motorRight.controlMotor(pwrRight, 1);

               while (motorLeft.getTachoCount() <= tacho1Meter
                     || motorRight.getTachoCount() <= tacho1Meter)
               {
                  LCD.refresh();
                  LCD.drawString("M1: " + motorLeft.getTachoCount(), 0, 4);
                  LCD.drawString("M2: " + motorRight.getTachoCount(), 0, 5);

                  motorLeft.controlMotor(pwrLeft, 1);
                  motorRight.controlMotor(pwrRight, 1);

                  if (motorLeft.getTachoCount() != motorRight.getTachoCount())
                  {
                     if (motorLeft.getTachoCount() > motorRight.getTachoCount())
                     {
                        motorRight.controlMotor(pwrRight, 1);
                        motorLeft.controlMotor(0, 3);
                     }
                     if (motorLeft.getTachoCount() < motorRight.getTachoCount())
                     {
                        motorRight.controlMotor(0, 3);
                        motorLeft.controlMotor(pwrLeft, 1);
                     }
                     else
                        motorLeft.controlMotor(pwrLeft, 1);
                     motorRight.controlMotor(pwrRight, 1);

                  }

                  if (motorLeft.getTachoCount() > tacho1Meter
                        || motorRight.getTachoCount() > tacho1Meter)
                  {
                     motorLeft.controlMotor(0, 3);
                     motorRight.controlMotor(0, 3);
                  }
               }
            }
            // Program 1 end
         }

         // Menu2
         else if (menuContr == 2)
         {
            LCD.refresh();
            LCD.drawString("MENU 2", 0, 0);
            LCD.drawString("90 and 180", 0, 2);
            LCD.drawString("degrees", 0, 3);
            LCD.drawString("ENTER to run!", 0, 7);

            // Program 2 start
            int pwrLeft = 90;
            int pwrRight = 90;
            MotorPort motorLeft = MotorPort.A;
            MotorPort motorRight = MotorPort.C;

            double A = 100;
            double B = 100;
            double pi = Math.PI;
            double wheelDiameter = 5.6;
            double wheelRadius = wheelDiameter / 2.0;
            double distanceBetween = 10.5;
            double turn1 = 360 / 90;   // 90 degrees
            double turn2 = 360 / 180;  // 180 degrees
            double wheelCircumference = 2 * pi * wheelRadius;
            // Turn distance for angles A, B and C
            double turnDistanceA = (2 * pi * distanceBetween) / turn1;
            double turnDistanceB = (2 * pi * distanceBetween) / turn2;
            // Turn tachos for angles A, B and C
            double tachoA = (A / wheelCircumference) * 360;
            double tachoB = (B / wheelCircumference) * 360;
            double tachoTurnA = (turnDistanceA / wheelCircumference) * 360;
            double tachoTurnB = (turnDistanceB / wheelCircumference) * 360;

            MotorPort.A.resetTachoCount();
            MotorPort.C.resetTachoCount();

            if (Button.ENTER.isPressed())
            {
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
               while (motorLeft.getTachoCount() < tachoTurnA)
               {
                  motorLeft.controlMotor(pwrLeft, 1);
                  motorRight.controlMotor(0, 3);
               }
               motorLeft.controlMotor(0, 3);
               motorRight.controlMotor(0, 3);

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

               //Turn 2 = 180 degrees
               while (motorLeft.getTachoCount() < tachoTurnB)
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
               }
               motorLeft.controlMotor(0, 3);
               motorRight.controlMotor(0, 3);

               MotorPort.A.resetTachoCount();
               MotorPort.C.resetTachoCount();
            }
            // Program 2 end
         }

         // Menu3
         else if (menuContr == 3)
         {
            LCD.drawString("MENU 3", 0, 0);
            LCD.drawString("Rectangle with", 0, 2);
            LCD.drawString("one wheel", 0, 3);
            LCD.drawString("forward", 0, 4);
            LCD.drawString("and one backwards", 0, 5);
            LCD.drawString("ENTER to run!", 0, 7);

            // Program 3 start
            int pwrLeft = 80;
            int pwrRight = 80;
            MotorPort motorLeft = MotorPort.A;
            MotorPort motorRight = MotorPort.C;

            double length = 90;
            double width = 60;
            double pi = Math.PI;
            double wheelDiameter = 5.6;
            double wheelRadius = wheelDiameter / 2.0;
            double distanceBetween = 10.5;
            double wheelCircumference = 2 * pi * wheelRadius;
            double turnDistance = (2 * pi * distanceBetween) / 4; // Turn distance for 90 degrees                                                
            double tachoLength = (length / wheelCircumference) * 360;
            double tachoWidth = (width / wheelCircumference) * 360;
            double tachoTurn = ((turnDistance / wheelCircumference) * 360)/2;
            double tachoTurnBack = tachoTurn / 2;

            MotorPort.A.resetTachoCount();
            MotorPort.C.resetTachoCount();

            if (Button.ENTER.isPressed())
            {
               // Length 1
               while (motorLeft.getTachoCount() < tachoLength)
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

               // Stop and Reset
               motorLeft.controlMotor(0, 3);
               motorRight.controlMotor(0, 3);
               MotorPort.A.resetTachoCount();
               MotorPort.C.resetTachoCount();

               // Turn 1
               while (motorLeft.getTachoCount() < tachoTurn
                     && motorRight.getTachoCount() < tachoTurnBack)
               {
                  motorLeft.controlMotor(pwrLeft, 1);
                  motorRight.controlMotor(pwrRight, 2);
               }
               motorLeft.controlMotor(0, 3);
               motorRight.controlMotor(0, 3);
               MotorPort.A.resetTachoCount();
               MotorPort.C.resetTachoCount();

               // With 1

               while (motorLeft.getTachoCount() < tachoWidth)
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

               // Turn 2

               while (motorLeft.getTachoCount() < tachoTurn
                     && motorRight.getTachoCount() < tachoTurnBack)
               {
                  motorLeft.controlMotor(pwrLeft, 1);
                  motorRight.controlMotor(pwrRight, 2);
               }
               motorLeft.controlMotor(0, 3);
               motorRight.controlMotor(0, 3);
               MotorPort.A.resetTachoCount();
               MotorPort.C.resetTachoCount();

               // Length 2

               while (motorLeft.getTachoCount() < tachoLength)
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

               // Turn 3

               while (motorLeft.getTachoCount() < tachoTurn
                     && motorRight.getTachoCount() < tachoTurnBack)
               {
                  motorLeft.controlMotor(pwrLeft, 1);
                  motorRight.controlMotor(pwrRight, 2);
               }
               motorLeft.controlMotor(0, 3);
               motorRight.controlMotor(0, 3);
               MotorPort.A.resetTachoCount();
               MotorPort.C.resetTachoCount();

               // Width 2
               while (motorLeft.getTachoCount() < tachoWidth)
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

               // Turn 4
               while (motorLeft.getTachoCount() < tachoTurn
                     && motorRight.getTachoCount() < tachoTurnBack)
               {
                  motorLeft.controlMotor(pwrLeft, 1);
                  motorRight.controlMotor(pwrRight, 2);
               }
               motorLeft.controlMotor(0, 3);
               motorRight.controlMotor(0, 3);
               MotorPort.A.resetTachoCount();
               MotorPort.C.resetTachoCount();

               // program3 end
            }
         }

         // Menu4
         else if (menuContr == 4)
         {
            LCD.drawString("MENU 4", 0, 0);
            LCD.drawString("Read distance", 0, 2);
            LCD.drawString("with Ultrasonic", 0, 3);
            LCD.drawString("sensor", 0, 4);
            LCD.drawString("ENTER to run!", 0, 7);

            if (Button.ENTER.isPressed())
            {
               LCD.refresh();
               while (Button.ESCAPE.isUp())
               {
                  UltrasonicSensor ultrasonic = new UltrasonicSensor(
                        SensorPort.S4);
                  if (ultrasonic.getDistance() > 10)
                  {
                     LCD.drawString("Distance: " + ultrasonic.getDistance(), 0,
                           3);
                     Thread.sleep(500);
                     LCD.clear();
                  }
                  else if (ultrasonic.getDistance() <= 10)
                  {
                     LCD.drawString("Distance: " + ultrasonic.getDistance(), 0,
                           3);
                     Sound.playTone(4000, 500);
                     Thread.sleep(500);
                     LCD.clear();
                  }
                  else if (Button.ESCAPE.isPressed())
                  {
                     break;
                  }
               }
            }
         }

         // Buttons
         if (Button.RIGHT.isDown() && flag == false)
         {
            menuContr++;
            LCD.clear();
            while (Button.RIGHT.isDown() && flag == false)
            {
            }
         }
         if (Button.LEFT.isDown() && flag == false)
         {
            menuContr--;
            LCD.clear();
            while (Button.LEFT.isDown() && flag == false)
            {

            }
         }
      }
   }
}
