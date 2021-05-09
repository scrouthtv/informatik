package ue3;

import ue2.MathematicalFunction;

public class Integral {
	/**
	 * Determines the number of equally-sized rectangles
	 * the function should be split into.
	 */
	public static final int PRECISION = 100;
	
	private final MathematicalFunction f;
	
	public Integral(MathematicalFunction f) {
		this.f = f;
	}
	
	public double integrate(final double a, final double b) {
		final double dx = stepSize(a, b); // calculate the size of a rectangle
		
		double ans = 0; // initialize the integral with 0
		double x = a;
		
		for (int i = 0; i < PRECISION; i++) {
			ans += f.value(x) * dx;
			x += dx;
		}
		
		return ans;
	}
	
	private static double stepSize(final double a, final double b) {
		return (b-a) / PRECISION;
	}
}
