package arraysHomework;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {

		// read array from console
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int array1Length = sc.nextInt();

		int[] array1 = new int[array1Length];
		for (int i = 0; i < array1.length; i++) {
			System.out.print("Enter a number: ");
			array1[i] = sc.nextInt();
		}
		sc.close();

		// create new array
		int[] array2 = new int[array1.length];

		array2[0] = array1[0];
		array2[array1.length - 1] = array1[array1.length - 1];

		for (int i = 1; i < array1.length - 1; i++) {
			array2[i] = array1[i - 1] + array1[i + 1];
		}

		// print array
		System.out.print("[");
		for (int i = 0; i < array2.length; i++) {
			if (i != array2.length - 1) {
				System.out.print(array2[i] + ", ");
			} else {
				System.out.print(array2[i]);
			}
		}
		System.out.println("]");

	}
}
