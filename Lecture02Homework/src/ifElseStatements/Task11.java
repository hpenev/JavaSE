package ifElseStatements;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit number");
		int num = sc.nextInt();
		sc.close();

		int tempNum = num;
		int num3 = tempNum % 10;
		tempNum /= 10;
		int num2 = tempNum % 10;
		tempNum /= 10;
		int num1 = tempNum % 10;

		// System.out.printf("%d %d %d\n", num1, num2, num3);

		boolean firshCheck = num % num1 == 0;
		boolean secondCheck = num % num2 == 0;
		boolean thirdCheck = num % num3 == 0;

		// System.out.println(firshCheck + " " + secondCheck + " " +
		// thirdCheck);

		if (firshCheck && secondCheck && thirdCheck) {
			System.out.println("������� �� ���� �� ����� ���� �����");
		} else {
			System.out.println("������� �� �� ���� �� ����� ���� �����");
		}

	}
}