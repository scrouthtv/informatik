package ue2;

public interface MathematicalFunction {
	/**
	 * Calculates the value of this function at the specified position.
	 */
	double value(double x);
	
	/**
	 * Calculates the value of this function's derivative at the specified position.
	 */
	double deriv(double x);
}
