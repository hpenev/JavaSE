package arraysHomework;

public class Task16 {
	public static void main(String[] args) {
		double[] array = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4 };

		// print array before Intervention
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		System.out.println("]");

		// check how many items meet the conditions
		for (int i = 0; i < array.length; i++) {
			if (array[i] < -0.231) {
				array[i] = ((i + 1) * (i + 1)) + 41.25;
			} else {
				array[i] = (i + 1) * array[i];
			}
		}

		// print array after Intervention
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
