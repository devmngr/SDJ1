
public class Test
{

   public static void main(String[] args)
   {
      Van van = new Van("Bill", 10000, "AJ30082", 7500);
      SportsCar sport = new SportsCar("Mark", 12000, "AX44053", 3500);
      Car car = new Car("HE", 20000, "AJ30082");
      Bicycle bike = new Bicycle("She", 2000, 25);
      Vehicle vehicle = new Vehicle("HEEEE", 999999);
      
      System.out.println(vehicle);
      System.out.println(bike);
      System.out.println(car);
      System.out.println(van);
      System.out.println(sport);
   }

}
