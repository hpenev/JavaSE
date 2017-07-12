package ifElseStatements;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter integer A: ");
		int a = sc.nextInt();
		System.out.print("Enter integer B: ");
		int b = sc.nextInt();
		sc.close();

		int c = a;
		a = b;
		b = c;

		System.out.printf("Value of the A: %d", a);
		System.out.println();
		System.out.printf("Value of the B: %d", b);

	}
}
