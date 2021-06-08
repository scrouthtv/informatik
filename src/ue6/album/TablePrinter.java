package ue6.album;

import ue5.Song;

/**
 * Table view uses the form
 * <artist>\t<title>
 */
public class TablePrinter implements SongPrinter {
	
	public String print(final Song s) {
		if (s == null) return "<none>";
		return String.format("%s\t%s", s.getArtist(), s.getTitle());
	}
}
