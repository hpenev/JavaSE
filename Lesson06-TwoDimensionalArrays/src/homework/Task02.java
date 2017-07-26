package homework;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
	System.out.print("Enter length for matrix: ");
	Scanner scanner = new Scanner(System.in);
	int matrixLength = scanner.nextInt();
	// create a matrix
	int[][] matrix = new int[matrixLength][matrixLength];
	// read the matrix
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print("matrix[" + i + "][" + j + "]=");
		matrix[i][j] = scanner.nextInt();
	    }
	}
	scanner.close();

	// main diagonal
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		if (i == j) {
		    System.out.print(matrix[i][j] + " ");
		}
	    }
	}

	System.out.println();

	// Anti-diagonal
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		if (i + j == matrix.length - 1) {
		    System.out.print(matrix[i][j] + " ");
		}
	    }
	}
    }
}
