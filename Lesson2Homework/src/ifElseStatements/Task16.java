package ifElseStatements;

import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number [100...999]");

		int number = sc.nextInt();
		sc.close();

		if (number >= 100 && number <= 999) {
			int tempNum = number;
			int num3 = tempNum % 10;
			tempNum /= 10;
			int num2 = tempNum % 10;
			tempNum /= 10;
			int num1 = tempNum % 10;

			if (num1 == num2 && num2 == num3) {
				System.out.println("������� �� �����");
			} else if (num1 < num2 && num2 < num3) {
				System.out.println("������� �� ��� �������� ���");
			} else if (num1 > num2 && num2 > num3) {
				System.out.println("������� �� � �������� ���");
			} else {
				System.out.println("������� �� ����������");
			}
		} else {
			System.out.println("Wrong input");
		}
	}
}
