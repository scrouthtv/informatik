package ue4;

import java.util.ArrayList;

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
	public static int contains(final int[] hay, final int needle) {
		int comparisons = 0;
		
		for (int i = 0; i < hay.length; i++) {
			comparisons++;
			if (needle == hay[i]) return comparisons;
		}
		
		return -1;
	}
	
	public static int[] bubblesort(int[] array) {
		boolean dirty = false;
		int tmp;
		
		do {
			dirty = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i+1]) {
					// swap:
					tmp = array[i+1];
					array[i+1] = array[i];
					array[i] = tmp;
					dirty = true;
				}
			}
		} while (dirty);
		
		return array;
	}
	
	public static boolean isSorted(final int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i+1]) return false;
		}
		return true;
	}
	
	/**
	 * Uses binary search top find a needle faster.
	 * @return The amount of comparisons, if the needle was found.
	 * If the array isn't sorted, binary search is not supported and -2 is returned.
	 * If the element couldn't be found, -1 is returned.
	 */
	public static int binarySearch(final int[] haystack, final int needle) {
		if (!isSorted(haystack)) return -2;
		
		int comparisons = 0;
		
		int lower = 0, upper = haystack.length;
		int pos;
		do {
			pos = lower + (upper - lower) / 2;
		
			comparisons++;
			
			if (haystack[pos] == needle) return comparisons;
			else if (haystack[pos] < needle) lower = pos; // search the upper half
			else upper = pos; // search the lower half
		} while (lower < upper);
		
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
	
	public static void print(final Integer[] a) {
		System.out.print("[ ");
		
		for (int i = 0; i < a.length; i++) {
			if (i > 0) System.out.print(", ");
			System.out.print(a[i]);
		}
		
		System.out.println(" ]");
	}
	
	public static void print(final ArrayList<Integer> a) {
		System.out.print("[ ");
		
		for (int i = 0; i < a.size(); i++) {
			if (i > 0) System.out.print(", ");
			System.out.print(a.get(i));
		}
		
		System.out.println(" ]");
	}
}
