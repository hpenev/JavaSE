package bookChapter16TwoDimensionalArrays;

import java.util.Scanner;

public class Task03 {
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

	int mainDiagonalSum = 0;
	int antiDiagonalSum = 0;

	for (int row = 0; row < array.length; row++) {
	    for (int col = 0; col < array[0].length; col++) {
		if (row == col) {
		    mainDiagonalSum += array[row][col];
		}
		if (row - col == array.length - 1) {
		    antiDiagonalSum += array[row][col];
		}
	    }
	}

	if (mainDiagonalSum > antiDiagonalSum) {
	    System.out.println("Bigger diagonal sum is: " + mainDiagonalSum);
	} else {
	    System.out.println("Bigger diagonal sum is: " + antiDiagonalSum);

	}
    }
}
