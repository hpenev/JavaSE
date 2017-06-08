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
				System.out.println("ще си куп€ лекарства");
			} else {
				System.out.println("ще пи€ чай");
			}
		} else {
			if (money > 10) {
				System.out.println("ще отида на кино с при€тели");
			} else {
				System.out.println("ще изл€за да се разход€");
			}
		}
	}
}
