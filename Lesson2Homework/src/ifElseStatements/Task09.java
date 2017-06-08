package ifElseStatements;

import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = sc.nextInt();
		System.out.print("Enter an integer: ");
		int b = sc.nextInt();
		sc.close();

		if (a > 9 && a < 100 && b > 9 && b < 100) {

			int product = a * b;
			int lastDigit = product % 10;
			boolean isEven = product % 2 == 0;

			if (isEven) {
				System.out.printf("%d, %d - �����", product, lastDigit);
			} else {
				System.out.printf("%d, %d - �������", product, lastDigit);
			}
		} else {
			System.out.println("Wrong input");
		}
	}
}