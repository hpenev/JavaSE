package bookChapter16_Recursion;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a nubmer: ");
	int number = sc.nextInt();
	sc.close();

	System.out.println("factorial is : " + factorial(number));

    }

    static int factorial(int number) {
	if (number == 1) {
	    return 1;
	}

	return number * factorial(number - 1);
    }
}
