package arraysBookChapter16;

import java.util.Scanner;

public class Task02 {
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

		boolean isMirror = true;
		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] != array[array.length - 1 - i]) {
				isMirror = false;
				break;
			}
		}

		System.out.println(isMirror ? "Mirror" : "Not Mirror");

	}
}
