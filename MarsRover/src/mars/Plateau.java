package mars;

import robot.Rover;
import coordinates.Cartesian;
import coordinates.Coordinates;

public class Plateau implements MarsGround{

	private Coordinates upperRightCoordinates;

	public Plateau(Coordinates coordinates) {
		this.upperRightCoordinates = coordinates;
	}

	public Coordinates getUpperRightCoordinates() {
		return upperRightCoordinates;
	}

	public void setUpperRightCoordinates(Coordinates upperRightCoordinates) {
		this.upperRightCoordinates = upperRightCoordinates;
	}	

}
