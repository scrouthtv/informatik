package ue7.port;

import java.util.ArrayList;
import java.util.List;

public class Containership extends Ship {
	
	private List<Container> freight;
	private double maxLoadWeight;
	
	public Containership(final String name, final double length,
			final double width, final double maxLoadWeight) {
		super(name, length, width);
		
		freight = new ArrayList<>();
		this.maxLoadWeight = maxLoadWeight;
	}
	
	public double getFreightWeight() {
		double weight = 0;
		for (Container c : freight) weight += c.getWeight();
		return weight;
	}
	
	public double getRemainingWeight() {
		return maxLoadWeight - getFreightWeight();
	}
	
	public void loadContainer(Container c) {
		freight.add(c);
	}
	
	public void listFreight() {
		System.out.println(super.toString());
		for (int i = 0; i < freight.size(); i++)
			System.out.printf("%d. %s\n", i, freight.get(i));
		System.out.println("----------------------");
		System.out.printf("Total: %f\n", getFreightWeight());
	}
	
}
