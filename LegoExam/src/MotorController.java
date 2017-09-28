import lejos.nxt.MotorPort;

public class MotorController
{
   private int power;
   private double distance;
   private double degrees;
   private double wheelDiameter = 5.6;
   private double wheelRadius;
   private double wheelCircumference;
   private double distBetween = 16.5;

   private double tachoForDistance; // //NEW!!!!!!!!!!
   private MotorPort motorA;
   private MotorPort motorB;
   private MotorPort motorC;

   public MotorController(int power, MotorPort motorA)
   {
      this.power = power;
      this.motorA = motorA;
   }

   public MotorController(int power, MotorPort motorA, MotorPort motorB)
   {
      this.power = power;
      this.motorA = motorA;
      this.motorB = motorB;
   }

   public MotorController(int power, MotorPort motorA, MotorPort motorB,
         MotorPort motorC)
   {
      this.power = power;
      this.motorA = motorA;
      this.motorB = motorB;
      this.motorC = motorC;
   }

   public void setPower(int power)
   {
      this.power = power;
   }

   public int getPower()
   {
      return power;
   }

   public void setDistance(double distance)
   {
      this.distance = distance;
   }

   public double getDistance()
   {
      return distance;
   }

   public void setWheelDiameter(double wheelDiameter)
   {
      this.wheelDiameter = wheelDiameter;
   }

   public double getWheelDiameter()
   {
      return wheelDiameter;
   }

   public void setWheelRadius(double wheelRadius)
   {
      this.wheelRadius = wheelRadius;
   }

   public double getWheelRadius()
   {
      return getWheelDiameter() / 2;
   }

   public void setWheelCircumference(double wheelCircumference)
   {
      this.wheelCircumference = wheelCircumference;
   }

   public double getWheelCircumference()
   {
      return 2 * Math.PI * getWheelRadius();
   }

   public void setDistanceBetween(double distBetween)
   {
      this.distBetween = distBetween;
   }

   public double getDistanceBetween()
   {
      return distBetween;
   }

   public void setDegrees(double degrees)
   {
      this.degrees = degrees;
   }

   public double getDegrees()
   {
      return degrees;
   }

   public double getTurnDistance()
   {
      if (degrees > 0 && degrees < 360)
      {
         return (2 * Math.PI * getDistanceBetween()) / (360 / getDegrees());
      }
      else if (degrees >= 360)
      {
         return (2 * Math.PI * getDistanceBetween()) * (getDegrees() / 360);
      }
      else
         return 0;
   }

   public void setTachoForDistance(double tachoForDistance) // /NEW!!!!!!
   {
      this.tachoForDistance = tachoForDistance;
   }

   public double getTachoForDistance()
   {
      return tachoForDistance;
   }

   public double getTachoDistance()
   {
      return (getDistance() / getWheelCircumference()) * 360;
   }

   public double getTachoTurn()
   {
      return (getTurnDistance() / getWheelCircumference()) * 360;
   }

   public double getTachoFwd() // for one wheel going fwd and 1 backwards
   {
      return ((getDistance() / getWheelCircumference()) * 360) / 2;
   }

   public double getTachoBack() // for one wheel going fwd and 1 backwards
   {
      return getTachoFwd() / 2;
   }

   public double tachoToDistance()
   {
      return (getTachoForDistance() / 360) * getWheelCircumference();
   }
   
   public double getTachoCnt()
   {
     return motorA.getTachoCount();
   }

   public void go(int state)
   {
      motorA.controlMotor(power, state);
      motorB.controlMotor(power, state);  
      
     /* if (state == 3)
      {
         power=0;
      }
      */
   }

   public void goForward()
   {
      go(1);
   }

   public void goBack()
   {
      go(2);
   }

   public void Brake()
   {  
      go(3);
   }

   public void Turn(int i)
   {
      if (i == 0)
      {
         motorA.controlMotor(power, 0);
         motorB.controlMotor(power, 1);
      }
      else
      {
         motorA.controlMotor(power, 1);
         motorB.controlMotor(power, 0);
      }
   }

   public void TurnLeft()
   {
      Turn(0);
   }

   public void TurnRight()
   {
      Turn(1);
   }

   public void Drive(int stateA)
   {
      motorA.controlMotor(power, stateA);
   }

   public void Drive(int stateA, int stateB)
   {
      motorA.controlMotor(power, stateA);
      motorB.controlMotor(power, stateB);
   }

   public void Drive(int stateA, int stateB, int stateC)
   {
      motorA.controlMotor(power, stateA);
      motorB.controlMotor(power, stateB);
      motorC.controlMotor(power, stateC);
   }

}
