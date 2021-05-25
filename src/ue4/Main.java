package ue4;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
	
	public static final Predicate<Integer> evenPredicate = i -> (i % 2) == 0;
	public static final Predicate<Integer> oddPredicate = i -> (i % 2) == 1;
	
	public static final Function<Integer, Integer[]> intArrayCreator = n -> new Integer[n];
	
	public static void main(String[] args) {
		final int[] array = Zahlenarray.randomArray(1000);
		Zahlenarray.print(array);
		System.out.println(Zahlenarray.contains(array, 42));
		System.out.println(Zahlenarray.contains(array, 100)); // should always be -1
		
		final int[] sorted = Zahlenarray.bubblesort(array);
		Zahlenarray.print(sorted);
		System.out.println(Zahlenarray.isSorted(sorted));
		
		System.out.println(searchAll(sorted));
		
		// ---- 3 ----
		
		ArrayList<Integer> evenOdd = new ArrayList<Integer>();
		for (int i = -2; i < 9; i++) evenOdd.add(i);
		Zahlenarray.print(evenOdd);
		
		System.out.println("split as list: ");
		Zahlenarray.print(ArraySplitter.splitAsList(evenOdd, evenPredicate));
		
		System.out.println("split as array: ");
		final Integer[] oddOnly = ArraySplitter.splitAsArray(evenOdd, oddPredicate, intArrayCreator);
		Zahlenarray.print(oddOnly);
	}
	
	/**
	 * Searches all elements in the specified array using binary search.
	 * Returns the first element that could (wrongfully) not be found.
	 * Or -1 if all elements were successfully found.
	 *
	 * Used for testing.
	 */
	private static int searchAll(final int[] array) {
		for (int i = 0; i < array.length; i++)
			if (Zahlenarray.binarySearch(array, array[i]) < 0) return i;
			
		return -1;
	}
}
