package loopsHomework;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int number = sc.nextInt();
		sc.close();
		if (number > 0) {
			int count = 0;
			int currentNumber = 3;

			while (count < number) {
				if (currentNumber % 3 == 0) {
					if (count + 1 == number) {
						System.out.print(currentNumber);
						count++;
					} else {
						System.out.print(currentNumber + ",");
						count++;
					}
				}
				currentNumber++;
			}

		} else {
			System.out.println("Wrong input");
		}
	}
}
