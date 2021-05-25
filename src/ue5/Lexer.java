package ue5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Isn't actually a lexer ☜(ﾟヮﾟ☜).
 */
public class Lexer {
	
	public static final Predicate<Character> onlyLatinLetters = c -> c >= 'a' && c <= 'z';
	
	/**
	 * Maps every unique character in a string to the percentage of that character in the string.
	 * @param validLetters Specifies which characters should be counted.
	 */
	public static Map<Character, Double> charOccurrences(final String s, final Predicate<Character> validLetters) {
		Map<Character, Double> percentages = new HashMap<>();
		
		int validLength = 0;
		
		// First, analyze all letters:
		for (char c : s.toCharArray()) {
			if (validLetters.test(c)) {
				validLength++;
				if (percentages.containsKey(c)) percentages.put(c, percentages.get(c) + 1.0);
				else percentages.put(c, 1.0);
			}
		}
		
		// Then, calculate the relative percentages:
		for (Map.Entry<Character, Double> c : percentages.entrySet())
			percentages.put(c.getKey(), c.getValue() / validLength);
		
		return percentages;
	}
	
	
}
