package loopsExercisesAdvanced;

import java.util.Scanner;

//Write a program that introduces two integer positive integers a and b and calculates and prints their Greatest common divisor (GCD)
//Hint: Implement the Euclid algorithm

public class Task07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int a = sc.nextInt();
		System.out.print("enter a number: ");
		int b = sc.nextInt();
		sc.close();
		while (true) {
			if (b == 0) {
				System.out.println("GCD is " + a);
				break;
			}
			int temp = b;
			b = a % b;
			a = temp;
		}

		// Qka zadacha podhodqshta za rekursiq
	}
}
