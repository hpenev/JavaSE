package ifElseStatements;

import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int product = a * b;
		int lastDigit = product % 10;
		boolean isEven = product % 2 == 0;

		if (isEven) {
			System.out.printf("%d, %d - четна", product, lastDigit);
		} else {
			System.out.printf("%d, %d - нечетна", product, lastDigit);
		}

	}
}
