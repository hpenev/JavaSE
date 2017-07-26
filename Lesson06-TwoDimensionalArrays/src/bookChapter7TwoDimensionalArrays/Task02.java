package bookChapter7TwoDimensionalArrays;

public class Task02 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 1 }, { 4, 5, 6 }, { 1, 2, 2 } };

		System.out.println("Main diagonal: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				if (row == col) {
					System.out.print(matrix[row][col] + " ");
				}
			}
		}

		System.out.println();
		System.out.println("Antidiagonal: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				if (row + col == matrix.length - 1) {
					System.out.print(matrix[row][col] + " ");
				}
			}
		}
	}
}
