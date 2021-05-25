package ue4;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class ArraySplitter {
	
	/**
	 * Returns an ArrayList of all elements in the provided list that returns true when used
	 * with the specified consumer.
	 */
	public static <T> ArrayList<T> splitAsList(final ArrayList<T> list, final Predicate<T> p) {
		ArrayList<T> split = new ArrayList<>();
		for (T t : list) if (p.test(t)) split.add(t);
		return split;
	}
	
	/**
	 * Same same but different.
	 */
	public static <T> ArrayList<T> splitAsList(final T[] list, final Predicate<T> p) {
		ArrayList<T> split = new ArrayList<>();
		for (T t : list) if (p.test(t)) split.add(t);
		return split;
	}
	
	/**
	 * Similar to splitAsList, but returns an array instead.
	 *
	 * The function calls the predicate twice on element and expects the result to be the same.
	 *
	 * @param arrayCreator is used to create the array. It is passed the length of the
	 *                     array that should be created.
	 */
	public static <T> T[] splitAsArray(final ArrayList<T> list, final Predicate<T> p,
			final Function<Integer, T[]> arrayCreator) {
		int n = 0;
		for (T t : list) if (p.test(t)) n++;
		
		T[] arr = arrayCreator.apply(n);
		int i = 0;
		for (T t : list) if (p.test(t)) arr[i++] = t;
		
		return arr;
	}
}
