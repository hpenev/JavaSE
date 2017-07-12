package ifElseStatements;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();

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

	}
}
