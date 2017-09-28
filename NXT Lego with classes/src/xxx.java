import lejos.nxt.*;

public class xxx
{

   public static void main(String[] args) throws InterruptedException
   {
      UltrasonicSensor ultrasonic = new UltrasonicSensor(SensorPort.S4);
      TouchSensor touch = new TouchSensor(SensorPort.S1);

      UltrasonicController ultra = new UltrasonicController();
      ultra.setDistance(40);
      
      MotorController motor = new MotorController();
      MotorController motor1 = new MotorController();
      boolean flag=false;

    //Used for turning around
      motor.setPower(60); 
      
      //Used for going forward and backwards
      motor1.setPower(100);
      motor1.setDistance(45);

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


         if (ultrasonic.getDistance() <= ultra.getDist())
         { 
            flag=true;
            MotorPort.A.resetTachoCount();
            MotorPort.C.resetTachoCount();
            while (motorLeft.getTachoCount() < motor1.getTachoDistance())
            {
               motorRight.controlMotor(motor1.getPower(), 1);
               motorLeft.controlMotor(motor1.getPower(), 1);

               LCD.clear();
               LCD.drawString("Distance: " + ultrasonic.getDistance(), 0, 3);
               Sound.playTone(4000, 500);

             

               if (motorLeft.getTachoCount() > motorRight.getTachoCount())
               {
                  motorRight.controlMotor(0, 3);
               }
               else if (motorLeft.getTachoCount() < motorRight.getTachoCount())
               {
                  motorLeft.controlMotor(0, 3);
               }

               if (touch.isPressed()
                     || motorLeft.getTachoCount() >= motor1.getTachoDistance())
               {
                  motorRight.controlMotor(0, 3);
                  motorLeft.controlMotor(0, 3);

                  while (motorLeft.getTachoCount() >0)
                  {
                     motorRight.controlMotor(motor1.getPower(), 2);
                     motorLeft.controlMotor(motor1.getPower(), 2);

                     if (motorLeft.getTachoCount() > motorRight.getTachoCount())
                     {
                        motorRight.controlMotor(0, 3);
                     }
                     else if (motorLeft.getTachoCount() < motorRight
                           .getTachoCount())
                     {
                        motorLeft.controlMotor(0, 3);
                     }
                  }
                  motorLeft.controlMotor(0, 3);
                  motorRight.controlMotor(0, 3);
                  break;

               }
            }

     

         }
         else if (ultrasonic.getDistance() > ultra.getDist())
         {
            flag=false;
            while (flag=false)
            {
               double t1=motorLeft.getTachoCount();
               
               if (flag=false)
               {
                  double t2=motorLeft.getTachoCount();
                  double tot=(t2-t1)/2;
                  while (motorLeft.getTachoCount()<tot)
                  {
                  motorLeft.controlMotor(motor.getPower(), 2);
                  motorRight.controlMotor(motor.getPower(), 1);
                  }
                  
               }
            }
            
            
            
            
            LCD.clear();
            
            MotorPort.A.resetTachoCount();
            MotorPort.C.resetTachoCount();
            LCD.drawString("Distance: " + ultrasonic.getDistance(), 0, 3);
            motorLeft.controlMotor(motor.getPower(), 1);
            motorRight.controlMotor(motor.getPower(), 2);
         }

      }

   }
}
