package loopsHomework;

import java.util.Scanner;

public class Task22 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Entere a number [1..999]: ");
		int number = sc.nextInt();
		sc.close();

		if (number >= 1 && number <= 999) {
			int counter = 1;
			while (counter <= 10) {
				if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
					System.out.print(counter + ":1" + number + " ");
					counter++;
				}
				number++;
			}
		} else {
			System.out.println("Wrong input");

		}
	}
}
