package bookIfElseStatements;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double money = sc.nextDouble();
		boolean isSick = sc.nextBoolean();
		sc.close();

		if (isSick) {
			if (money > 10) {
				System.out.println("�� �� ���� ���������");
			} else {
				System.out.println("�� ��� ���");
			}
		} else {
			if (money > 10) {
				System.out.println("�� ����� �� ���� � ��������");
			} else {
				System.out.println("�� ������ �� �� �������");
			}
		}
	}
}
