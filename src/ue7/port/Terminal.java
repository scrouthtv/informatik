package ue7.port;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Terminal {
	
	private static int currentContainerIdx = 0;
	
	private static final Scanner s = new Scanner(System.in);
	
	/**
	 * @return whether we could load the container
	 */
	public static boolean load(Containership s, Container c) throws ContainerLoadingException {
		if (Math.random() >= 0.8) throw new ContainerLoadingException();
		
		if (s.getRemainingWeight() >= c.getWeight()) {
			s.loadContainer(c);
			return true;
		}
		
		return false;
	}
	
	public static Container createContainer() {
		try {
			final double weight = s.nextDouble();
			return createContainerWithWeight(weight);
		} catch (InputMismatchException ex) {
			System.out.println("Invalid input format.");
			return null;
		} catch (NoSuchElementException ex) {
			System.out.println("Something went wrong.");
			return null;
		}
	}
	
	public static Container createContainerWithWeight(double weight) {
		return new Container("Container" + currentContainerIdx++, weight);
	}
}
