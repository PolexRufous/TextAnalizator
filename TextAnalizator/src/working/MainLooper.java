package working;

import java.io.IOException;

import entities.Text;
import helpers.Messanger;
import helpers.ReadWriteHelper;
import working.commandtext.TextCommandDispatcher;
import working.commandtext.TextCommands;

public class MainLooper {

	private Text text;
	
	public void startLoop(){
		Messanger.printHelloMessage();
		while (true){
			Messanger.printChooseCommandMessage();
			TextCommands command = getCommand();
			if (command == TextCommands.EXIT){
				break;
			}
			else{
				TextCommandDispatcher.dispatch(command, text);
			}
		}
		Messanger.printByeMessage();
	}
	
	private TextCommands getCommand(){
		int com;
		TextCommands command = null;
		try{
			com = ReadWriteHelper.readInt();
			command = TextCommands.getCommand(com);
		}
		catch (IOException e){
			Messanger.printExceptionMessage(e);
		}
		return command;
	}
}