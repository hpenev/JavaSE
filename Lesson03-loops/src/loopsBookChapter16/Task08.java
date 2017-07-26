package loopsBookChapter16;

import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a square side: ");

		int number = sc.nextInt();
		System.out.print("Enter a square char: ");
		char ch = sc.next().charAt(0);
		sc.close();

		for (int i = 1; i <= number; i++) {
			if (i == 1 || i == number) {
				for (int j = 1; j <= number; j++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int j = 1; j <= number - 2; j++) {
					System.out.print(ch);

				}
				System.out.print("*");

			}
			System.out.println();
		}
	}
}