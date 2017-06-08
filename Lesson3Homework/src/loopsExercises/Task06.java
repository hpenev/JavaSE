package loopsExercises;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Number of numbers: ");

		int n = sc.nextInt();
		int smallestNum = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");

			int number = sc.nextInt();
			if (number < smallestNum) {
				smallestNum = number;
			}
		}
		sc.close();
		System.out.println("Smallest number is " + smallestNum);
	}
}
