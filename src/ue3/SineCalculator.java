package ue3;

public class SineCalculator {
	
	public static double sin(final double x, final int prec) {
		double ans = 0;
		final double twox = x * x;
		
		int sgn = 1;
		double numerator = x;
		double denominator = 1;
		
		for (int i = 0; i < prec; i++) {
			ans += sgn * numerator / denominator;
			
			sgn *= -1;
			numerator *= twox;
			denominator *= (2 * i + 2) * (2 * i + 3);
		}
		
		return ans;
	}
	
	public static double badSin(final double x, final int prec) {
		double ans = 0;
		
		for (int i = 0; i < prec; i++) {
			ans += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / ((double) Faculty.it_fac(2 * i + 1));
		}
		return ans;
	}
	
}
