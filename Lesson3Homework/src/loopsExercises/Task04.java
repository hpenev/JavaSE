package loopsExercises;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter �umber of numbers ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			int currentNumber = sc.nextInt();
			sum += currentNumber;
		}
		sc.close();

		System.out.println("sum is " + sum);
	}
}