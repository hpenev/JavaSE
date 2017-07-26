package handwrittenTasks;

import java.util.Scanner;

public class _84_5 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int p = sc.nextInt();
	System.out.print("Enter a number: ");
	int q = sc.nextInt();
	sc.close();

	for (int row = 1; row <= p; row++) {
	    for (int col = 1; col <= q; col++) {
		System.out.print(row + "" + col + " ");
	    }
	    System.out.println();
	}
    }
}
