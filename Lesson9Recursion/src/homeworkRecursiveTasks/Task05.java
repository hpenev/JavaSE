package homeworkRecursiveTasks;

import java.util.Scanner;

/*
Задача 5:
Да се състави програма, чрез която се въвежда естествено число N.
Програмата да извежда число, чиито цифри са написани в ред обратен
на въведеното число.
Да се извежда съобщение дали въведеното число е палиндром.
Пример: 12321
Изход: 12321 да.
Пример: 12578
Изход: 87521 не.
Използвайте рекурсия
*/

public class Task05 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number: ");
	int number = sc.nextInt();
	sc.close();

	int reverse = reverceNumber(number, 0);

	System.out.print("reversed number: " + reverse);
	if (number == reverse) {
	    System.out.println(" is pralindrome");
	} else {
	    System.out.println(" isn't pralindrome");
	}

    }

    static int reverceNumber(int number, int reverse) {
	// base case
	if (number == 0) {
	    return reverse;
	}

	reverse = reverse * 10 + number % 10;

	return reverceNumber(number / 10, reverse);
    }
}
