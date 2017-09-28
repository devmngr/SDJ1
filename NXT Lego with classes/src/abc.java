import lejos.nxt.*;

public class abc
{

   public static void main(String[] args) throws InterruptedException
   {
      UltrasonicSensor ultrasonic = new UltrasonicSensor(SensorPort.S4);
      TouchSensor touch = new TouchSensor(SensorPort.S1);

      UltrasonicController ultra = new UltrasonicController();
      ultra.setDistance(40);

      MotorController motor = new MotorController();

      motor.setPower(70);
      motor.setDistance(40);

      MotorPort motorLeft = MotorPort.A;
      MotorPort motorRight = MotorPort.C;

      LCD.clear();
      LCD.drawString("Press any key ", 0, 4);
      Button.waitForAnyPress();
      LCD.clear();
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();

      while (true)
      {
         if (ultrasonic.getDistance() > ultra.getDist())
         {
            LCD.clear();
            MotorPort.A.resetTachoCount();
            MotorPort.C.resetTachoCount();
            LCD.drawString("Distance: " + ultrasonic.getDistance(), 0, 3);
            motorLeft.controlMotor(motor.getPower(), 1);
            motorRight.controlMotor(motor.getPower(), 2);
         }

         else if (ultrasonic.getDistance() <= ultra.getDist())
         {

            while (motorLeft.getTachoCount() < motor.getTachoDistance())
            {

               LCD.clear();
               LCD.drawString("Distance: " + ultrasonic.getDistance(), 0, 3);
               Sound.playTone(4000, 500);

               MotorPort.A.resetTachoCount();
               MotorPort.C.resetTachoCount();

               motorLeft.controlMotor(motor.getPower(), 1);
               motorRight.controlMotor(motor.getPower(), 1);

               if (!touch.isPressed())
               {

                  motorLeft.controlMotor(motor.getPower(), 1);
                  motorRight.controlMotor(motor.getPower(), 1);
               }
               else if (touch.isPressed())
               {

                  MotorPort.A.resetTachoCount();
                  MotorPort.C.resetTachoCount();

                  while (motorLeft.getTachoCount() < motor.getTachoDistance())
                  {
                     if (motorLeft.getTachoCount() > motorRight.getTachoCount())
                     {
                        motorRight.controlMotor(motor.getPower(), 3);
                     }
                     else if (motorLeft.getTachoCount() < motorRight
                           .getTachoCount())
                     {
                        motorLeft.controlMotor(motor.getPower(), 3);
                     }
                     else
                        motorRight.controlMotor(motor.getPower(), 2);
                     motorLeft.controlMotor(motor.getPower(), 2);
                  }

               }

            }

         }

      }
   }
}