package ue6.album;

import ue5.Song;

/**
 * Simple view prints a song in the form
 * Artist: '<artist>' - Titel: '<title>'
 */
public class SimplePrinter implements SongPrinter {
	
	public String print(final Song s) {
		if (s == null) return "<none>";
		return String.format("Artist: '%s' - Titel: '%s'",
				s.getArtist(), s.getTitle());
	}
}
