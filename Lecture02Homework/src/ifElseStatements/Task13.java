package ifElseStatements;

import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double temperature = sc.nextDouble();
		sc.close();

		if (temperature <= -20) {
			System.out.println("ледено студено");
		}

		if (-20 < temperature && temperature <= 0) {
			System.out.println("студено");
		}

		if (0 < temperature && temperature <= 15) {
			System.out.println("хладно");
		}

		if (15 < temperature && temperature <= 25) {
			System.out.println("топло");
		}

		if (25 < temperature) {
			System.out.println("горещо");
		}

	}
}
