package loopsHomeworkWithRecursion;

import java.util.Scanner;

/*
Задача 10: Въведете число от клавиатурата и определете дали е
просто. Просто число е това което се дели САМО на 1 и на себе
си.
*/

public class Task10 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();
	sc.close();

	boolean isPrime = true;

	isPrime = iteration(num, isPrime);
	if (isPrime) {
	    System.out.println("Number is prime");
	} else {
	    System.out.println("number is not prime");
	}

	isPrime = recursion(2, num);
	if (isPrime) {
	    System.out.println("Number is prime");
	} else {
	    System.out.println("number is not prime");
	}

    }

    static boolean recursion(int startNumber, int number) {
	if (startNumber == number) {
	    return true;
	}

	if (number % startNumber == 0) {
	    return false;
	}

	return recursion(startNumber + 1, number);
    }

    private static boolean iteration(int num, boolean isPrime) {
	for (int i = 2; i < num; i++) {
	    if (num % i == 0) {
		isPrime = false;
		break;
	    }
	}
	return isPrime;
    }
}
