import lejos.nxt.*;

public class Day1
{

   public static void main(String[] args) throws InterruptedException
   {
      //Declaring variables
      int         pwrleft;    //Power to left motor
      int         pwrright;   //Power to right motor
      MotorPort   motorleft;  //Object representing left motor
      MotorPort   motorright; //Object representing right motor
      LightSensor light;      //Object representing light sensor
      
      // Initializing variables
      pwrleft     =  100;
      pwrright    =  60;
      motorleft   =  MotorPort.A;
      motorright  =  MotorPort.C;
      light       =  new LightSensor(SensorPort.S2);
      
      //Prepare Sensors
      light.setFloodlight(true);
      MotorPort.A.resetTachoCount();
      MotorPort.C.resetTachoCount();
      
      //Write a message, wait for response, clear message again
      LCD.clear();
      LCD.drawString("Press any key ", 0,0);
      Button.waitForAnyPress();
      LCD.clear();
      
      //Turn off LED in light sensor
      light.setFloodlight(false);
      
      //Start both motors
      motorleft.controlMotor(pwrleft, 1);       //1 = start
      motorright.controlMotor(pwrright, 1);
      
      //Wait Three seconds
      Thread.sleep(3000);
      
      //Stop both motors
      motorleft.controlMotor(0, 3);             // 3 = stop
      motorright.controlMotor(0, 3);

   }

}
