package loopsHomework;

import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int sum = sc.nextInt();
		sc.close();

		if (sum > 1 && sum < 28) {
			for (int i = 100; i < 1000; i++) {
				int tempNum = i;
				int num1 = tempNum % 10;
				tempNum /= 10;
				int num2 = tempNum % 10;
				tempNum /= 10;
				int num3 = tempNum % 10;
				tempNum /= 10;

				if (num1 + num2 + num3 == sum) {
					System.out.print(i + ", ");
				}
			}
		} else {
			System.out.println("Wrong input");
		}
	}
}
