package ue7.powerplant;

public class Train {
	private int number;
	private double weight, quality;
	
	public Train(int number, double weight, double quality) {
		this.number = number;
		this.weight = weight;
		this.quality = quality;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getQuality() {
		return quality;
	}
}
