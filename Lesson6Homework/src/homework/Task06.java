package homework;

public class Task06 {
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

	for (int i = 1; i < matrix.length; i += 2) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(matrix[i][j] + " ");
		sum += matrix[i][j];
	    }

	    System.out.println("sum is " + sum);
	    totalSum += sum;
	    sum = 0;
	}

	System.out.println("Sum of all elements is " + totalSum);
    }
}
