package ue3;

import ue2.MathematicalFunction;

public class Main {
	
	public static void main(String[] args) {
		final int n = 20;
		
		long start = System.currentTimeMillis();
		long ans = Faculty.rec_fac(n);
		long elapsed = System.currentTimeMillis() - start;
		System.out.printf("%d! = %d (%d ms)\n", n, ans, elapsed);
		
		start = System.currentTimeMillis();
		ans = Faculty.it_fac(n);
		elapsed = System.currentTimeMillis() - start;
		System.out.printf("Iterative: %d (%d ms)\n", ans, elapsed);
		
		start = System.currentTimeMillis();
		double sin_ans = SineCalculator.sin(Math.PI, 10);
		elapsed = System.currentTimeMillis() - start;
		System.out.printf("sin(pi) = %f (%d ms)\n", sin_ans, elapsed);
		
		start = System.currentTimeMillis();
		sin_ans = SineCalculator.badSin(Math.PI, 10);
		elapsed = System.currentTimeMillis() - start;
		System.out.printf("bad sin(pi) = %f (%d ms)\n", sin_ans, elapsed);
		
		System.out.println("Required precision for sin(pi) <= e-3: "
				  + howPreciseIsPrecise());
		
		MathematicalFunction exp = new MathematicalFunction() {
			@Override
			public double value(final double x) {
				return Math.exp(x);
			}
			
			@Override
			public double deriv(final double x) {
				return Math.exp(x);
			}
		};
		
		Integral i = new Integral(exp);
		
		System.out.println("Area under exp(x) between a = -1 and b = 1: " +
				  i.integrate(-1, 1));
		
		final double realIntegral = Math.E - 1/Math.E;
		System.out.println("Analytically: " + realIntegral);
	}
	
	/**
	 * Increases the prec parameter to the sine calculation
	 * until sin(pi) <= e-3. Returns this required precision
	 * for sin to be "precise".
	 */
	public static int howPreciseIsPrecise() {
		double ans;
		int prec = 0;
		do {
			prec++;
			ans = SineCalculator.sin(Math.PI, prec);
		} while (Math.abs(ans) > 1e-3);
		
		return prec;
	}
	
}
