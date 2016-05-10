package entities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import helpers.ReadWriteHelper;

public class Text {

	private Text(){}
	
	private List<Sentence> sentenseList;
	private String text;
	
	/**
	 * Method returns instance of Text class with parsed sentences
	 * @param file - existed .txt file
	 * @return instance of Text class <br/>
	 * null if file doesn't exist or is non .txt type
	 * @throws IOException if file cann't be read
	 */
	public static Text getTextFromFile(File file) throws IOException
	{
		if (!file.exists()){
			return null;
		}
		
		if (!file.getName().endsWith(".txt")){
			return null;
		}
		
		String text = null;
		
		ReadWriteHelper.setIn(new FileInputStream(file));
		text = ReadWriteHelper.readAllLines();
		ReadWriteHelper.setIn(System.in);
		
		Text result = new Text();
		result.parseSentences(text);		
		
		return result;
	}
	
	/**
	 * Method returns instance of Text class with parsed sentences
	 * @param finputStream - stream for reading
	 * @return instance of Text class
	 * @throws IOException if stream cann't be read
	 */
	public static Text getTextFromStream(InputStream inputStream) throws IOException
	{
		String text = null;
		
		ReadWriteHelper.setIn(inputStream);
		text = ReadWriteHelper.readAllLines();
		ReadWriteHelper.setIn(System.in);
		
		Text result = new Text();
		result.parseSentences(text);		
				
		return result;
	}
	
	private void parseSentences(String text)
	{
		this.text = text;
	}
	
	public String getText()
	{
		return text;
	}
}
