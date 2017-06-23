package bookChapter16_Recursion;

import java.util.Scanner;

/*
6. Да се състави програма, която приема за входни данни естествено число N.
Програмата да извежда число, чиито цифри са написани в ред, обратен на въве-
деното число. Използвайте рекурсия.
*/

public class Task06 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	sc.close();

	// void method
	reverced(number);

	// int method
	int reverced = reverced(number, 0);
	System.out.println(reverced);
    }

    static void reverced(int number) {

	if (number == 0) {
	    return;
	}
	System.out.print(number % 10);
	reverced(number / 10);
    }

    static int reverced(int number, int reverced) {
	if (number == 0) {
	    return reverced;
	}
	reverced = reverced * 10 + number % 10;
	return reverced(number / 10, reverced);
    }

}
