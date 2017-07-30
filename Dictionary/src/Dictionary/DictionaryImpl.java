package Dictionary;

import java.util.Map;
import java.util.HashMap;

import Dictionary.DictionaryException;
import Dictionary.Dictionary;

public class DictionaryImpl implements Dictionary
{
	private int ASCII_a = 97;
	private int ASCII_A = 65;
	private int ASCII_z = 122;
	private int ASCII_Z = 90;
	private int ASCII_space = 32;
	
	private String error_1 = "Text cannot be null!";
	private String error_2 = "Text must be only letters!";
	
	@Override
	public Map<String, Integer> createDictionary(String text) throws DictionaryException
	{
		checkText(text);
		text=text.toLowerCase();
		String[] wordsArray = text.split(" ");
		Map<String, Integer> dictionarylist = new HashMap<String, Integer>();
		
		for(String word : wordsArray)
		{
			if(dictionarylist.containsKey(word))
			{
				dictionarylist.put(word, dictionarylist.get(word)+1);
			}
			else
			{
				dictionarylist.put(word,1);
			}
		}
		
		return dictionarylist;
		
	}
	private void checkText(String text) throws DictionaryException
	{
		if(text==null)
		{
			throw new DictionaryException(error_1);
		}
		for(char sign : text.toCharArray())
		{
			if(!((sign!=ASCII_space&&sign>=ASCII_a&&sign<=ASCII_z)||((sign>=ASCII_A&&sign<=ASCII_Z))))
			{	
				throw new DictionaryException(error_2);
			}	
		}
	}
}
