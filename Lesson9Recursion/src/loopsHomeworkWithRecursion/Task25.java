package loopsHomeworkWithRecursion;

import java.util.Scanner;

public class Task25 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		sc.close();

		if (number > 0 && number < 13) {
			int product = 1;
			int i = 1;

			do {
				product = product * i;
				i++;
			} while (i <= number);
			System.out.println(product);
		} else {
			System.out.println("Wrong input");
		}
	}
}