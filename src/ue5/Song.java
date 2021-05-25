package ue5;

public class Song {
	
	private String artist, title;
	private int duration; // in full seconds
	
	public Song(final String artist, final String title, final int duration) {
		this.artist = artist;
		this.title = title;
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s (%d s)", artist, title, duration);
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(final String artist) {
		this.artist = artist;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(final String title) {
		this.title = title;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(final int duration) {
		this.duration = duration;
	}
}
