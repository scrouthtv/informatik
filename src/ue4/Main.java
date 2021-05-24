package ue4;

public class Main {
	public static void main(String[] args) {
		final int[] array = Zahlenarray.randomArray(1000);
		Zahlenarray.print(array);
		System.out.println(Zahlenarray.contains(array, 42));
		System.out.println(Zahlenarray.contains(array, 100)); // should always be -1
		
		final int[] sorted = Zahlenarray.bubblesort(array);
		Zahlenarray.print(sorted);
		System.out.println(Zahlenarray.isSorted(sorted));
		
		System.out.println(searchAll(sorted));
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
