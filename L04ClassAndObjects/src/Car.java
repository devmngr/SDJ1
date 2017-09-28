
public class Car
{
   private int yearModel;
   private String make;
   private int speed;
   
   
   public Car (int yearModel,String make)
   {
      this.yearModel = yearModel;
      this.make= make;
      speed = 0;  
   }
   
   public int getAccelerate()
   {
      return speed = speed +  5;
   }
   
   public int getBrake()
   {
      return speed = speed - 5;
   }
   
   public String toString()
   {
      return "Year model: " + yearModel + "\n"
            + " Make: " + make + "\n"
            + " Speed: " + speed;
   }
   

}
