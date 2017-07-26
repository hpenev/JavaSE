package exercisesInClass;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int a = scanner.nextInt();
	System.out.print("Enter a number: ");
	int b = scanner.nextInt();
	scanner.close();

	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;

	if (a >= b) {
	    max = a;
	    min = b;
	} else {
	    max = b;
	    min = a;
	}

	for (int i = min; i <= max; i++) {
	    if (i % 3 == 0) {
		System.out.print(i + ",");
	    }
	}
    }
}
