import java.util.Scanner;


public class CarTest
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the car's year model: ");
      int yearModel = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.println("Enter the make of the car: ");
      String make = keyboard.nextLine();
      
      
      Car car = new Car(yearModel, make);
    
      //Accelerate
    System.out.println(car);
    System.out.println("Accelearate 1: " + car.getAccelerate());
    System.out.println("Accelearate 2: " + car.getAccelerate());
    System.out.println("Accelearate 3: " + car.getAccelerate());
    System.out.println("Accelearate 4: " + car.getAccelerate());
    System.out.println("Accelearate 5: " + car.getAccelerate());
    
    //Brake
    System.out.println("Brake 1: " + car.getBrake());
    System.out.println("Brake 2: " + car.getBrake());
    System.out.println("Brake 3: " + car.getBrake());
    System.out.println("Brake 4: " + car.getBrake());
    System.out.println("Brake 5: " + car.getBrake());
      

   }

}
