import lejos.nxt.*;

public class LightAndSound
{

   public static void main(String[] args) throws InterruptedException
   {
      LightSensor light = new LightSensor(SensorPort.S1);

      LCD.drawString("Hello ! ! !", 4, 3);
      Thread.sleep(2000);
      LCD.clear();

      int menuContr = 1;
      boolean flag = false;

      int high = 0;
      int low = 0;
      int speed = 100;
      int pwr = 70;

      while (true)
      {
         // Menu1
         if (menuContr == 1)
         {
            LCD.refresh();
            LCD.drawString("STEP 1", 0, 0);

            LCD.drawString("Calibrate Low", 0, 1);
            LCD.drawString("ENTER", 6, 7);

            if (Button.ENTER.isPressed())
            {
               LCD.clear();
               light.calibrateLow();
               LCD.drawString("Low: " + light.getLow(), 0, 2);
               low = light.getLightValue();
               LCD.drawString("LOW LIGHT " + low, 0, 3);
            }
         }

         else if (menuContr == 2)
         {
            LCD.drawString("STEP 2", 0, 0);
            LCD.drawString("Calibrate High", 0, 1);
            LCD.drawString("ENTER", 6, 7);

            if (Button.ENTER.isPressed())
            {
               LCD.clear();
               light.calibrateHigh();
               LCD.drawString("High " + light.getHigh(), 0, 2);
               high = light.getLightValue();
               LCD.drawString("HIGH LIGHT " + high, 0, 3);
            }

         }
         else if (menuContr == 3)
         {

            LCD.refresh();
            LCD.drawString("STEP 3", 0, 0);
            LCD.drawString("Speed: " + speed, 0, 2);

            LCD.drawString("+ ENTER", 5, 4);
            LCD.drawString("- ESCAPE", 5, 7);

            while (Button.ESCAPE.isPressed())
            {
               speed -= 5;
               Thread.sleep(300);
               LCD.clear();
               LCD.drawString("Speed: " + speed, 0, 2);

               if (speed < 60)
               {
                  speed = 100;
                  LCD.clear();
                  LCD.drawString("Speed: " + speed, 0, 2);
               }

            }
            while (Button.ENTER.isPressed())
            {
               speed += 5;
               Thread.sleep(300);
               LCD.clear();
               LCD.drawString("Speed: " + speed, 0, 2);

               if (speed > 100)
               {
                  speed = 60;
                  LCD.clear();
                  LCD.drawString("Speed: " + speed, 0, 2);
               }

            }
            pwr = speed;
         }

         else if (menuContr == 4)
         {
            LCD.drawString("STEP 4", 0, 0);
            LCD.drawString("VALUES", 0, 1);
            LCD.drawString("Speed: " + speed, 0, 2);
            LCD.drawString("Low: " + light.getLow(), 0, 3);
            LCD.drawString("High: " + light.getHigh(), 0, 4);
            LCD.drawString("Crr. Light: " + light.getLightValue(), 0, 5);
            LCD.drawString("LOW Light " + low, 0, 6);
            LCD.drawString("HIGH Light " + high, 0, 7);
            Thread.sleep(100);
            LCD.clear();

         }

         else if (menuContr == 5)
         {
            LCD.refresh();
            LCD.drawString("STEP 5", 0, 0);
            LCD.drawString("Follow Line", 0, 1);
            LCD.drawString("ENTER", 6, 7);

            if (Button.ENTER.isPressed())
            {
               LCD.clear();
               MotorPort motorLeft = MotorPort.B;
               MotorPort motorRight = MotorPort.C;
               motorLeft.resetTachoCount();
               motorRight.resetTachoCount();
               int lightVal = 50;

               boolean point = true;
               while (true)
               {

                  if (light.getLightValue() < lightVal && point == true)
                  {
                     motorLeft.controlMotor(pwr, 1);
                     motorRight.controlMotor(pwr, 1);
                     
                  }
                  else if (light.getLightValue() > lightVal)
                  {
                     motorLeft.controlMotor(0, 3);
                     motorRight.controlMotor(0, 3);

                     motorLeft.resetTachoCount();
                     motorRight.resetTachoCount();
                     double t1 = motorLeft.getTachoCount();
                     point = false;
                     while (point == false)
                     {
                        
                        if (light.getLightValue() < lightVal && point==false)
                        {
                        motorLeft.controlMotor(pwr, 2);
                        motorRight.controlMotor(pwr, 1);
                        }
                        

                        else if (light.getLightValue() > lightVal && point==false)
                        {
                           motorLeft.controlMotor(0, 3);
                           motorRight.controlMotor(0, 3);
                           double t2 = motorLeft.getTachoCount();
                           double tot = (t2 - t1) / 2;
                           motorLeft.resetTachoCount();
                           motorRight.resetTachoCount();
                           LCD.drawString(""+tot+" "+t2+" "+motorLeft.getTachoCount(), 0, 4);
                           while (motorLeft.getTachoCount() < tot)
                           {
                              motorLeft.controlMotor(pwr, 1);
                              motorRight.controlMotor(pwr, 2);

                           }
                        }
                        else
                        {
                        point=true;
                        }
                     }

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
