package exercisesInClass;

import java.util.Scanner;

public class Task09_romb {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	scanner.close();

	int spaces = number - 1;
	int stars = 1;
	int innerSpaces = -1;

	// first row
	for (int i = 1; i <= spaces; i++) {
	    System.out.print(" ");
	}

	System.out.println("*");
	spaces--;
	stars += 2;
	innerSpaces += 2;

	// triangle's body
	for (int row = 2; row < (2 * number) - 1; row++) {

	    for (int i = 1; i <= spaces; i++) {
		System.out.print(" ");
	    }

	    System.out.print("*");

	    for (int i = 1; i <= innerSpaces; i++) {
		System.out.print(" ");
	    }

	    System.out.print("*");

	    if (row < number) {
		spaces--;
		stars += 2;
		innerSpaces += 2;
	    } else {
		spaces++;
		stars -= 2;
		innerSpaces -= 2;
	    }
	    System.out.println();
	}
	// last row
	for (int i = 1; i <= spaces; i++) {
	    System.out.print(" ");
	}

	System.out.println("*");

    }
}
