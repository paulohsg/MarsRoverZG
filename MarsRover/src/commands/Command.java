package commands;

import robot.Rover;

public interface Command {

	public void execute(Rover rover);
	
}
