package handwrittenTasks;

public class _103_1 {
    public static void main(String[] args) {
	int[][] matrix = {
		{ 1, 2, 5 },
		{ 2, 1, 6 },
		{ 1, 8, 2 }
	};

	int mostFrequend = matrix[0][0];
	int maxCount = 0;

	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix.length; j++) {
		int candidate = matrix[i][j];
		int count = 0;

		for (int k = 0; k < matrix.length; k++) {
		    for (int k2 = 0; k2 < matrix.length; k2++) {
			if (matrix[k][k2] == candidate) {
			    count++;
			}
		    }
		}

		if (count > maxCount) {
		    mostFrequend = candidate;
		    maxCount = count;
		}
	    }
	}
	System.out.println("most frequent: " + mostFrequend + "(" + maxCount + " times)");

    }

}
