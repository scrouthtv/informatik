package ue5;

import java.util.Map;

public enum LangVowelTable {
	GERMAN(vowelMap(0.056, 0.1611, 0.0905, 0.0232, 0.037)),
	ENGLISH(vowelMap(0.0817, 0.1270, 0.07, 0.0751, 0.0276));
	
	private final Map<Character, Double> occurrences;
	
	LangVowelTable(final Map<Character, Double> occurrences) {
		this.occurrences = occurrences;
	}
	
	private static Map<Character, Double> vowelMap(double a, double e, double i, double o, double u) {
		return Map.of('a', a, 'e', e, 'i', i, 'o', o, 'u', u);
	}
	
	/**
	 * Calculates the difference in occurrences for every vowel that is explicitly listed
	 * in this table.
	 * @return the sum of these differences
	 */
	public double diff(Map<Character, Double> real) {
		double diff = 0;
		
		for (Character c : occurrences.keySet())
			if (real.containsKey(c))
				diff += Math.abs(real.get(c) - occurrences.get(c));
			else
				diff += occurrences.get(c);
		
		return diff;
	}
	
	/**
	 * Calculates the diff between all known tables and the real distribution.
	 * @return the table that has the least difference.
	 */
	public static LangVowelTable closest(Map<Character, Double> real) {
		LangVowelTable closest = null;
		double min = 0;
		
		for (LangVowelTable lvt : values()) {
			if (closest == null) {
				closest = lvt;
				min = lvt.diff(real);
			} else if (lvt.diff(real) < min) {
				closest = lvt;
				min = lvt.diff(real);
			}
		}
		
		return closest;
	}
}
