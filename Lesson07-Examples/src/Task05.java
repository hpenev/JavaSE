
public class Task05 {
    public static void main(String[] args) {
	int[][] matrix = {
		{ 1, 2, 3, 4 },
		{ 5, 6, 7, 8 },
		{ 9, 0, 1, 2 },
		{ 3, 4, 5, 6 },
		{ 7, 8, 9, 0 }
	};

	int sumRow = 0;
	int maxSumRow = 0;
	int row = 0;

	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		sumRow += matrix[i][j];
	    }
	    if (sumRow > maxSumRow) {
		row = i;
		maxSumRow = sumRow;
	    }
	    sumRow = 0;
	}

	System.out.print("max sum is " + maxSumRow + " on row " + row);

    }
}
