package bookChapter7TwoDimensionalArrays;

public class Task03 {
    public static void main(String[] args) {
	int[][] matrix = {
		{ 1, 2, 3, 4 },
		{ 5, 6, 7, 8 },
		{ 9, 10, 11, 12 },
		{ 13, 14, 15, 16 },
	};

	for (int col = 0; col < matrix[0].length; col++) {
	    for (int row = matrix.length - 1; row >= 0; row--) {

		if (row == 0) {
		    System.out.print(matrix[row][col]);
		} else {
		    System.out.print(matrix[row][col] + ",");
		}
	    }
	    System.out.println();
	}
    }
}
