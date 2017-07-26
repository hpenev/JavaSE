package homework;

public class Task01 {
    public static void main(String[] args) {
	int[][] matrix = {
		{ 48, 72, 13, 14, 15 },
		{ 21, 22, 53, 24, 75 },
		{ 31, 57, 33, 34, 35 },
		{ 41, 95, 43, 44, 45 },
		{ 59, 52, 53, 54, 55 },
		{ 61, 69, 63, 64, 65 }
	};

	int minValue = 2147483647;
	int maxValue = -2147483648;
	
	
	for (int row = 0; row < matrix.length; row++) {
	    for (int col = 0; col < matrix[row].length; col++) {
		if (matrix[row][col] > maxValue) {
		    maxValue = matrix[row][col];
		}
		if (matrix[row][col] < minValue) {
		    minValue = matrix[row][col];
		}
	    }
	}
	System.out.println("The smallest number is " + minValue);
	System.out.println("The biggest number is " + maxValue);
    }
}
