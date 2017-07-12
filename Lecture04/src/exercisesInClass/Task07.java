package exercisesInClass;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number A[0..127]");
		int a = scanner.nextInt();
		System.out.println("Enter number B[0..7]");
		int b = scanner.nextInt();
		System.out.println("Enter number A[0..7]");
		int c = scanner.nextInt();
		scanner.close();

		if (a >= 0 && a <= 127 && b >= 0 && b <= 7 && c >= 0 && c <= 7) {
			int result = a;

			result = result ^ (1 << b);
			result = result ^ (1 << c);

			System.out.println(result);

		} else {
			System.out.println("Wrong input");
		}

	}
}
