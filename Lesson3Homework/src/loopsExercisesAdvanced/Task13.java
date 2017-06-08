package loopsExercisesAdvanced;

import java.util.Scanner;

//Write a program that enters an integer n and prints the pyramid by numbers as in the examples

public class Task13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		sc.close();

		int lastNum = 1;

		for (int i = 1; i < number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(lastNum + " ");

				if (lastNum == number) {
					break;
				}

				lastNum++;
			}
			if (lastNum == number) {
				break;
			}
			System.out.println();
		}
	}
}