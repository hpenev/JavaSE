package bookChapter7TwoDimensionalArrays;

public class Task01 {
    public static void main(String[] args) {

	int[][] matrix = { { 1, 2, 1 }, { 4, 5, 6 }, { 1, 2, 2 } };

	int count = 0;
	int maxCount = 0;
	int mostFrequentNumber = 0;

	for (int row = 0; row < matrix.length; row++) {
	    for (int col = 0; col < matrix[0].length; col++) {
		int currentValue = matrix[row][col];

		for (int rowCheck = 0; rowCheck < matrix.length; rowCheck++) {
		    for (int colCheck = 0; colCheck < matrix[0].length; colCheck++) {
			if (currentValue == matrix[rowCheck][colCheck]) {
			    count++;
			}
		    }
		}

		if (count > maxCount) {
		    maxCount = count;
		    mostFrequentNumber = currentValue;
		}
		count = 0;
	    }
	}

	System.out.println("Most frequent number is: " + mostFrequentNumber + " - " + maxCount + " times");
    }
}
