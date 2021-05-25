package ue5;

import java.util.Arrays;

public class Album {
	
	private final Song[] songs;
	private final String title;
	
	public Album(final String title, final int amount) {
		this.title = title;
		songs = new Song[amount];
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getSongCount() {
		// Since we can't remove songs from anywhere
		// and only add them to the end,
		// the first null song indicates the actual amount of songs.
		
		for (int i = 0; i < songs.length; i++) {
			if (songs[i] == null) return i;
		}
		return songs.length;
	}
	
	public void addSong(Song s) {
		songs[getSongCount()] = s;
	}
	
	public Song[] getSongs() {
		return songs;
	}
	
	public int getAlbumDuration() {
		int duration = 0;
		
		for (int i = 0; i < getSongCount(); i++) {
			duration += songs[i].getDuration();
		}
		
		return duration;
	}
	
	public void printSongs() {
		for (int i = 0; i < songs.length; i++) {
			if (songs[i] == null) System.out.printf("%d. <empty>\n", i);
			else System.out.printf("%d. %s\n", i, songs[i].toString());
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s (%d s)", title, getAlbumDuration());
	}
}
