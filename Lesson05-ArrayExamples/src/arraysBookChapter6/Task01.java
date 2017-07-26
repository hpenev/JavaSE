package arraysBookChapter6;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		// read the array
		Scanner sc = new Scanner(System.in);

		int length = 10;
		double[] array = new double[length];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a number: ");
			array[i] = sc.nextDouble();
		}
		sc.close();

		// sum all elements of the array
		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		// print the result
		System.out.println("Sum of all elements is: " + sum);

	}
}
