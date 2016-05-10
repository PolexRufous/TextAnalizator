package runners;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import entities.Text;
import helpers.ReadWriteHelper;
import working.MainLooper;

public class Runner {

	public static void main(String[] args) throws IOException{

//		StringBuilder stringBuilder = new StringBuilder("");
//		
//		String current = null;
//		while(!(current = ReadWriteHelper.readLine()).equals(""))
//		{
//			stringBuilder.append(current);
//			stringBuilder.append("\n");
//		}
//		
//		Text text = Text.getTextFromStream(new ByteArrayInputStream(stringBuilder.toString().getBytes()));
//		System.out.println(text.getText());
		
		new MainLooper().startLoop();
	
	}

}
