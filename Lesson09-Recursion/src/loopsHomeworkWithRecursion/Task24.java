package loopsHomeworkWithRecursion;

/*
Задача 24:
Едно число X е палиндром, aко се чете еднакво отпред назад и
отзад напред.
Да се състави програма, която проверява дали въведено число е
палиндром.
Входни данни: N - естествено число от интервала [10 .. 30000].
Пример: 17571
Изход: числото е палиндром
Използвайте цикъл do-while.
*/

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number in range[10 .. 30000]: ");
	int num = sc.nextInt();
	sc.close();

	if (num >= 10 && num <= 30000) {
	    boolean isPalindrome = true;

	    // isPalindrome = iteration(num);

	    // int length = (int) (Math.log10(num) + 1);
	    isPalindrome = recursion(num, num, 0);

	    System.out.println(isPalindrome ? "Number is a palindrome" : "Number is not a palindrome");
	} else {
	    System.out.println("Wrong input");
	}

    }

    static boolean recursion(int number, int original, int reverse) {

	// int length = (int) (Math.log10(number) + 1);

	// base case
	if (number == 0) {
	    if (original == reverse) {
		return true;
	    } else {
		return false;
	    }

	}

	reverse = reverse * 10 + number % 10;

	return recursion(number / 10, original, reverse);
    }

    private static int reverse(int number) {
	int reverse = 0;

	while (number != 0) {
	    reverse = reverse * 10 + number % 10;
	    number = number / 10;
	}

	return reverse;
    }

    private static boolean iteration(int num) {
	boolean isPalindrome = true;
	int remainder = 0;
	int divider = 100000;
	int digitsInNumber = 6;

	do {
	    remainder = num / divider;
	    if (remainder != 0) {
		break;
	    }
	    digitsInNumber--;
	    divider /= 10;
	} while (true);

	int firstDigitDivider = digitsInNumber - 1;
	int lastDigitDivider = 0;

	do {
	    int firstDigit = (num / (int) (Math.pow(10, firstDigitDivider))) % 10;
	    int lastDigit = (num / (int) (Math.pow(10, lastDigitDivider))) % 10;

	    if (firstDigit != lastDigit) {
		isPalindrome = false;
		break;
	    }
	    lastDigitDivider++;
	    firstDigitDivider--;
	} while (firstDigitDivider > digitsInNumber / 2);
	return isPalindrome;
    }
}
