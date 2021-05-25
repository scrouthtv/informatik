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
		
		System.out.println(" --- ");
		
		Student s = new Student(123456, "Thomas");
		s.setID(654321);
		s.setName("Martin");
		System.out.println(s);
		
		System.out.println(" --- ");
		
		Album a = new Album("Fear of a Blank Planet", 6);
		a.addSong(new Song("Porcupine Tree", "Fear of a Blank Planet", 451));
		a.addSong(new Song("Porcupine Tree", "My Ashes", 307));
		a.addSong(new Song("Porcupine Tree, Alex Lifeson", "Anesthetize", 1062));
		System.out.println(a);
		a.printSongs();
		
		System.out.println(" --- ");
		
		VectorNd v1 = new VectorNd(3, 2.7, 19);
		System.out.println(v1);
		v1.normalize();
		System.out.println(v1);
		
		VectorNd v2 = new VectorNd(8, -2);
		v1.add(v2);
		System.out.println(v1); // should be unchanged
		
		VectorNd v3 = new VectorNd(8, 3, -5.3);
		v1.add(v3);
		System.out.println(v1);
	}
	
	public static void printPercentages(Map<Character, Double> map) {
		System.out.println("[");
		
		for (Map.Entry<Character, Double> percentage : map.entrySet())
			System.out.printf("\t%c => %.2f %%,\n", percentage.getKey(), percentage.getValue() * 100);
		
		System.out.println("]");
	}
	
}
