import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.MotorPort;


public class Triangle
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
      
      
      //Triangle ABC
      double AB = 100;
      double BC = 60;
      double CA = 100;
      
      double pi = Math.PI;
      double wheelDiameter = 5.6;
      double wheelRadius = wheelDiameter /2.0;
      double distanceBetween = 10.8;
      double turn1 = 360 / 145;        //35 angle (180-35)
      double turn2 = 360 / 107.5;      //72.5 angle (180-72.5)
      double turn3 = 360 / 107.5;      //72.5 angle (180-72.5)
      double wheelCircumference = 2 * pi * wheelRadius;
      
    //Turn distance for angles A, B and C
      double turnDistanceA = (2 * pi * distanceBetween) / turn1 ; 
      double turnDistanceB = (2 * pi * distanceBetween) / turn2 ;
      double turnDistanceC = (2 * pi * distanceBetween) / turn3 ;
   //Turn tachos for angles A, B and C
      double tachoAB = (AB / wheelCircumference) * 360;
      double tachoBC = (BC / wheelCircumference) * 360;
      double tachoCA = (CA / wheelCircumference) * 360;
      
      double tachoTurnInA =  (turnDistanceA / wheelCircumference) * 360;
      double tachoTurnInB =  (turnDistanceB / wheelCircumference) * 360;
      double tachoTurnInC =  (turnDistanceC / wheelCircumference) * 360;
      
      
      //Data on LCD
      LCD.clear();
      LCD.drawString("Press any key ", 0,7);
      LCD.drawString( "W.Radius: " + wheelRadius, 0,0);
      LCD.drawString("W.Circ.: " + wheelCircumference, 0,1);
      LCD.drawString("T.AB,CA: " + tachoAB, 0,2);
      LCD.drawString("T.BC: " + tachoBC, 0,3);
      LCD.drawString("T.A: " + tachoTurnInA, 0,4);
      LCD.drawString("T.B, C: " + tachoTurnInB, 0,5);
    
      Button.waitForAnyPress();
      LCD.clear();
     
      //
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();
      
      
////  AB
      
      while(motorLeft.getTachoCount() <tachoAB)
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
      
////Turn  in B
      while (motorLeft.getTachoCount()<tachoTurnInB)
      {
         motorLeft.controlMotor(pwrLeft, 1);
         motorRight.controlMotor(0, 3);
      }
      motorLeft.controlMotor(0, 3);
      motorRight.controlMotor(0, 3);
      
      //
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();
      
////  BC
      
      while(motorLeft.getTachoCount() <tachoBC)
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
      
////Turn  in C
      while (motorLeft.getTachoCount()<tachoTurnInC)
      {
         motorLeft.controlMotor(pwrLeft, 1);
         motorRight.controlMotor(0, 3);
      }
      motorLeft.controlMotor(0, 3);
      motorRight.controlMotor(0, 3);
      
      //
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();
      
////  CA
      
      while(motorLeft.getTachoCount() <tachoCA)
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
      
      

      
   }

}
