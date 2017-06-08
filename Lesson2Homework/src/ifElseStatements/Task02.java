package ifElseStatements;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		double a = sc.nextDouble();
		System.out.print("Enter a different integer: ");
		double b = sc.nextDouble();
		sc.close();

		if (a > 0 && b > 0 && a != b) {
			double addition = a + b;
			double subtraction = a - b;
			double multiplication = a * b;
			double division = a / b;
			double modulus = a % b;

			DecimalFormat df = new DecimalFormat("#.##");

			System.out.printf("%s + %s = %s \n", df.format(a), df.format(b), df.format(addition));
			System.out.printf("%s - %s = %s \n", df.format(a), df.format(b), df.format(subtraction));
			System.out.printf("%s * %s = %s \n", df.format(a), df.format(b), df.format(multiplication));
			System.out.printf("%s / %s = %s \n", df.format(a), df.format(b), df.format(division));
			System.out.printf("%s %% %s = %s \n", df.format(a), df.format(b), df.format(modulus));

			// The percent sign is escaped using a percent sign
		} else {
			System.out.println("Wrong input");

		}
	}
}
