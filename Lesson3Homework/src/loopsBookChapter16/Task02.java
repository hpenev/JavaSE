package loopsBookChapter16;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		sc.close();
		int counter = 1;
		int index = 1;

		while (counter <= number) {
			if (index % 3 == 0) {
				System.out.print(index++ + " ");
				counter++;
			} else {
				index++;
			}

		}
	}
}
