
public class PointTest
{

   public static void main(String[] args)
   {
      Point point = new Point(2, 6);
      Point point1 = new Point(3, 8);
      System.out.println("Initial Points");
      System.out.println(point);
      System.out.println(point1);
      
      ///SET
      int x = 5;
      point.setX(x);
      
      int y = 2;
      point.setY(y);
      
      System.out.println("\nPoints after using set method");
      System.out.println(point);
      System.out.println(point1);
      
      ///moveTo...get x, y method
      int x1 = 3;
      int y2 = 7;
      point1.moveTo(x1, y2);
      System.out.println("\n Displaying Points using get-method after using moveTO method");
      System.out.println("First Point: \n" + "x=" + point.getX() + "\ny=" + point.getY());
      System.out.println("Second Point: \n" + "x=" + point1.getX() + "\ny=" + point1.getY());
      
      ///move.... method
      int xDistance = 4;
      int yDistance = 7;
      
      point.move(xDistance, yDistance);
      point1.move(xDistance, yDistance);
      System.out.println("increasing x with 4 and y with 7 after using move-method and "
            + "displaying using the toString method");
      System.out.println(point);
      System.out.println(point1);
      
      ///Distance between points 
      double dist = Math.sqrt((point1.getX() - point.getX()) * (point1.getX() - point.getY()) +
            (point1.getY() - point.getY()) * (point1.getY() - point.getY()));
      System.out.println("Distance between the two points: " + dist);
   }

}
