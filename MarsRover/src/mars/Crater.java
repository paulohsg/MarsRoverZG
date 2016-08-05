package mars;

import robot.Rover;

public class Crater implements MarsGround{

	private int radius;

	public Crater(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}		
	
}
