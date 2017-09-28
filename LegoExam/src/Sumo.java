import java.io.File;

import lejos.nxt.*;

public class Sumo
{

   public static void main(String[] args) throws InterruptedException
   {
      MotorController motor = new MotorController(100, MotorPort.A); // Weapon
      MotorController motors = new MotorController(75, MotorPort.B, MotorPort.C); // Wheels
      LightController light = new LightController(SensorPort.S1);
      UltrasonicSensor ultrasonic = new UltrasonicSensor(SensorPort.S4);

      int calBlack = 90; // Light value for black without calibration
      int speed = 100; // speed used when going to the other robot
      int normalspeed = 75;
      int distance = 60;
      light.setBlack(25);
      light.setWhite(80);

      LCD.drawString("Calibration", 4, 6);
      Button.waitForAnyPress();
      light.calibrateWhite();
      while (light.getLight() > calBlack)
      {
         motors.Drive(2, 2);
      }

      motors.Brake();
      Thread.sleep(2000);
      light.calibrateBlack();
      Sound.setVolume(100);
      Sound.playTone(100, 2000); // Frequency / Time
      motors.Drive(2, 2);
      Thread.sleep(1500);
      motors.Brake();

      LCD.clear();
      LCD.drawString("" + light.getLight(), 1, 0);
      LCD.drawString("Calibrated", 4, 2);
      Button.waitForAnyPress();

      while (true)
      {
         if (light.isOnGrey())
         {

            motor.Drive(2);
            while (ultrasonic.getDistance() < distance)
            {
               motors.setPower(speed);
               motors.Drive(2, 2);
               if (light.isOnBlack())
               {
                  motors.Drive(1, 1);
               }

            }
            while (ultrasonic.getDistance() > distance)
            {
               motors.setPower(normalspeed);
               motors.Drive(2, 1);

               if (light.isOnBlack())
               {
                  motors.Drive(1, 1);
               }

            }

            if (light.isOnWhite())
            {
               MotorPort.A.controlMotor(0, 0);
               MotorPort.B.controlMotor(0, 0);
               MotorPort.C.controlMotor(0, 0);
               
               
               /*
               motor.Brake();
               motors.Brake();
               
               Sound.setVolume(100);
               Sound.playTone(1000, 3000);
               */
               

            }

         }
      }

   }
}