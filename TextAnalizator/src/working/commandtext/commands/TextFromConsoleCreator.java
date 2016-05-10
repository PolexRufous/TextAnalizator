package working.commandtext.commands;

import java.io.IOException;

import entities.Text;
import helpers.Messanger;
import helpers.ReadWriteHelper;
import working.commandtext.TextCommandExecutor;

public class TextFromConsoleCreator implements TextCommandExecutor {

	@Override
	public void execute(Text text) {
		
		Messanger.printWriteTextToConcoleMessage();
		
		StringBuilder stringBuilder = new StringBuilder("");
		
		String current = null;
		try
		{
			while(!(current = ReadWriteHelper.readLine()).equals(""))
			{
				stringBuilder.append(current);
			}
		
			text = Text.parseText(stringBuilder.toString());
			
			Messanger.printOperationCompleteMessage();
		}
		catch (IOException e)
		{
			Messanger.printExceptionMessage(e);
		}
	}

}
