package arraysHomework;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		// int[] array1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// int[] array2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array1 length: ");
		int array1Length = sc.nextInt();

		while (array1Length <= 0) {
			System.out.print("Enter array1 length: ");
			array1Length = sc.nextInt();
		}

		int[] array1 = new int[array1Length];
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Enter a number: ");
			array1[i] = sc.nextInt();
		}

		System.out.print("Enter array2 length: ");
		int array2Length = sc.nextInt();

		while (array2Length <= 0) {
			System.out.print("Enter array2 length: ");
			array2Length = sc.nextInt();
		}

		int[] array2 = new int[array2Length];
		for (int i = 0; i < array2.length; i++) {
			System.out.print("Enter a number: ");
			array2[i] = sc.nextInt();
		}

		sc.close();

		boolean equals = true;
		boolean sameLength = array1.length == array2.length;

		if (sameLength) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					equals = false;
					break;
				}
			}
		} else {
			equals = false;
		}

		System.out.println(equals ? "Arrays are equals" : "Arrays differs");
		System.out.println(sameLength ? "Arrays are with same length" : "Arrays length differs");
	}
}
