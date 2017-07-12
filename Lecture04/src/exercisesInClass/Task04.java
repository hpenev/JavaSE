package exercisesInClass;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		scanner.close();

		boolean isPrime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.println(isPrime ? "Prime" : "Not prime");
	}
}
