package bookChapter8;

import java.util.Scanner;

public class Fibonacci_Recursion {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	int fibonacciNumber = fibonacci(number);
	sc.close();

	System.out.println(fibonacciNumber);

    }

    static int fibonacci(int n) {
	if (n == 0) {
	    return 0;
	}
	if (n == 1) {
	    return 1;
	}
	if (n == 2) {
	    return 1;
	}

	return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
