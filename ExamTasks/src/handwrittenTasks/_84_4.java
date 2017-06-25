package handwrittenTasks;

import java.util.Scanner;

public class _84_4 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	sc.close();

	boolean isPrime = true;

	for (int i = 2; i < number; i++) {
	    if (number % i == 0) {
		isPrime = false;
		break;
	    }
	}

	if (number < 0) {
	    System.out.println("Wrong input");
	} else {
	    System.out.println(isPrime ? "prime" : "not prime");
	}
    }
}
