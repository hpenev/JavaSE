package loopsHomeworkWithRecursion;

import java.util.Scanner;

/*Задача 6: Да се прочете число от екрана(конзолата) и да се
изведе сбора на всички числа между 1 и въведеното число.
*/

public class Task06 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number [1...]: ");
	int number = sc.nextInt();
	sc.close();

	if (number > 0) {
	    // iteration(number);
	    System.out.println(recursion(number));

	} else {
	    System.out.println("Wrong input");
	}
    }

    static int recursion(int n) {
	if (n == 1) {
	    return 1;
	}
	return n + recursion(n - 1);
    }

    private static void iteration(int number) {
	int sum = 0;
	for (int i = 1; i <= number; i++) {
	    sum += i;
	}
	System.out.printf("Sum from 1 to %d is %d", number, sum);
    }
}
