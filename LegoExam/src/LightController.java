import lejos.nxt.*;

public class LightController {
	private LightSensor lightsensor;
	private SensorPort light;

	private int black;
	private int white;

	public LightController(SensorPort light) {
		lightsensor = new LightSensor(light);
	}

	public void setBlack(int black) {
		this.black = black;
	}

	public void setWhite(int white) {
		this.white = white;
	}

	public int getBlack() {
		return black;
	}

	public int getWhite() {
		return white+25;
	}

	public int getGrey() {
		return white-10;
	}
	public void calibrateBlack() // /LOW
	{
		LCD.clear();
		LCD.drawString("Calibrate Black", 0, 1);
		// Button.waitForAnyPress();
		int x = 0;

		for (int i = 0; i < 500; i++) {
			x += lightsensor.getNormalizedLightValue();
		}
		int total = x / 500;

		lightsensor.setLow(total);
		LCD.clear();
	}

	public void calibrateWhite() // /HIGH
	{
		LCD.clear();
		LCD.drawString("Calibrate White", 0, 1);
		int y = 0;

		for (int i = 0; i < 500; i++) {
			y += lightsensor.getNormalizedLightValue();
		}
		int total1 = y / 500;
		lightsensor.setHigh(total1);
		LCD.clear();

	}

	public int getLight() {
		return lightsensor.getLightValue();
	}

	public boolean isOnBlack() {
		if (getLight() <= getBlack()) {
			return true;
		} else
			return false;
	}

	public boolean isOnWhite() {
		if (getLight() > getWhite()) {
			return true;
		}
		return false;
	}

	public boolean isOnGrey() {
		if (getLight() < getGrey()) {
			return true;
		} else
			return false;
	}

}
