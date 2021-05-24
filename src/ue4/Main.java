package ue4;

public class Main {
	public static void main(String[] args) {
		final int[] array = Zahlenarray.randomArray(1000);
		Zahlenarray.print(array);
		System.out.println(Zahlenarray.contains(array, 42));
		System.out.println(Zahlenarray.contains(array, 100)); // should always be -1
	}
}
