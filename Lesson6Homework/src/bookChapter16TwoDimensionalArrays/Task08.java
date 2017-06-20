package bookChapter16TwoDimensionalArrays;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter matrix length: ");
	int n = sc.nextInt();
	System.out.print("Enter matrix width: ");
	int m = sc.nextInt();

	int[][] matrix = new int[n][m];

	for (int i = 0; i < matrix[0].length; i++) {
	    for (int j = 0; j < matrix.length; j++) {
		System.out.print("matrix[" + i + "][" + j + "]=");
		matrix[j][i] = sc.nextInt();
	    }
	}
	sc.close();

	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(matrix[i][j] + " ");
	    }
	    System.out.println();
	}
    }
}
