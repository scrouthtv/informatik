package ue6.album;

import ue5.Song;

public interface SongPrinter {
	
	/**
	 * Implements a formatting scheme for printing a song.
	 * @param s might be null
	 */
	String print(final Song s);
	
}
