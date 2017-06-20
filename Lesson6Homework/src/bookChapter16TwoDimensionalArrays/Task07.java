package bookChapter16TwoDimensionalArrays;

public class Task07 {
    public static void main(String[] args) {

	// Scanner sc = new Scanner(System.in);
	// System.out.print("Enter matrix length: ");
	// int n = sc.nextInt();
	// System.out.print("Enter matrix width: ");
	// int m = sc.nextInt();
	//
	// int[][] matrix = new int[n][m];
	//
	// for (int i = 0; i < matrix.length; i++) {
	// for (int j = 0; j < matrix[i].length; j++) {
	// System.out.print("matrix[" + i + "][" + j + "]=");
	// matrix[i][j] = sc.nextInt();
	// }
	// }
	//
	// sc.close();

	int[][] matrix = {
		{ 1, 2, 3, 4 },
		{ 5, 6, 7, 8 },
		{ 9, 10, 11, 12 },
		{ 13, 14, 15, 16 }
	};

	int maxSum = 0;

	int row = 0;
	int col = 0;

	for (int i = 0; i < matrix.length - 1; i++) {
	    for (int j = 0; j < matrix[i].length - 1; j++) {
		int currentSum = matrix[i][j] +
			matrix[i][j + 1] +
			matrix[i + 1][j] +
			matrix[i + 1][j + 1];

		if (currentSum > maxSum) {
		    maxSum = currentSum;
		    row = i;
		    col = j;
		}
	    }
	}

	System.out.println(matrix[row][col] + " " + matrix[row][col + 1]);
	System.out.println(matrix[row + 1][col] + " " + matrix[row + 1][col + 1]);
    }
}
