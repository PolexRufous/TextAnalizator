package working.commandtext;

import java.util.HashMap;
import java.util.Map;

import entities.Text;
import helpers.Messanger;
import working.commandtext.commands.TextClearer;
import working.commandtext.commands.TextFromConsoleCreator;
import working.commandtext.commands.TextFromFileCreator;

public class TextCommandDispatcher {

	private static Map<TextCommands, TextCommandExecutor> commandsMap;
	static
	{
		commandsMap = new HashMap<TextCommands, TextCommandExecutor>();
		commandsMap.put(TextCommands.CREATE_WITH_CONSOLE, new TextFromConsoleCreator());
		commandsMap.put(TextCommands.CREATE_WITH_FILE, new TextFromFileCreator());
		commandsMap.put(TextCommands.CLEAR, new TextClearer());
	}
	
	private TextCommandDispatcher()	{}
	
	public static void dispatch(TextCommands command, Text text)
	{
		TextCommandExecutor textCommandExecutor = commandsMap.get(command);
		if (textCommandExecutor == null)
		{
			Messanger.printWrongCommandMessage();
		}
		else
		{
			textCommandExecutor.execute(text);
		}
	}
	
	
}
