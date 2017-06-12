package homework;

public class Task07 {
    public static void main(String[] args) {
	int[][] matrix = {
		{ 11, 12, 13, 14, 15, 16 },
		{ 21, 22, 23, 24, 25, 26 },
		{ 31, 32, 33, 34, 35, 36 },
		{ 41, 42, 43, 44, 45, 46 },
		{ 51, 52, 53, 54, 55, 56 },
		{ 61, 62, 63, 64, 65, 66 }
	};

	int sum = 0;
	int totalSum = 0;

	for (int i = 0; i < matrix.length * matrix.length; i++) {
	    int row = i / matrix.length;
	    int col = i % matrix.length;

	    if ((row + col) % 2 == 0) {
		System.out.print(matrix[row][col] + " ");
		sum += matrix[row][col];
	    }

	    if (col == (matrix.length - 1)) {
		System.out.println("sum is " + sum);
		totalSum += sum;
		sum = 0;
	    }
	}

	System.out.println("Sum of all elements is " + totalSum);
    }
}
