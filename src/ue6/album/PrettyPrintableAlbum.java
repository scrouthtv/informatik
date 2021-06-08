package ue6.album;

import ue5.Album;
import ue5.Song;

public class PrettyPrintableAlbum extends Album {
	
	public PrettyPrintableAlbum(final String title, final int amount) {
		super(title, amount);
	}
	
	public void printSongs(final SongPrinter p) {
		final Song[] songs = getSongs();
		for (int i = 0; i < songs.length; i++) {
			System.out.printf("%d.", i);
			System.out.println(p.print(songs[i]));
		}
	}
	
}
