package mbc.ceilingFan;

/**
 * Fan --- The class that contains the framework for the fan in the simulation.
 * @author Greg Shalay
 *
 */
public class Fan {
	// true = "clockwise rotation", false = "counter-clockwise rotation" 
	private boolean isRotatingClockwise;
	private int currentSpeed;
	
	private final int MAX_SPEED = 3;
	
	/**
	 * Fan Constructor
	 */
	public Fan() {
		super();
		
		currentSpeed = 0;
		isRotatingClockwise = true;
	}
	
	/**
	 * incrementSpeed --- Increases speed by one, if speed becomes more than the max, it is reset to 0.
	 */
	protected void incrementSpeed() {
		currentSpeed++;
		
		if(currentSpeed > MAX_SPEED) {
			currentSpeed = 0;
		}
	}
	
	/**
	 * reverseRotation --- Changes the rotation flag to the opposite of what it was originally set to.
	 */
	protected void reverseRotation() {
		isRotatingClockwise = !isRotatingClockwise;
	}
	
	/**
	 * printState --- Builds and prints the output string containing the state information of the ceiling fan.
	 */
	protected void printState() {
		String state = "Fan speed: " + currentSpeed;
		
		switch(currentSpeed) {
			case 0:
				state += " (OFF) ";
				break;
			case 1:
				state += " (LOW) ";
				break;
			case 2:
				state += " (MEDIUM) ";
				break;
			case 3:
				state += " (HIGH) ";
				break;
			default:
				System.err.println("Error: Speed setting invalid!");
				break;
		}
		
		if(isRotatingClockwise) {
			state += " Rotation: Clockwise";
		}
		else {
			state += " Rotation: Counter-Clockwise";
		}
		
		System.out.println(state);
	}
}
