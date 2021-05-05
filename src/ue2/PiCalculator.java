package ue2;

public class PiCalculator {
	/**
	 * Calculates PI using Bailey-Borwein-Plouffe's formula.
	 * @param prec how many iteration steps should be done.
	 */
	public static double calculatePI(final int prec) {
		double pi = 0;
		double inner, divisor = 1;
		
		for (int i = 0; i < prec; i++) {
			inner = 4.0/(8.0*i + 1) - 2.0/(8.0*i + 4) - 1.0/(8.0*i + 5) - 1.0/(8.0*i + 6);
			
			pi += inner / divisor;
			
			divisor *= 16; // stop wasting calc time on pow
		}
		
		return pi;
	}
}
