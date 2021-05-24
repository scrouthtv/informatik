package ue4;

public class Zahlenarray {
	
	public static int[] randomArray(final int length) {
		int[] a = new int[length];
		
		for (int i = 0; i < length; i++)
			a[i] = (int) (Math.random() * 100);
		
		return a;
	}
	
	/**
	 * Searches the needle (an int) in the haystack (a list of ints).
	 * If the element is not in the list, -1 is returned.
	 * If it is in the list, the amount of comparisons, that were required
	 * to find the element, is returned.
	 */
	public static int contains(int[] hay, int needle) {
		int comparisons = 0;
		
		for (int i = 0; i < hay.length; i++) {
			comparisons++;
			if (needle == hay[i]) return comparisons;
		}
		
		return -1;
	}
	
	/**
	 * Pretty-prints the specified array of numbers.
	 */
	public static void print(int[] a) {
		System.out.print("[ ");
		
		for (int i = 0; i < a.length; i++) {
			if (i > 0) System.out.print(", ");
			System.out.print(a[i]);
		}
		
		System.out.println(" ]");
	}
	
}
