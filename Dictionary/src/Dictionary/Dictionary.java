package Dictionary;

import java.util.Map;

public interface Dictionary
{
	public Map <String, Integer> createDictionary(String text) throws DictionaryException;
}
