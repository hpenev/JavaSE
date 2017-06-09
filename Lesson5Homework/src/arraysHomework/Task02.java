package arraysHomework;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		// int[] arr = { 10, 3, 5, 8, 6, -3, 7 };

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

		int arrLength = array.length;
		int[] newArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			if (i < (array.length / 2)) {
				newArray[i] = array[i];
			} else {
				newArray[arrLength - 1] = array[i];
				arrLength--;
			}
		}

		System.out.print("old array: " + "[");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		System.out.println("]");

		System.out.print("new array: " + "[");
		for (int i = 0; i < newArray.length; i++) {
			if (i != newArray.length - 1) {
				System.out.print(newArray[i] + ", ");
			} else {
				System.out.print(newArray[i]);
			}
		}
		System.out.println("]");

	}
}
