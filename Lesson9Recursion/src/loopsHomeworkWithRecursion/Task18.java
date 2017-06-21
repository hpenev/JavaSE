package loopsHomeworkWithRecursion;

import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number [1..9]: ");
		int num1 = sc.nextInt();
		System.out.print("Enter a number [1..9]: ");
		int num2 = sc.nextInt();
		sc.close();

		if (num1 > 0 && num2 > 0 && num1 < 10 && num2 < 10) {
			for (int i = 1; i <= num1; i++) {
				if (i > num1 || i > num2) {
					break;
				}
				for (int j = 1; j <= num2; j++) {
					if (j > num1 || j > num2) {
						break;
					}
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
			}
		} else {
			System.out.println("Wrong Input");
		}
	}
}
