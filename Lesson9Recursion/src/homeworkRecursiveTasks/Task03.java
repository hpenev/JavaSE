package homeworkRecursiveTasks;
/*
Задача 3:
Да се състави програма, която проверява дали въведено естествено
число е просто.
Пример: 101
Изход: просто
*/

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	sc.close();

	System.out.println(isPrime(2, number) ? "prime" : "not prime");
    }

    static boolean isPrime(int i, int number) {
	if (i == number) {
	    return true;
	}

	if (number % i == 0) {
	    return false;
	}

	return isPrime(i + 1, number);
    }
}
