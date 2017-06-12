package homework;

public class Task04 {
    public static void main(String[] args) {
	int[][] matrix = {
		{ 1, 2, 3, 4 },
		{ 5, 6, 7, 8 },
		{ 9, 10, 11, 12 },
		{ 13, 14, 15, 16 }
	};
	
	for (int j = 0; j < matrix.length; j++) {
	    for (int i = matrix[j].length - 1; i >= 0; i--) {
		System.out.print(matrix[i][j] + " ");
	    }
	    System.out.println();
	}
    }
}
