package ifElseStatements;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �: ");
		double a = sc.nextDouble();
		System.out.print("�������� B: ");
		double b = sc.nextDouble();
		System.out.print("�������� C: ");
		double c = sc.nextDouble();
		sc.close();

		if (a < c && c < b) {
			System.out.printf("������� %.1f � ����� %.1f � %.1f", c, a, b);
		} else {
			System.out.printf("������� %.1f �� � ����� %.1f � %.1f", c, a, b);
		}
	}
}
