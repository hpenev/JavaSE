package arraysBookChapter16;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int arrayLength = sc.nextInt();

		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = sc.nextInt();
		}
		sc.close();

		int[] newArray = new int[array.length];

		newArray[0] = array[0];
		newArray[array.length - 1] = array[array.length - 1];

		for (int i = 1; i < newArray.length - 1; i++) {
			newArray[i] = array[i - 1] + array[i + 1];
		}

		for (int i = 0; i < newArray.length; i++) {
			if (i != newArray.length - 1) {
				System.out.print(newArray[i] + ",");
			} else {
				System.out.print(newArray[i]);
			}
		}
	}
}
