import java.util.Scanner;

import robot.Rover;
import coordinates.Cartesian;
import coordinates.Direction;
import mars.MarsGround;
import mars.Plateau;


public class MarsRoverMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		MarsGround plateau = new Plateau(new Cartesian(5, 5));
		Rover rover = new Rover(plateau, new Cartesian(3, 3), Direction.E);
		
		rover.runCommand("MMRMMRMRRM");
		System.out.println(rover.coordinatesToString());
		*/
		
		System.out.println("Foneça as coordenadas do canto superior direito do Plateau (x, y)");
		int xPlateau = scanner.nextInt();
		int yPlateau = scanner.nextInt();
		MarsGround plateau = new Plateau(new Cartesian(xPlateau, yPlateau));
		
		System.out.println("Forneça as coordenadas da localização atual do rover (x, y) e a direção para a qual ele está virado");
		int xRover = scanner.nextInt();
		int yRover = scanner.nextInt();
		String direction = scanner.next();
		Rover rover = new Rover(plateau, new Cartesian(xRover, yRover), Direction.valueOf(direction.toUpperCase()));
		
		System.out.println("Forneça a sequência de comandos (M - mover para frente, R - virar a direita, L - virar para a esquerda");
		String command = scanner.next();
		
		
		rover.runCommand(command);
		System.out.println(rover.coordinatesToString());
		
		

	}

}
