package ifElseStatements;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете А: ");
		double a = sc.nextDouble();
		System.out.print("Въведете B: ");
		double b = sc.nextDouble();
		System.out.print("Въведете C: ");
		double c = sc.nextDouble();
		sc.close();

		if (a < c && c < b) {
			System.out.printf("Числото %.1f е между %.1f и %.1f", c, a, b);
		} else {
			System.out.printf("Числото %.1f не е между %.1f и %.1f", c, a, b);
		}
	}
}
