package ifElseStatements;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer A1: ");
		int a1 = sc.nextInt();
		System.out.print("Enter an integer A2: ");
		int a2 = sc.nextInt();
		System.out.print("Enter an integer A3: ");
		int a3 = sc.nextInt();
		sc.close();

		int temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;

		System.out.println("A1: " + a1);
		System.out.println("A2: " + a2);
		System.out.println("A3: " + a3);
	}
}
