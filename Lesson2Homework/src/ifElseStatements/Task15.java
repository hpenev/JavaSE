package ifElseStatements;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number [0..24]: ");
		int hour = sc.nextInt();
		sc.close();

		if (hour >= 0 && hour < 24) {
			if (4 <= hour && hour < 9) {
				System.out.println("����� ����");
			}
			if (9 <= hour && hour < 18) {
				System.out.println("����� ���");
			}
			if (hour < 4 || 18 <= hour) {
				System.out.println("����� �����");
			}
		} else {
			System.out.println("Wrong number");
		}
	}
}
