package loopsExercisesAdvanced;

import java.util.Scanner;

//Write a program that enters a positive integer n and prints the numbers from n to 1 in reverse order (from the largest to the smallest).
public class Task02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int num = sc.nextInt();
		sc.close();

		if (num > 0) {
			for (int i = num; i > 0; i--) {
				System.out.println(i);
			}
		} else {
			System.out.println("Wrong input");
		}
	}
}
