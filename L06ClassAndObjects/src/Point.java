
public class Point
{
   private int x;
   private int y;
   
   public Point (int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   public void setX(int x)
   {
      this.x = x;
   }
   public void setY(int y)
   {
      this.y = y;
   }
   public void moveTo(int newX, int newY)
   {
      newX = x;
      newY = y;
   }
   public void move(int xDistance, int yDistance)
   {
      xDistance = x = x + xDistance;
      yDistance = y = y + yDistance;
   }
   
   public int getX()
   {
      return x;
   }
   public int getY()
   {
      return y;
   }
   
   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
   
  
  

}
