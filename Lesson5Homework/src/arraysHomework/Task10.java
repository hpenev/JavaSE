package arraysHomework;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = sc.nextInt();
		}
		sc.close();

		int sum = 0;
		int avarageValue = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avarageValue = sum / array.length;
		System.out.println("Middle value: " + avarageValue);

		int nerestValue = 0;

		for (int i = 0; i < array.length; i++) {
			int currentValue = array[i];
			if (Math.abs(currentValue - avarageValue) <= Math.abs(nerestValue - avarageValue)) {
				nerestValue = currentValue;
			}
		}
		System.out.println("Nearest value: " + nerestValue);
	}
}
