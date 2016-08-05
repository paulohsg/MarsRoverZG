import java.util.ArrayList;
import java.util.List;
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
		List<Rover> rovers = new ArrayList<Rover>();
		Scanner scanner = new Scanner(System.in);
		int xRover = 0;
		Rover rover;
		String command = "";
		/*
		MarsGround plateau = new Plateau(new Cartesian(5, 5));
		Rover rover = new Rover(plateau, new Cartesian(3, 3), Direction.E);
		
		rover.runCommand("MMRMMRMRRM");
		System.out.println(rover.coordinatesToString());
		*/
		
		
		int xPlateau = scanner.nextInt();
		int yPlateau = scanner.nextInt();
		MarsGround plateau = new Plateau(new Cartesian(xPlateau, yPlateau));
		
		while(true){
			try{
				
				xRover = scanner.nextInt();
				
				if(xRover == -1) break;
				
				int yRover = scanner.nextInt();
				String direction = scanner.next();
				rover = new Rover(plateau, new Cartesian(xRover, yRover), Direction.valueOf(direction.toUpperCase()));
				
				if(!rover.validateRoverCartesianCoordinates(xRover, yRover)){
					System.out.println("Forneça as coordenadas corretas\n");
					continue;
				}
				
				
				while(true){
					command = scanner.next();
					
					if(rover.validateCommand(command)){
						rover.runCommand(command);
						rovers.add(rover);
						break;
					}else{
						System.out.println("O comando inserido é inválido. Insira outra sequencia de comandos");
					}
				}
				
				System.out.println("Exibir localização dos rovers?\n"
						+"s - exibe as coordenadas de todos os rovers adicionados e finaliza o programa;\n"
						+"n - inserir novo rover.");
				String yesOrNo = scanner.next();
				if(yesOrNo.equalsIgnoreCase("s")){
					break;
				}
				
				
				
			}catch(Exception ex){
				System.out.println("Forneça as coordenadas corretas\n");
			}		
		}
		
		if(rovers.isEmpty()){
			System.out.println("Aplicação encerrada");
			System.exit(0);
		}else{
			for(Rover r : rovers){
				System.out.println(r.coordinatesToString());
			}
		}
	}
}
