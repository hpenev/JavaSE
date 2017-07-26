package arraysHomework;

import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {

		// read array from console
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

		// first try with additional array
		{
			int[] revercedArray = new int[array.length];

			for (int i = 0; i < array.length; i++) {
				revercedArray[array.length - 1 - i] = array[i];
			}

			System.out.print("[");
			for (int i = 0; i < revercedArray.length; i++) {
				if (i != revercedArray.length - 1) {
					System.out.print(revercedArray[i] + ", ");
				} else {
					System.out.print(revercedArray[i]);
				}
			}
			System.out.println("]");
		}

		// second try without additional array
		{
			for (int i = 0; i < array.length / 2; i++) {
				int temp = array[i];
				array[i] = array[array.length - i - 1];
				array[array.length - 1 - i] = temp;
			}

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
}
