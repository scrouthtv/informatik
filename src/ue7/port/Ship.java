package ue7.port;

public class Ship {
	
	private String name;
	private double length, width;
	
	public Ship(final String name, final double length, final double width) {
		this.name = name;
		this.length = length;
		this.width = width;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(final double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(final double width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "Ship: " + name;
	}
}
