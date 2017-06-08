package bookIfElseStatements;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter a number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter a number: ");
		int num3 = sc.nextInt();
		sc.close();

		if (num1 < num2 && num2 < num3) {
			System.out.println("второто число е между първото и третото");
		} else {
			System.out.println("второто число не между първото и третото");
		}
	}
}
