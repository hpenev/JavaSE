package homework;

public class Task05 {
    public static void main(String[] args) {
	int[][] matrix = {
		{ 1, 2, 3, 4 },
		{ 5, 6, 7, 8 },
		{ 9, 10, 11, 12 },
		{ 13, 14, 15, 16 }
	};

	
	
	int[] sumCols = new int[matrix.length];
	int[] sumRows = new int[matrix.length];

	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		sumRows[i] += matrix[i][j];
		sumCols[j] += matrix[i][j];
	    }
	}
	// System.out.println(Arrays.toString(sumCols));
	// System.out.println(Arrays.toString(sumRows));

	int maxSumRows = -2147483648;
	int maxSumCols = -2147483648;

	for (int i = 0; i < sumRows.length; i++) {
	    if (sumRows[i] > maxSumRows) {
		maxSumRows = sumRows[i];
	    }
	}
	
	for (int i = 0; i < sumCols.length; i++) {
	    if (sumCols[i] > maxSumCols) {
		maxSumCols = sumCols[i];
	    }
	}

	System.out.println("The biggest amount in rows is " + maxSumRows);
	System.out.println("The biggest amount in colums is " + maxSumCols);

	if (maxSumRows > maxSumCols) {
	    System.out.println("Max sum in rows is bigger than max sum in cols");
	}

	if (maxSumCols > maxSumRows) {
	    System.out.println("Max sum in cols is bigger than max sum in rows");
	}

	if (maxSumCols == maxSumRows) {
	    System.out.println("Max sum in cols is equal to max sum in rows");
	}
    }
}
