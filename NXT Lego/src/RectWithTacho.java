import lejos.nxt.*;


public class RectWithTacho
{

   public static void main(String[] args)
   {
      int pwrLeft;
      int pwrRight;
      MotorPort motorLeft;
      MotorPort motorRight;
      
      
      pwrLeft = 100;
      pwrRight= 100;
      motorLeft = MotorPort.A;
      motorRight = MotorPort.C;
      
      double length = 90;
      double width = 60;
      double pi = Math.PI;
      double wheelDiameter = 5.6;
      double wheelRadius = wheelDiameter /2.0;
      double distanceBetween = 10.8;
      
      double wheelCircumference = 2 * pi * wheelRadius;
      double turnDistance = (2 * pi * distanceBetween) / 4; //Turn distance for 90 degrees
      double tachoLength = (length / wheelCircumference) * 360;
      double tachoWidth =   (width / wheelCircumference) * 360;
      double tachoTurn =  (turnDistance / wheelCircumference) * 360;
      
      
      //
      LCD.clear();
      LCD.drawString("Press any key ", 0,7);
      LCD.drawString( "W.Radius: " + wheelRadius, 0,0);
      LCD.drawString("W.Circ.: " + wheelCircumference, 0,1);
      LCD.drawString("T.Distance: " + turnDistance, 0,2);
      LCD.drawString("T.Length" + tachoLength, 0,3);
      LCD.drawString("T.Width: " + tachoWidth, 0,4);
      LCD.drawString("T.Turn" + tachoTurn, 0,5);
      Button.waitForAnyPress();
      LCD.clear();
     
      //
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();
      
     
      //Length 1
      while(motorLeft.getTachoCount() <tachoLength)
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
      
      //Stop and Reset
      motorLeft.controlMotor(0, 3);
      motorRight.controlMotor(0, 3);
      
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();
      
      
      //Turn 1
      while (motorLeft.getTachoCount()<tachoTurn)
      {
         motorLeft.controlMotor(pwrLeft, 1);
         motorRight.controlMotor(0, 3);
      }
      motorLeft.controlMotor(0, 3);
      motorRight.controlMotor(0, 3);
      
      //
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();
      
      /////////////
      ///motorLeft.controlMotor(pwrLeft, 1);
      
      
      ////////////

      //With 1
      
      while(motorLeft.getTachoCount() <tachoWidth)
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
    
      
      //Turn 2
      
      while (motorLeft.getTachoCount()<tachoTurn)
      {
         motorLeft.controlMotor(pwrLeft, 1);
         motorRight.controlMotor(0, 3);
      }
      motorLeft.controlMotor(0, 3);
      motorRight.controlMotor(0, 3);
      
      //
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();
      
      //Length 2
      
      while(motorLeft.getTachoCount() <tachoLength)
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
      
      // Turn 3
      
      while (motorLeft.getTachoCount()<tachoTurn)
      {
         motorLeft.controlMotor(pwrLeft, 1);
         motorRight.controlMotor(0, 3);
      }
      motorLeft.controlMotor(0, 3);
      motorRight.controlMotor(0, 3);
      
      //
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();
      
      //Width 2
      while(motorLeft.getTachoCount() <tachoWidth)
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
      
    //Turn 4
      while (motorLeft.getTachoCount()<tachoTurn)
      {
         motorLeft.controlMotor(pwrLeft, 1);
         motorRight.controlMotor(0, 3);
      }
      motorLeft.controlMotor(0, 3);
      motorRight.controlMotor(0, 3);
      
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();
   
   
   }
}
