package loopsBookChapter16;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int number = sc.nextInt();
		sc.close();

		int count = 0;
		while (count < 10) {
			if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
				count++;
				if (count == 10) {
					System.out.print(count + ":" + number);
				} else {
					System.out.print(count + ":" + number + "; ");
				}
			}
			number++;
		}
	}
}
