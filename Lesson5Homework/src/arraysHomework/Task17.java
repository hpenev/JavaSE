package arraysHomework;

import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {

		// int[] array = { 1, 3, 2, 4, 3, 7 };
		Scanner sc = new Scanner(System.in);
		int arrayLength = 0;
		do {
			System.out.print("Enter array length: ");
			arrayLength = sc.nextInt();
		} while (arrayLength <= 0);

		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = sc.nextInt();
		}
		sc.close();

		boolean isZigZag = true;

		for (int i = 1; i < array.length - 1; i++) {
			int previousValue = array[i - 1];
			int currentValue = array[i];
			int nextValue = array[i + 1];

			if (i % 2 != 0) {
				if (previousValue > currentValue || currentValue < nextValue) {
					isZigZag = false;
					break;
				}
			}

			if (i % 2 == 0) {
				if (previousValue < currentValue || currentValue > nextValue) {
					isZigZag = false;
					break;
				}
			}
		}

		System.out.println(isZigZag ? "Meets the requirements for a zigzag up series"
				: "Do not meets the requirements for a zigzag up series");

	}
}
