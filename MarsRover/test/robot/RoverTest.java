package robot;

import mars.MarsGround;
import mars.Plateau;
import coordinates.Cartesian;
import coordinates.Direction;
import junit.framework.TestCase;


public class RoverTest extends TestCase{
	
	Rover rover = new Rover(new Plateau(new Cartesian(5, 5)), new Cartesian(1, 2), Direction.valueOf("N"));
	
	public void testCoordinatesToString(){		
		String actual = rover.coordinatesToString();
		String expected = "1 2 N";
		
		assertEquals(expected, actual);
	}
	
	public void testValidateCommandTrue(){
		boolean actual = rover.validateCommand("mmrmrmlmlmrmm");
		
		assertTrue(actual);
	}
	
	public void testValidateCommandFalse(){
		boolean actual = rover.validateCommand("mmrmrmlmlmrmk");
		
		assertFalse(actual);
	}
	
	public void testValidateRoverDirectionTrue(){
		boolean actual = rover.validateRoverDirection("N");
		
		assertTrue(actual);
	}
	
	public void testValidateRoverDirectionFalse(){
		boolean actual = rover.validateRoverDirection("Q");
		
		assertFalse(actual);
	}
	
	public void testValidateRoverCartesianCoordinatesTrue(){
		boolean actual = rover.validateRoverCartesianCoordinates(1, 2);
		
		assertTrue(actual);
	}
	
	public void testValidateRoverCartesianCoordinatesFalse(){
		boolean actual = rover.validateRoverCartesianCoordinates(-5, 2);
		
		assertFalse(actual);
	}
	
	public void testRunCommand1(){		
		rover.runCommand("LMLMLMLMM");
		String actual = rover.coordinatesToString();
		String expected = "1 3 N";
		
		assertEquals(expected, actual);
		
	}
	
	public void testRunCommand2(){		
		rover.runCommand("MMMMMMMMMMM");
		String actual = rover.coordinatesToString();
		String expected = "1 5 N";
		
		assertEquals(expected, actual);
		
	}
	
	public void testRunCommand3(){		
		rover.runCommand("RMMMMMMMMMMMMM");
		String actual = rover.coordinatesToString();
		String expected = "5 2 E";
		
		assertEquals(expected, actual);
		
	}
	
	public void testRunCommand4(){
		rover.runCommand("LMMMMMMMMMMMMM");
		String actual = rover.coordinatesToString();
		String expected = "0 2 W";
		
		assertEquals(expected, actual);
		
	}
	
	public void testRunCommand5(){
		rover.runCommand("LLMMMMMMMMMMMMM");
		String actual = rover.coordinatesToString();
		String expected = "1 0 S";
		
		assertEquals(expected, actual);
		
	}

}
