package working.commandtext.commands;

import entities.Text;
import helpers.Messanger;
import working.commandtext.TextCommandExecutor;

public class TextFromConsoleCreator implements TextCommandExecutor {

	@Override
	public void execute(Text text) {
		// TODO Auto-generated method stub
		Messanger.printMethotIsNotWorkingMessage();
	}

}
