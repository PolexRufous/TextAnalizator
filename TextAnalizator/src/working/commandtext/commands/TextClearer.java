package working.commandtext.commands;

import entities.Text;
import helpers.Messanger;
import working.commandtext.TextCommandExecutor;

public class TextClearer implements TextCommandExecutor {

	@Override
	public void execute(Text text) {
		text = null;
		Messanger.printOperationCompleteMessage();
	}

}
