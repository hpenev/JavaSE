package arraysHomework;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {

		// int[] array = { 6, 27, -1, 5, 7, 7, 5, -1, 27, 6 };

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

		int rightCell = array.length - 1;
		boolean isMirror = true;

		for (int leftCell = 0; leftCell < array.length; leftCell++) {
			if (array[leftCell] != array[rightCell]) {
				isMirror = false;
				break;
			}
			rightCell--;
		}

		System.out.println(isMirror ? "Mirror" : "Not mirror");

	}
}
