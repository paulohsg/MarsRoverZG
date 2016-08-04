package commands;

import robot.Rover;

public class Right implements Command{

	@Override
	public void execute(Rover rover) {
		rover.right();		
	}

}
