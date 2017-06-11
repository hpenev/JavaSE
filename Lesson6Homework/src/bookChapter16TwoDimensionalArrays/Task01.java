package bookChapter16TwoDimensionalArrays;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter how many rows do you want:");
	int rows = sc.nextInt();

	System.out.print("Enter how many cols do you want:");
	int cols = sc.nextInt();

	int[][] array = new int[rows][cols];

	for (int row = 0; row < array.length; row++) {
	    for (int col = 0; col < array[0].length; col++) {
		System.out.print("Enter a number for array[" + row + "][" + col + "]");
		array[row][col] = sc.nextInt();
	    }
	}

	sc.close();

	for (int row = 0; row < array.length; row++) {
	    for (int col = 0; col < array[0].length; col++) {
		System.out.print(array[row][col] + " ");
	    }
	    System.out.println();

	}

    }
}
