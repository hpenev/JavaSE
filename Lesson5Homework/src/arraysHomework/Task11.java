package arraysHomework;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = sc.nextInt();
		}
		sc.close();

		int count = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 5 == 0 && array[i] > 5) {
				System.out.print(array[i] + " ");
				count++;
			}
		}

		System.out.println();
		System.out.println(count + " numbers");

	}
}
