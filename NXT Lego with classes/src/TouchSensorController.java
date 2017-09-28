import lejos.nxt.*;

public class TouchSensorController
{
  private boolean touch;
  
  
  public void setTouch(boolean touch)
  {
     this.touch = touch;
  }
  public boolean getTouch()
  {
     return touch;
  }
  
  
  public String toString()
  {
     if (touch == true)
     {
        return "Button pressed";
     }
     else
        return "Button not pressed";
     
  }

}
