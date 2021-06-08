package ue6.album;

import ue5.Song;

public class Main {
	
	public static void main(String[] args) {
		
		PrettyPrintableAlbum a = new PrettyPrintableAlbum("Fear of a Blank Planet", 6);
		a.addSong(new Song("Porcupine Tree", "Fear of a Blank Planet", 451));
		a.addSong(new Song("Porcupine Tree", "My Ashes", 307));
		a.addSong(new Song("Porcupine Tree, Alex Lifeson", "Anesthetize", 1062));
		
		a.printSongs(new SimplePrinter());
		a.printSongs(new TablePrinter());
		
	}
	
}