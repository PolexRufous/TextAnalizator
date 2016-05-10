package working.commandtext.commands;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import entities.Text;
import helpers.Messanger;
import helpers.ReadWriteHelper;
import working.commandtext.TextCommandExecutor;

public class TextFromFileCreator implements TextCommandExecutor {

	@Override
	public void execute(Text text) {

		Messanger.printEnterFileNameMessage();
		
		String filename;
		
		try
		{
			filename = ReadWriteHelper.readLine();
			File file = new File(filename);
			if (!file.exists() || !file.getName().endsWith(".txt"))
			{
				Messanger.printIncorrectFileNameMessage();
				return;
			}
			
			ReadWriteHelper.setIn(new FileInputStream(file));
			String filetext = ReadWriteHelper.readAllLines();
			ReadWriteHelper.setIn(System.in);
			
			text = Text.parseText(filetext);
			
			Messanger.printOperationCompleteMessage();
			
		}
		catch (IOException e)
		{
			Messanger.printExceptionMessage(e);
		}
	}

}
