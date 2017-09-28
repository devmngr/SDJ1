import lejos.nxt.*;

public class lineDacer
{

   public static void main(String[] args) throws InterruptedException
   {
     
	   		// Math
    		double diameter = 13.0;  
    		double radius = diameter/2;
    		double pi = Math.PI;
    		double circleTurn = 2 * pi * radius;
    		double degreeTurn = circleTurn / 360;
    		
    		// Declaration
    		MotorPort motorL;
    		MotorPort motorR;
    		int power;
    		LightSensor light;
    		int[] array;
    		int errorI;
    		int low;
    		int high;
    		
    		
    		// Initialization
    		motorR = MotorPort.A;
    		motorL = MotorPort.B;
    		power = 80;
    		light = new LightSensor(SensorPort.S1);
    		array = new int[100];
    		errorI = 0;
    		int speed = 100;
    		int pwr = 70;
    		int pwrRight = 70;
    	    int pwrLeft = 70;

    		light.setFloodlight(true);
      
    		 int menuContr = 1;
    	     boolean flag = false;
     

      while (true)
      {
         // Menu1
         if (menuContr == 1)
         {
            LCD.refresh();
            LCD.drawString("STEP 1", 0, 0);

            LCD.drawString("Calibrate Low", 0, 1);
            LCD.drawString("ENTER", 6, 7);

            if (Button.ENTER.isPressed())
            {
               LCD.clear();
               light.calibrateLow();
               LCD.drawString("Low: " + light.getLow(), 0, 2);
               low = light.getLightValue();
               LCD.drawString("LOW LIGHT " + low, 0, 3);
            }
         }

         else if (menuContr == 2)
         {
            LCD.drawString("STEP 2", 0, 0);
            LCD.drawString("Calibrate High", 0, 1);
            LCD.drawString("ENTER", 6, 7);

            if (Button.ENTER.isPressed())
            {
               LCD.clear();
               light.calibrateHigh();
               LCD.drawString("High " + light.getHigh(), 0, 2);
               high = light.getLightValue();
               LCD.drawString("HIGH LIGHT " + high, 0, 3);
            }

         }
         else if (menuContr == 3)
         {

            LCD.refresh();
            LCD.drawString("STEP 3", 0, 0);
            LCD.drawString("Speed: " + speed, 0, 2);

            LCD.drawString("+ ENTER", 5, 4);
            LCD.drawString("- ESCAPE", 5, 7);

            while (Button.ESCAPE.isPressed())
            {
               speed -= 5;
               Thread.sleep(300);
               LCD.clear();
               LCD.drawString("Speed: " + speed, 0, 2);

               if (speed < 60)
               {
                  speed = 100;
                  LCD.clear();
                  LCD.drawString("Speed: " + speed, 0, 2);
               }

            }
            while (Button.ENTER.isPressed())
            {
               speed += 5;
               Thread.sleep(300);
               LCD.clear();
               LCD.drawString("Speed: " + speed, 0, 2);

               if (speed > 100)
               {
                  speed = 60;
                  LCD.clear();
                  LCD.drawString("Speed: " + speed, 0, 2);
               }

            }
            pwr = speed;
         }

         else if (menuContr == 4)
         {
            LCD.drawString("STEP 4", 0, 0);
            LCD.drawString("VALUES", 0, 1);
            LCD.drawString("Speed: " + speed, 0, 2);
            LCD.drawString("Low: " + light.getLow(), 0, 3);
            LCD.drawString("High: " + light.getHigh(), 0, 4);
            LCD.drawString("Crr. Light: " + light.getLightValue(), 0, 5);
            LCD.drawString("LOW Light " + light.getLow(), 0, 6);
            LCD.drawString("HIGH Light " + light.getHigh(), 0, 7);
            Thread.sleep(100);
            LCD.clear();

         }

         else if (menuContr == 5)
         {
            LCD.refresh();
            LCD.drawString("STEP 5", 0, 0);
            LCD.drawString("Follow Line", 0, 1);
            LCD.drawString("ENTER", 6, 7);

            if (Button.ENTER.isPressed())
            {
               LCD.clear();
               MotorPort motorleft = MotorPort.A;
               MotorPort motorright = MotorPort.B;
               
         
               
               MotorPort motorLeft;
               MotorPort motorRight;
               motorLeft = MotorPort.A;
               motorRight = MotorPort.B;
                  

               while (true) {
       			motorL.resetTachoCount();
       			motorR.resetTachoCount();

       			control.dark(light);
       			while (control.dark(light)) {
       				control.forward(motorL, motorR, power);
       			}

       			
       			control.stop(motorL, motorR);
       			array[errorI] = motorL.getTachoCount();
       			errorI++;
       			motorL.resetTachoCount();
       			motorR.resetTachoCount();
       			
       			
       			while (!control.dark(light) && motorL.getTachoCount() < 80) {
       				control.rotate(motorL, motorR, power);
       			}

       			control.stop(motorL, motorR);
       			motorL.resetTachoCount();
       			motorR.resetTachoCount();
       			if (!control.dark(light)) {

       				while (!control.dark(light) && motorR.getTachoCount() < 350) {
       					control.rotate(motorR, motorL, power); 
       				}
       				motorL.resetTachoCount();
       				motorR.resetTachoCount();
       			}
       			
       			
       			if (!control.dark(light)) { 
       				control.stop(motorL, motorR);		
       				Sound.setVolume(100);
       				Sound.playNote(Sound.PIANO, 207, 1000);
       					
       				
       				for(int i = 0; i < errorI; i++){
       					LCD.clear();
       					LCD.drawString(array[i] + "", 0, 0);
       					int a = Button.waitForAnyPress();
       					if(a == Button.ID_ESCAPE){
       						break;
       					}
       				}
       				break;
       			}

       		}

            }

         }

        
         if (Button.RIGHT.isDown() && flag == false)
         {
            menuContr++;
            LCD.clear();
            while (Button.RIGHT.isDown() && flag == false)
            {
            }
         }
         if (Button.LEFT.isDown() && flag == false)
         {
            menuContr--;
            LCD.clear();
            while (Button.LEFT.isDown() && flag == false)
            {
            }
         }

      }

   }









}