package commands;

import robot.Rover;

public class Left implements Command{

	@Override
	public void execute(Rover rover) {
		rover.left();		
	}

}
