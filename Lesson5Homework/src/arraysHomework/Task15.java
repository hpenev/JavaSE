package arraysHomework;

import java.util.Arrays;

public class Task15 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter array length: ");
		// int arrayLength = sc.nextInt();
		//
		// double[] array = new double[arrayLength];
		// for (int i = 0; i < arrayLength; i++) {
		// System.out.print("Enter a number: ");
		// array[i] = sc.nextInt();
		// }
		// sc.close();

		double[] array = { 7.13, 0.2, 4.9, 5.1, 6.34, 1.12 };

		double[] maxNumbers = new double[3];

		for (int i = 0; i < array.length; i++) {

			// implement bubbleSort
			double temp = 0;
			for (int j = 0; j < maxNumbers.length; j++) {
				for (int k = 1; k < maxNumbers.length - j; k++) {
					if (Math.abs(maxNumbers[k - 1]) > Math.abs(maxNumbers[k])) {
						temp = maxNumbers[k - 1];
						maxNumbers[k - 1] = maxNumbers[k];
						maxNumbers[k] = temp;
					}
				}
			}

			if (Math.abs(array[i]) > Math.abs(maxNumbers[0])) {
				maxNumbers[0] = array[i];
			}
		}

		System.out.println(Arrays.toString(maxNumbers));

	}
}
