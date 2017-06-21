package loopsHomeworkWithRecursion;

import java.util.Scanner;

/*
Задача 11: Въведете число N чрез конзолата и изкарайте като
резултат следния триъгълник с височина N:
  *
 ***
*****

*/

public class Task11 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number for tree:");
	int col = sc.nextInt();
	sc.close();
	if (col > 0) {
	    // iteration(col);
	    recursion(1, col);
	} else {
	    System.out.println("Wrong input");
	}

    }

    static void recursion(int row, int col) {
	if (row == col + 1) {
	    return;
	}
	spacesBeforeTriangle(col - row);
	triangle(1, row);
	System.out.println("*");
	recursion(row + 1, col);
    }

    static void triangle(int i, int row) {
	if (i == 2 * row - 1) {
	    return;
	}
	System.out.print("*");
	triangle(i + 1, row);
    }

    static void spacesBeforeTriangle(int i) {
	if (i == 0) {
	    return;
	}
	System.out.print(" ");
	spacesBeforeTriangle(i - 1);

    }

    private static void iteration(int col) {
	for (int row = 1; row <= col; row++) {
	    for (int s = col - row; s > 0; s--) {
		System.out.print(" ");
	    }

	    for (int z = 1; z <= 2 * row - 1; z++) {
		System.out.print("*");
	    }

	    System.out.println();
	}
    }
}
