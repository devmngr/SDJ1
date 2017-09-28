import lejos.nxt.*;


public class Square
{

   public static void main(String[] args) throws InterruptedException
   {
      int pwrleft;
      int pwrright;
      MotorPort motorleft;
      MotorPort motorright;
      
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
      
      //1
      motorleft.controlMotor(pwrleft, 1);       
      motorright.controlMotor(pwrright, 1);
      
      Thread.sleep(3000);
      
      //Actual Turn
      motorleft.controlMotor(0, 3);
      Thread.sleep(380);
      motorleft.controlMotor(pwrleft, 1);
      
      //2
      motorleft.controlMotor(pwrleft, 1);       
      motorright.controlMotor(pwrright, 1);
      
      Thread.sleep(3000);
      
      motorleft.controlMotor(0, 3);
      Thread.sleep(380);
      motorleft.controlMotor(pwrleft, 1);
      
      //3
      motorleft.controlMotor(pwrleft, 1);       
      motorright.controlMotor(pwrright, 1);
      
      Thread.sleep(3000);
      
      motorleft.controlMotor(0, 3);
      Thread.sleep(380);
      motorleft.controlMotor(pwrleft, 1);
      
      //4
      motorleft.controlMotor(pwrleft, 1);       
      motorright.controlMotor(pwrright, 1);
      
      Thread.sleep(3000);
      
      motorleft.controlMotor(0, 3);
      Thread.sleep(380);
      motorleft.controlMotor(pwrleft, 1);
      
      




   }

}
