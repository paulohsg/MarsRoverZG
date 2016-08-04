package robot;

import java.util.List;

import commands.Command;
import commands.ParserStringToCommand;

import mars.MarsGround;
import mars.Plateau;
import coordinates.Coordinates;
import coordinates.Direction;
import coordinates.Cartesian;;

public class Rover {
	
	private MarsGround groundType;
	private Coordinates coordinates;
	private Direction direction;
	
	public Rover(MarsGround groundType, Coordinates coordinates,
			Direction direction) {
		
		super();
		this.groundType = groundType;
		this.coordinates = coordinates;
		this.direction = direction;
	}	

	public MarsGround getGroundType() {
		return groundType;
	}

	public void setGroundType(MarsGround groundType) {
		this.groundType = groundType;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public void runCommand(String command){
		List<Command> commandListFromParser = new ParserStringToCommand(command).getCommands();
		
		for(Command cmd : commandListFromParser){
			cmd.execute(this);
		}
		
	}
	
	public void right(){
		if(this.getDirection() == Direction.N){
			this.setDirection(Direction.E);
		}else if(this.getDirection() == Direction.E){
			this.setDirection(Direction.S);
		}else if(this.getDirection() == Direction.S){
			this.setDirection(Direction.W);
		}else{
			this.setDirection(Direction.N);
		}
		
	}
	
	public void left(){
		if(this.getDirection() == Direction.N){
			this.setDirection(Direction.W);
		}else if(this.getDirection() == Direction.E){
			this.setDirection(Direction.N);
		}else if(this.getDirection() == Direction.S){
			this.setDirection(Direction.E);
		}else{
			this.setDirection(Direction.S);
		}
	}
	
	public void move(){	
		
		if(this.getGroundType() instanceof Plateau){
			Plateau plateau = (Plateau) this.groundType;
			Cartesian auxPlateauSize = (Cartesian) plateau.getUpperRightCoordinates();
			Cartesian auxCoordinate = (Cartesian) this.coordinates;
			this.coordinates = ((Cartesian) this.coordinates);
			
			if(this.direction == Direction.N){
				if(!(((Cartesian) this.coordinates).getyAxis() == auxPlateauSize.getyAxis())){
					((Cartesian) this.coordinates).setyAxis(auxCoordinate.getyAxis() + 1);
				}
				
				
			}else if(this.direction == Direction.E){
				((Cartesian) this.coordinates).setxAxis(auxCoordinate.getxAxis() + 1);
				
			}else if(this.direction == Direction.S){
				((Cartesian) this.coordinates).setyAxis(auxCoordinate.getyAxis() - 1);
				
			}else{
				((Cartesian) this.coordinates).setxAxis(auxCoordinate.getxAxis() - 1);
			}
			
			
			
		}		
		
	}
	
	
	
	public boolean isOutOfYBounds(){
		Plateau plateau = (Plateau) this.groundType;
		Cartesian auxPlateauSize = (Cartesian) plateau.getUpperRightCoordinates();
		
		return false;
	}
	
	public String coordinatesToString(){
		return this.coordinates.getCoordinatesAsText() + " " +this.direction.name();
	}
	
	
	
	

}
