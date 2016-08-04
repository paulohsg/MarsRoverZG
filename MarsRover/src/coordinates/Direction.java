package coordinates;

import java.util.Arrays;

import robot.Rover;

public enum Direction {

	N('N'),
	E('E'),
	S('S'),
	W('W');
	
	private char name;
	
	private Direction(char name) {
		this.name = name;
	}
	
	public char getName() {
		return name;
	}

	public void setName(char name) {
		this.name = name;
	}
	
	public void turnRight(Rover rover){		
		if(rover.getDirection() == W) rover.setDirection(N);
		else rover.setDirection(this.values()[Arrays.asList(this.values()).indexOf(rover.getDirection()) + 1]);
		
	}
	
	public void turnLeft(Rover rover){		
		if(rover.getDirection() == N) rover.setDirection(W);
		else rover.setDirection(this.values()[Arrays.asList(this.values()).indexOf(rover.getDirection()) - 1]);
		
	}

	
	
	
		
	
}
