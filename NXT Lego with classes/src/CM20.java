import lejos.nxt.LCD;
import lejos.nxt.MotorPort;


public class CM20
{

   public static void main(String[] args) throws InterruptedException
   {
      MotorController motor = new MotorController(100, MotorPort.B);
      motor.setDistance(20);
      MotorPort.B.resetTachoCount();
      while (MotorPort.B.getTachoCount() < motor.getTachoDistance())
      {
         motor.Drive(2);
         
      }
   }

}
