package ue5;

import java.util.Locale;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		final String hello = "Helloö";
		
		Map<Character, Double> helloPercentages = Lexer.charOccurrences(hello.toLowerCase(Locale.ROOT),
				Lexer.onlyLatinLetters);
		printPercentages(helloPercentages);
		// Should be: e (20%), h (20%), l (40%), o (20%)
		
		final String germanText = "Das ist ein deutscher Text zum Testen der Analyse relativer Häufigkeiten in Wörtern";
		final String englishText = "This is an english text instead, which I also want to use to test the analysis of vowel occurrences in words." +
				"Since the analysis was wrong, I'll add some words at the end of the text to come closer to the should-be table. Let's try again." +
				"This is really weird. It should work, as I'm adding english words at the end, but maybe this concept needs longer and more complex words.";
		
		final Map<Character, Double> germanTextOccurrences = Lexer.charOccurrences(germanText.toLowerCase(Locale.ROOT),
				Lexer.onlyLatinLetters);
		final Map<Character, Double> englishTextOccurrences = Lexer.charOccurrences(englishText.toLowerCase(Locale.ROOT),
				Lexer.onlyLatinLetters);
		
		printPercentages(germanTextOccurrences);
		printPercentages(englishTextOccurrences);
		
		System.out.println("The german text is likely " + LangVowelTable.closest(germanTextOccurrences));
		System.out.println("The english text is likely " + LangVowelTable.closest(englishTextOccurrences));
	}
	
	public static void printPercentages(Map<Character, Double> map) {
		System.out.println("[");
		
		for (Map.Entry<Character, Double> percentage : map.entrySet())
			System.out.printf("\t%c => %.2f %%,\n", percentage.getKey(), percentage.getValue() * 100);
		
		System.out.println("]");
	}
	
}
