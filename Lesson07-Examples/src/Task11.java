import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter n: ");
	int n = sc.nextInt();
	System.out.print("Enter m: ");
	int m = sc.nextInt();
	System.out.println();

	sc.close();

	int[][] matrix = new int[n][m];

	int value = 1;

	// filling the matrix
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		matrix[i][j] = value++;
	    }
	}

	// printing the matrix
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(matrix[i][j] + " ");
	    }
	    System.out.println();
	}

	System.out.println();
	value = 1;

	// filling the matrix
	for (int i = 0; i < matrix[0].length; i++) {
	    for (int j = 0; j < matrix.length; j++) {
		matrix[j][i] = value++;
	    }
	}

	// printing the matrix
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(matrix[i][j] + " ");
	    }
	    System.out.println();
	}

	System.out.println();
	value = 1;

	// filling the matrix
	for (int i = 0; i < matrix[0].length; i++) {

	    if (i % 2 == 0) {
		for (int j = 0; j < matrix.length; j++) {
		    matrix[j][i] = value++;
		}
	    } else {
		for (int j = matrix.length - 1; j >= 0; j--) {
		    matrix[j][i] = value++;
		}
	    }

	}

	// printing the matrix
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(matrix[i][j] + " ");
	    }
	    System.out.println();
	}

	System.out.println();
	value = 1;

	// filling first part of matrix
	for (int i = 0; i < matrix.length; i++) {

	    int row = i;
	    int col = 0;

	    for (int j = 0; j <= i; j++) {
		matrix[row][col] = value++;
		// System.out.println(row + " " + col);
		row--;
		col++;
	    }
	}

	for (int i = matrix.length - 1; i >= 0; i--) {

	    int row = matrix.length - 1;
	    int col = matrix.length - i;

	    for (int j = 0; j <= i; j++) {
		matrix[row][col] = value++;
		// System.out.println(row + " " + col);
		row--;
		col++;
	    }
	}

	// printing the matrix
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(matrix[i][j] + " ");
	    }
	    System.out.println();
	}
    }
}
