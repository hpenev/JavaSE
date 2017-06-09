package arraysBookChapter16;

import java.util.Scanner;

public class Task04 {
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

		int lastCell = 0;
		int count = 0;
		int maxEqualValues = 0;
		int maxEqualValuesLastCell = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				lastCell = i + 1;
				count++;
			} else {
				if (count > maxEqualValues) {
					maxEqualValues = count;
					maxEqualValuesLastCell = lastCell;
				}
				count = 0;
			}
		}
		System.out.println("Most long sequence of equal values is: ");

		for (int i = maxEqualValuesLastCell - maxEqualValues; i <= maxEqualValuesLastCell; i++) {
			if (i == maxEqualValuesLastCell) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ",");
			}
		}

	}
}
