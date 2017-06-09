package arraysBookChapter16;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length (even number): ");
		int arrayLength = sc.nextInt();

		while (arrayLength % 2 != 0) {
			System.out.print("Enter array length (even number): ");
			arrayLength = sc.nextInt();
		}

		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = sc.nextInt();
		}
		sc.close();

		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {

			if (i < array.length / 2) {
				newArray[i] = array[i];
			} else {
				newArray[i] = array[array.length - i + 2];
			}
		}

		for (int i = 0; i < newArray.length; i++) {
			if (i == newArray.length - 1) {
				System.out.print(newArray[i]);
			} else {
				System.out.print(newArray[i] + ",");
			}
		}

	}
}
