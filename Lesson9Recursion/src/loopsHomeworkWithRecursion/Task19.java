package loopsHomeworkWithRecursion;

import java.util.Scanner;

public class Task19 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number [10..99]: ");
		int num = sc.nextInt();
		sc.close();

		if (num >= 10 && num <= 99) {
			do {
				if (num % 2 == 0) {
					num *= 0.5;
					System.out.print(num + ", ");
				} else {
					num = num * 3 + 1;
					System.out.print(num + ", ");
				}

				if (num == 1) {
					break;
				}

			} while (true);
		} else {
			System.out.println("Wrong input");
		}
	}
}
