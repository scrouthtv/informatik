package ue7.port;

public class Container {
	
	private String code;
	private double weight;
	
	public Container(final String code, final double weight) {
		this.code = code;
		this.weight = weight;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(final String code) {
		this.code = code;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(final double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return code + " " + weight;
	}
}
