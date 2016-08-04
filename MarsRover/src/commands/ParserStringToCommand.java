package commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class ParserStringToCommand {
	
	private String commandString;
	private static Map<Character, Command> commandMap = new HashMap<Character, Command>() {{
        put('L', new Left());
        put('R', new Right());
        put('M', new Move());
    }};    

    public ParserStringToCommand(final String commandString) {
        this.commandString = commandString;
    }
    
    public List<Command> getCommands(){
    	List<Command> out = new ArrayList<Command>();
    	commandString = commandString.toUpperCase();
    	
    	for(char charCommand : commandString.toCharArray()){
    		out.add(commandMap.get(charCommand));
    	}    	
    	
    	return out;
    }

}
