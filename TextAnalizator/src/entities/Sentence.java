package entities;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
	
	private List<SentencePart> partList;
	
	public Sentence()
	{
		this.partList = new ArrayList<>();
	}
	
	@Override
	public String toString()
	{
		//TODO need to do it
		StringBuilder result = new StringBuilder("");
		
		for(SentencePart each : partList)
		{
			result.append(each.toString());
		}
		
		return result.toString();
	}
	
}
