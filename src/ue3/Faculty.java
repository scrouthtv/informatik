package ue3;

public class Faculty {
	
	/**
	 * Recursively calculates the faculty of an integer n.
	 * Special cases:
	 *  0! = 1
	 *  x! = -1 for x < 0
	 */
	public static long rec_fac(final int n) {
		if (n < 0) return -1;
		if (n == 0) return 1;
		return n * rec_fac(n - 1);
	}
	
	/**
	 * Iteratively calculates the faculty of an integer n,
	 * for performance comparison.
	 * Note that calculating any value larger than 20!
	 * will overflow the long return type.
	 *
	 * @throws RuntimeException
	 */
	public static long it_fac(final int n) {
		if (n < 0) return -1;
		
		long answer = 1;
		for (int i = 1; i <= n; i++) {
			answer *= i;
		}
		
		return answer;
	}
}
