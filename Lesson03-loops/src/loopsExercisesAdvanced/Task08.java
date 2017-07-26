package loopsExercisesAdvanced;

import java.util.Scanner;

//Write a program that enters an integer n (1 ≤ n ≤ 12) and calculates and prints n! = 1 * 2 * ... * n (n factorial).
public class Task08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number[0-12]: ");
		int n = sc.nextInt();
		sc.close();

		int facturiel = 1;
		for (int i = 1; i <= n; i++) {
			facturiel *= i;
		}
		System.out.println(facturiel);
	}
}
