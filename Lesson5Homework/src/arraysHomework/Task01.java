package arraysHomework;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int arrayLength = sc.nextInt();

		while (arrayLength <= 0) {
			System.out.print("Enter array length: ");
			arrayLength = sc.nextInt();
		}

		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = sc.nextInt();
		}
		sc.close();

		// int[] arr = { 10, 3, 5, 8, 6, -3, 7 };

		int min = 2147483647; // Integer.MAX_VALUE

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0 && array[i] < min) {
				min = array[i];
			}
		}

		if (min == 2147483647) {
			System.out.println("Array do not contain number divisible by 3");
		} else {
			System.out.println("Minimal number divisible  by 3 is " + min);
		}

	}
}
