package ifElseStatements;

import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		sc.close();

		boolean is_A_White = (a1 % 2 == 0) && (a2 % 2 == 0);
		boolean is_B_White = (b1 % 2 == 0) && (b2 % 2 == 0);

		if (is_A_White && is_B_White) {
			System.out.println("��������� �� � ������� ����");
		} else {
			System.out.println("��������� �� � �������� ����");
		}

	}
}
