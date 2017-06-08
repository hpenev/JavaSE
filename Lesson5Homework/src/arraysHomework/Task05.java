package arraysHomework;

public class Task05 {
	public static void main(String[] args) {

		// declare array and initialize with default values
		int[] array = new int[10];

		// Assign new values to array
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 3;
		}

		// print array
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		System.out.println("]");
	}
}
