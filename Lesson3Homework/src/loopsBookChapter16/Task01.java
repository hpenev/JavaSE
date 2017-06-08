package loopsBookChapter16;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		System.out.print("Enter a number: ");
		int b = sc.nextInt();
		sc.close();

		int min = Math.min(a, b);
		int max = Math.max(a, b);

		for (int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
	}
}
