package loopsExercisesAdvanced;

import java.util.Scanner;

//Write a program that enters a number n and prints all numbers ≤ n of the row: 1, 3, 7, 15, 31, .... Each subsequent number is calculated as the previous number * 2 + 1.

public class Task05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number greater than 1: ");
		int num = sc.nextInt();
		sc.close();

		int currentNumber = 1;
		while (currentNumber <= num) {
			System.out.println(currentNumber);
			currentNumber = currentNumber * 2 + 1;
		}
	}
}
