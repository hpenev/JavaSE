package exercisesInClass;

import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();

		int spaces = number - 1;
		int stars = 1;

		for (int row = 1; row <= number; row++) {

			for (int i = 1; i <= spaces; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= stars; i++) {
				System.out.print("*");
			}
			spaces--;
			stars += 2;
			System.out.println();
		}
	}
}
