package entities;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import helpers.ReadWriteHelper;

public class Text {
	
	private List<Sentence> sentenseList;
	
	private Text(){
		this.sentenseList = new ArrayList<Sentence>();
	}
	
	
	/**
	 * Method returns instance of Text class with parsed sentences
	 * @param finputStream - stream for reading
	 * @return instance of Text class
	 * @throws IOException if stream cann't be read
	 */
	public static Text getTextFromStream(InputStream inputStream) throws IOException{
		String text = null;		
		ReadWriteHelper.setIn(inputStream);
		text = ReadWriteHelper.readAllLines();
		ReadWriteHelper.setIn(System.in);
		Text result = new Text();
		result.parseSentences(text);		
		return result;
	}
	
	public static Text parseText(String text){
		Text result = new Text();
		result.parseSentences(text);
		return result;
	}
	
	private void parseSentences(String text)
	{
		//TODO need to realize how to do this
	}
	
	public String getAllText(){
		StringBuilder result = new StringBuilder("");
		for(Sentence each : sentenseList){
			result.append(each.toString());
		}
		return result.toString();
	}
}
