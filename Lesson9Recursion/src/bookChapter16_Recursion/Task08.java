package bookChapter16_Recursion;

import java.util.Scanner;

/*
8. Да се състави програма, която проверява дали въведено естествено число е
просто. Просто е число, което се дели без остатък единствено на 1 и на себе си.
Използвайте рекурсия.
*/

public class Task08 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	sc.close();
	System.out.println(isPrime(2, number) ? "Prime" : "Not prime");

    }

    static boolean isPrime(int index, int number) {
	// base case
	if (number == index) {
	    return true;
	}

	// first devider => is not prime
	if (number % index == 0) {
	    return false;
	}

	return isPrime(index + 1, number);

    }
}
