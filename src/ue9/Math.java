package ue9;

public class Math {
	
	/**
	 * Calculates x! for 0 <= x <= 10.
	 * Special cases:
	 *  - 0! = 1
	 *  - for x < 0, null is returned
	 *  - for x > 10, null is returned
	 * @return the faculty if x is valid.
	 */
	public static Integer faculty(final int x) {
		Integer ans = null;
		
		if (x < 0 || x > 10) return ans;
		else ans = 1;
		
		for (int i = x; i > 0; i--)
			ans *= i;
		
		return ans;
	}
	
	/**
	 * Tests whether a positive integer n is a prime number.
	 * Takes O(n) time.
	 */
	public static boolean isPrime(final int x) {
		if (x < 2) return false;
		
		for (int i = 2; i < x; i++) {
			if (x % i == 0) return false;
		}
		
		return true;
	}
	
}
