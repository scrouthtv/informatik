package ue2;

public class ZeroFinder {
	
	/**
	 * Approximates the first zero of a mathematical function f using Newton.
	 *
	 * @param precision how close the zero should be approximated.
	 */
	public static double findZero(MathematicalFunction f, double x0, final double precision) {
		double xval = x0, yval;
		
		do {
			yval = f.value(xval);
			xval -= yval / f.deriv(xval); // xn+1 = xn - f(xn)/f'(xn)
			
		} while (Math.abs(yval) >= precision);
		
		return xval;
	}
}
