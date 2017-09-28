import lejos.nxt.*;

public class UltrasonicController
{

   private double distance;
   private UltrasonicSensor ultrasonic;

   public UltrasonicController(double distance)
   {
      this.distance = distance;
      ultrasonic = new UltrasonicSensor(SensorPort.S1);
   }

   public void setDistance(double distance)
   {
      this.distance = distance;
   }

   public double getDist()
   {
      return distance;
   }

   public String toString()
   {
      return "Distance: " + distance;
   }

}
