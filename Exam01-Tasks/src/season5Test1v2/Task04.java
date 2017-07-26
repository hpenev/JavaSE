package season5Test1v2;

public class Task04 {
    public static void main(String[] args) {
	char[][] matrix = {
		{ '*', '0', '*', '0' },
		{ '0', '0', '0', '0' },
		{ '*', '*', '0', '0' },
		{ '0', '0', '0', '0' },
	};

	minesweeper(matrix, 0, 0);
	print(matrix);
    }

    static void print(char[][] matrix) {
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(matrix[i][j] + " ");
	    }
	    System.out.println();
	}
    }

    static void minesweeper(char[][] matrix, int i, int j) {

	// if has bomb - fill neighbour cells
	if (matrix[i][j] == '*') {
	    // up
	    if (i - 1 >= 0) {
		fillCell(matrix, i - 1, j);
	    }
	    // up - right
	    if (i - 1 >= 0 && j + 1 <= matrix[0].length - 1) {
		fillCell(matrix, i - 1, j + 1);
	    }
	    // right
	    if (j + 1 <= matrix[0].length - 1) {
		fillCell(matrix, i, j + 1);
	    }
	    // right - down
	    if (i + 1 <= matrix.length - 1 && j + 1 <= matrix[0].length - 1) {
		fillCell(matrix, i + 1, j + 1);
	    }
	    // down
	    if (i + 1 <= matrix.length - 1) {
		fillCell(matrix, i + 1, j);
	    }
	    // down - left
	    if (i + 1 <= matrix.length - 1 && j - 1 >= 0) {
		fillCell(matrix, i + 1, j - 1);
	    }
	    // left
	    if (j - 1 >= 0) {
		fillCell(matrix, i, j - 1);
	    }
	    // up- left
	    if (i - 1 >= 0 && j - 1 >= 0) {
		fillCell(matrix, i - 1, j - 1);
	    }
	}

	// go right
	if (j == matrix[0].length - 1 && i == matrix.length - 1) {
	    return;
	}
	// go to new line;
	if (j == matrix[0].length - 1) {
	    i += 1;
	    j = -1;// in method we increment
	}
	minesweeper(matrix, i, j + 1);
    }

    static void fillCell(char[][] matrix, int i, int j) {
	switch (matrix[i][j]) {
	case '0':
	    matrix[i][j] = '1';
	    break;
	case '1':
	    matrix[i][j] = '2';
	    break;
	case '2':
	    matrix[i][j] = '3';
	    break;
	case '3':
	    matrix[i][j] = '4';
	    break;
	case '4':
	    matrix[i][j] = '5';
	    break;
	case '5':
	    matrix[i][j] = '6';
	    break;
	case '6':
	    matrix[i][j] = '7';
	    break;
	case '7':
	    matrix[i][j] = '8';
	    break;
	case '*':
	    matrix[i][j] = '*';
	    break;
	}
    }
}