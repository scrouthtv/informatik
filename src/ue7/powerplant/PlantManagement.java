package ue7.powerplant;

import java.util.ArrayList;
import java.util.List;

public class PlantManagement {
	
	public int load(final Train[] trains, final double maxWeight,
			double currentWeight) {
		int i = 0;
		while (currentWeight + trains[i].getWeight() < maxWeight) {
			System.out.println("Unloaded Train " + trains[i].getNumber());
			currentWeight += trains[i].getWeight();
			i++;
		}
		
		if (i == 0) return -1;
		return trains[i-1].getNumber();
	}
	
	public List<Train> select(Train[] trains) {
		List<Train> selected = new ArrayList<>();
		
		while (selected.size() < 3) {
			int best = 0;
			Train bestTrain = null;
			
			for (Train t : trains) {
				if (selected.contains(t)) continue;
				if (t.getWeight() * t.getQuality() > best) bestTrain = t;
			}
			
			selected.add(bestTrain);
		}
		
		return selected;
	}
	
}
