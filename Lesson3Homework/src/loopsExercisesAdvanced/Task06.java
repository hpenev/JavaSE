package loopsExercisesAdvanced;

import java.util.Scanner;

// Write a program that introduces a positive integer n in the range [1 ... 100]. When entering a number outside the specified range, an error message is printed and the user is prompted to enter a new number.

public class Task06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("�nter a number in the range [1...100]: ");
			int number = sc.nextInt();
			if (number <= 100 && number >= 1) {
				System.out.print("The number is: " + number);
				break;
			} else {
				System.out.println("Invalid number!");
			}
		} while (true);
		sc.close();
	}
}
