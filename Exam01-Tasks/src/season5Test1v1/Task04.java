package season5Test1v1;

public class Task04 {
    public static void main(String[] args) {
	int x1 = 1;
	int y1 = 6;
	char[][] matrix1 = {
		{ 'b', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
		{ 'b', 'b', 'b', 'b', '-', '-', '-', '-', '-', '-', '-', '-' },
		{ '-', '-', '-', 'b', 'b', '-', '-', '-', '-', 'b', 'b', 'b' },
		{ '-', '-', '-', '-', 'b', 'b', '-', '-', 'b', 'b', '-', '-' },
		{ '-', '-', '-', '-', '-', 'b', 'b', 'b', 'b', '-', '-', '-' },
		{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
		{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
		{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
		{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
		{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
		{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
		{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }
	};

	int x2 = 2;
	int y2 = 4;
	char[][] matrix2 = {
		{ '-', '-', 'b', 'b', 'b', 'b', '-' },
		{ '-', 'b', 'b', '-', '-', 'b', '-' },
		{ '-', 'b', '-', '-', '-', 'b', '-' },
		{ '-', 'b', 'b', 'b', 'b', 'b', '-' },
		{ '-', '-', '-', '-', '-', '-', '-' },
		{ '-', '-', '-', '-', '-', '-', '-' },
		{ '-', '-', '-', '-', '-', '-', '-' }
	};

	color(matrix1, x1, y1);
	printMatrix(matrix1);

	System.out.println();

	color(matrix2, x2, y2);
	printMatrix(matrix2);

    }

    static void color(char[][] matrix, int i, int j) {

	matrix[i][j] = 'r';

	// up
	if (i - 1 >= 0) {
	    if (matrix[i - 1][j] != 'b' && matrix[i - 1][j] != 'r') {
		color(matrix, i - 1, j);
	    }
	}

	// down
	if (i + 1 <= matrix.length - 1) {
	    if (matrix[i + 1][j] != 'b' && matrix[i + 1][j] != 'r') {
		color(matrix, i + 1, j);
	    }
	}

	// left
	if (j - 1 >= 0) {
	    if (matrix[i][j - 1] != 'b' && matrix[i][j - 1] != 'r') {
		color(matrix, i, j - 1);
	    }
	}

	// right
	if (j + 1 <= matrix[0].length - 1) {
	    if (matrix[i][j + 1] != 'b' && matrix[i][j + 1] != 'r') {
		color(matrix, i, j + 1);
	    }
	}

	// up right
	if (j + 1 <= matrix[0].length - 1 && i - 1 > 0) {
	    if (matrix[i - 1][j + 1] != 'b' && matrix[i - 1][j + 1] != 'r') {
		color(matrix, i - 1, j + 1);
	    }
	}

	// up left
	if (j - 1 >= 0 && i - 1 > 0) {
	    if (matrix[i - 1][j - 1] != 'b' && matrix[i - 1][j - 1] != 'r') {
		color(matrix, i - 1, j - 1);
	    }
	}

	// down right
	if (i + 1 <= matrix.length - 1 && j + 1 <= matrix[0].length - 1) {
	    if (matrix[i + 1][j + 1] != 'b' && matrix[i + 1][j + 1] != 'r') {
		color(matrix, i + 1, j + 1);
	    }
	}

	// down left
	if (i + 1 <= matrix.length - 1 && j - 1 >= 0) {
	    if (matrix[i + 1][j - 1] != 'b' && matrix[i + 1][j - 1] != 'r') {
		color(matrix, i + 1, j - 1);
	    }
	}

    }

    static void printMatrix(char[][] matrix) {
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(matrix[i][j] + " ");
	    }
	    System.out.println();
	}
    }
}
