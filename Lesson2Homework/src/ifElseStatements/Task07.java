package ifElseStatements;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a hour: (integer)");
		int hour = sc.nextInt();

		System.out.print("Enter amount of money: (decimal) ");
		double money = sc.nextDouble();

		System.out.print("Enter a isSick: (true/false)");
		boolean isSick = sc.nextBoolean();

		sc.close();

		if ((hour < 24 || hour >= 0) && (money > 0)) {
			if (isSick) {
				System.out.println("���� �� �������");
				if (money > 0) {
					System.out.print("�� �� ���� ���������");
				} else {
					System.out.println("�� ���� ����� � �� ��� ���");
				}
			}

			if (!isSick) {
				if (money < 10) {
					System.out.println("�� ����� �� ����");
				} else {
					System.out.println("�� ����� �� ���� � ��������");
				}
			}
		} else {
			System.out.println("Wrong input");
		}

	}
}
