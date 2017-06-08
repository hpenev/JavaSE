package loopsHomework;

import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number A: ");
		int a = sc.nextInt();
		System.out.print("Enter number B: ");
		int b = sc.nextInt();
		sc.close();

		if (a != b && a < b && a > 0 && b > 0) {
			int sum = 0;

			for (int i = a; i <= b; i++) {
				sum += (i * i);

				if (i % 3 == 0) {
					System.out.print("skip " + i + ", ");
					continue;
				}

				// tezi shurotii sa za da mahna zapetaqta na poslednoto izvadeno
				// chislo
				int nextSum = sum + ((i + 1) * (i + 1));
				if (nextSum > 200) {
					System.out.print(i * i);
					break;
				} else {

					System.out.print(i * i + ", ");
				}

			}
		} else {
			System.out.println("Wrong input");
		}
	}
}
