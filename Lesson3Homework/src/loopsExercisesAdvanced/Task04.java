package loopsExercisesAdvanced;

import java.util.Scanner;

//Write a program that introduces n and prints the even degrees of 2 ≤ 2n: 2^0, 2^2, 2^4, 2^8, ..., 2n

public class Task04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number > 2: ");
		int number = sc.nextInt();
		sc.close();

		int n = 1;

		for (int i = 0; i <= number / 2; i++) {
			System.out.println(n);
			n *= 4;
		}
	}
}
