package ue5;

public class Student {
	
	private int ID;
	private String name;
	
	public Student(final int ID, final String name) {
		this.ID = ID;
		this.name = name;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(final int ID) {
		this.ID = ID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%d)", name, ID);
	}
}
