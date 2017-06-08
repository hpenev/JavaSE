package ifElseStatements;

import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		if (num >= 1000 && num <= 9999) {
			int num4 = num % 10;
			num /= 10;
			int num3 = num % 10;
			num /= 10;
			int num2 = num % 10;
			num /= 10;
			int num1 = num % 10;
			// System.out.printf("%d %d %d %d", num1, num2, num3, num4);

			int first = num1 * 10 + num4;
			int second = num2 * 10 + num3;
			// System.out.printf("%d %d", first, second);

			if (first > second) {
				System.out.printf("%d > %d", first, second);
			}

			if (second > first) {
				System.out.printf("%d < %d", first, second);
			}

			if (first == second) {
				System.out.printf("%d = %d", first, second);
			}
		} else {
			System.out.println("Wrong input");
		}
	}
}