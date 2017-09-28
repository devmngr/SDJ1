import lejos.nxt.*;



public class OneMeter
{

   public static void main(String[] args)
   {
      int pwrleft;
      int pwrright;
      MotorPort motorleft;
      MotorPort motorright;
      double tachosForMoving1mForward = 2016;
      //
      pwrleft     =  90;
      pwrright    =  90;
      motorleft   =  MotorPort.A;
      motorright  =  MotorPort.C;
     
      
      //
      LCD.clear();
      LCD.drawString("Press any key ", 0,0);
      Button.waitForAnyPress();
      LCD.clear();
     
      //
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();
      
     
     
      //
      while(motorleft.getTachoCount() <tachosForMoving1mForward)
      {
      motorleft.controlMotor(pwrleft, 1);       
      motorright.controlMotor(pwrright, 1);
      }
      
      
      

   }

}
