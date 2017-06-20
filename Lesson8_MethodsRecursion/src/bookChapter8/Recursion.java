package bookChapter8;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();
	sc.close();

	int result = factorial(num);

	System.out.println(result);

    }

    static int factorial(int n) {
	if (n == 1) {
	    return 1;
	} else {
	    return n * factorial(n - 1);
	}
    }
}
