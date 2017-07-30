package Dictionary;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.HashMap;

import Dictionary.DictionaryException;
import Dictionary.DictionaryImpl;
import Dictionary.Dictionary;

public class DictionaryTest
{
	private Dictionary dictionary = new DictionaryImpl();

	@Test(expected = DictionaryException.class)
	public void FailNoPointer() throws DictionaryException
	{
		// given
		String text = null;
		dictionary.createDictionary(text);
		// then
		Assert.fail();
	}
	
	@Test(expected = DictionaryException.class)
	public void FailWrongCharacter() throws DictionaryException
	{
		// given
		String text = "12raz dwa raz dwa raz raz trzy raz cztery raz dwa trzy raz zero";
		// when
		dictionary.createDictionary(text);
		//then
		Assert.fail();
	}
	@Test(expected = DictionaryException.class)
	public void Succeed() throws DictionaryException
	{
		// given
		String text = "raz dwa raz dwa raz raz trzy raz cztery raz dwa trzy raz zero";
		// when
		
		Map<String,Integer> expectedDictionary = new HashMap<String,Integer>();
		expectedDictionary.put("raz", 7);
		expectedDictionary.put("dwa", 3);
		expectedDictionary.put("trzy", 2);
		expectedDictionary.put("cztery", 1);
		expectedDictionary.put("zero", 1);
		
		Map<String,Integer> actualDictionary = dictionary.createDictionary(text);
		// then
		Assert.assertEquals(expectedDictionary, actualDictionary);
	}

}
