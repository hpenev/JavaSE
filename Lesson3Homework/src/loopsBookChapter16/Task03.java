package loopsBookChapter16;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number [1000..99999]: ");
		int number = sc.nextInt();
		sc.close();

		if (number >= 1000 && number <= 99999) {
			boolean isPalindrome = false;

			int palindrome = number;
			int reverse = 0;

			while (palindrome != 0) {
				int remainder = palindrome % 10;
				reverse = reverse * 10 + remainder;
				palindrome = palindrome / 10;
			}

			if (number == reverse) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
			}

			System.out.println(isPalindrome ? "Palindrome" : "Not palindrome");
		} else {
			System.out.println("Wrong input");
		}

	}
}
