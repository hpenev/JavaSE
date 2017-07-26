package arraysHomework;

import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arrayLength = 0;
		do {
			System.out.print("Enter array length: ");
			arrayLength = sc.nextInt();
		} while (arrayLength <= 0);

		int[] array = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			System.out.print("Enter a number: ");
			array[i] = sc.nextInt();
		}
		sc.close();

		// int[] array = new int[] { 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4,
		// 4, 4, 5, 5, 5, 5, 5, 5, 5, 5 };

		int endCell = 0;
		int numEqualCells = 1;
		int maxEqualCells = 0;

		for (int i = 0; i < array.length - 1; i++) {
			// check if current and next element are equals
			if (array[i] == array[i + 1]) {
				numEqualCells++;
				// check for last element
				if (i == (array.length - 2)) {
					if (numEqualCells > maxEqualCells) {
						maxEqualCells = numEqualCells;
						endCell = i + 1;
					}
				}
			}
			// if different check max equals elements
			if (array[i] != array[i + 1]) {
				if (numEqualCells > maxEqualCells) {
					maxEqualCells = numEqualCells;
					endCell = i;
				}
				numEqualCells = 1;
			}

		}

		// printing max sequence of equal elements
		System.out.println(maxEqualCells + " times");

		for (int i = endCell - maxEqualCells + 1; i <= endCell; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
