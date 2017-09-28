import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;

public class JustFallow
{

   public static void main(String[] args)
   {
      MotorPort motorLeft = MotorPort.C;
      MotorPort motorRight = MotorPort.B;
      motorLeft.resetTachoCount();
      motorRight.resetTachoCount();
      int lightVal = 50;

      boolean white = true;
      boolean black = true;
      double t1 = 0;
      double t2 = 0;
      double tot = (t2 - t1) / 2;

      LightSensor light = new LightSensor(SensorPort.S1);
      MotorController motor1 = new MotorController();
      motor1.setDegrees(90);
      motor1.setWheelDiameter(5.6);
      motor1.setDistanceBetween(15);
      motor1.setPower(70);

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
      
      double[] error = new double[100];

      while (true)
      {

         if (light.getLightValue() < lightVal)
         {
            motorLeft.controlMotor(motor1.getPower(), 1);
            motorRight.controlMotor(motor1.getPower(), 1);
         }

         else if (light.getLightValue() > lightVal)
         {
            motorLeft.controlMotor(0, 3);
            motorRight.controlMotor(0, 3);
            
            for(int i = 0; i<1;i++)
            {
               error++;
            }
            
            
            
            
            
            
            white = true;
            black= false;

            if (white == true)
            {
               motorLeft.controlMotor(0, 3);
               motorRight.controlMotor(0, 3);
               motorLeft.resetTachoCount();
               motorRight.resetTachoCount();
               while (motorLeft.getTachoCount() < motor1.getTachoTurn())
               {
                  motorLeft.controlMotor(motor1.getPower(), 1);
                  motorRight.controlMotor(motor1.getPower(), 2);
               }
               if(light.getLightValue() < lightVal)
               {
                  motorLeft.controlMotor(0, 3);
                  motorRight.controlMotor(0, 3);
                  motorLeft.resetTachoCount();
                  motorRight.resetTachoCount();
                  t1=motorLeft.getTachoCount();
                  black=true;
               }
              
               while (motorLeft.getTachoCount() >motor1.getTachoTurn())
               {
                  
                  
                  
                  motorLeft.controlMotor(motor1.getPower(), 2);
                  motorRight.controlMotor(motor1.getPower(), 1);
                  
                  if(light.getLightValue() < lightVal)
                  {
                     
                     black=true;
                  }
               } 
            }
            if(white==false)
            {
               
            }
         }

      }

   }
}
