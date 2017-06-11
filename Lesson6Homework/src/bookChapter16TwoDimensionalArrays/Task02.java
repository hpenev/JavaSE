package bookChapter16TwoDimensionalArrays;

import java.util.Scanner;

public class Task02 {
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

	int maxSum = 0;
	int maxSumRow = 0;

	for (int row = 0; row < array.length; row++) {
	    int currentRowSum = 0;
	    for (int col = 0; col < array[0].length; col++) {
		currentRowSum += array[row][col];
	    }

	    if (currentRowSum > maxSum) {
		maxSum = currentRowSum;
		maxSumRow = row;
	    }
	}

	System.out.println("Max sum is: " + maxSum + " on row " + maxSumRow);

    }
}
