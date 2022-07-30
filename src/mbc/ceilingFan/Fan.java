package mbc.ceilingFan;

public class Fan {
	// true = "clockwise rotation", false = "counter-clockwise rotation" 
	private boolean isRotatingClockwise;
	private int currentSpeed;
	
	private final int MAX_SPEED = 3;
	
	public Fan() {
		super();
		
		currentSpeed = 0;
		isRotatingClockwise = true;
	}
	
	protected void incrementSpeed() {
		currentSpeed++;
		
		if(currentSpeed > MAX_SPEED) {
			currentSpeed = 0;
		}
	}
	
	protected void reverseRotation() {
		isRotatingClockwise = !isRotatingClockwise;
	}
	
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
