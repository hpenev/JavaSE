package moreTasks;

public class Task01 {
    public static void main(String[] args) {
	int[][] matrix = {
		{ 16, 3, 2, 13 },
		{ 5, 10, 11, 8 },
		{ 9, 6, 7, 12 },
		{ 4, 15, 14, 1 }
	};

	int sum = 0;
	int rowSum = 0;
	int colSum = 0;
	int diagonalSum = 0;
	int antiDiagonalSum = 0;

	boolean isMagicSquare = true;

	// get the sum of first row
	for (int i = 0; i < matrix.length; i++) {
	    sum += matrix[0][i];
	}

	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {

		// sum for current row
		colSum += matrix[j][i];

		// sum for current row
		rowSum += matrix[i][j];

		// sum for diagonal
		if (i == j) {
		    diagonalSum += matrix[i][j];
		}

		// sum for anti-diagonal
		if (i + j == matrix.length - 1) {
		    antiDiagonalSum += matrix[i][j];
		}
	    }

	    if (sum != colSum) {
		isMagicSquare = false;
		break;
	    }
	    colSum = 0;

	    if (sum != rowSum) {
		isMagicSquare = false;
		break;
	    }
	    rowSum = 0;
	}

	if (sum != diagonalSum) {
	    isMagicSquare = false;
	}
	if (sum != antiDiagonalSum) {
	    isMagicSquare = false;
	}

	System.out.println(isMagicSquare ? "Magic square. sum is " + sum : "Not magic square");

    }
}
