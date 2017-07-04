package season5Test1v1;

public class Task04_v1 {
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

	color(matrix1, x1, y1);
	printMatrix(matrix1);

    }

    static void printMatrix(char[][] matrix) {
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix[i].length; j++) {
		System.out.print(matrix[i][j] + " ");
	    }
	    System.out.println();
	}
    }

    static void color(char[][] arr, int x, int y) {

	int i = x;
	int j = y;

	// current
	if (isInArray(arr, i, j) && isUnpainted(arr, i, j)) {
	    arr[x][y] = 'r';
	} else {
	    return;
	}

	// down
	i = x + 1;
	j = y;
	if (isInArray(arr, i, j) && isUnpainted(arr, i, j)) {
	    color(arr, i, j);
	}

	// down left
	i = x + 1;
	j = y - 1;
	if (isInArray(arr, i, j) && isUnpainted(arr, i, j)) {
	    color(arr, i, j);
	}

	// down right
	i = x + 1;
	j = y + 1;
	if (isInArray(arr, i, j) && isUnpainted(arr, i, j)) {
	    color(arr, i, j);
	}

	// left
	i = x;
	j = y - 1;
	if (isInArray(arr, i, j) && isUnpainted(arr, i, j)) {
	    color(arr, i, j);
	}

	// right
	i = x;
	j = y + 1;
	if (isInArray(arr, i, j) && isUnpainted(arr, i, j)) {
	    color(arr, i, j);
	}

	// up
	i = x - 1;
	j = y;
	if (isInArray(arr, i, j) && isUnpainted(arr, i, j)) {
	    color(arr, i, j);
	}

	// up left
	i = x - 1;
	j = y - 1;
	if (isInArray(arr, i, j) && isUnpainted(arr, i, j)) {
	    color(arr, i, j);
	}

	// up right
	i = x - 1;
	j = y + 1;
	if (isInArray(arr, i, j) && isUnpainted(arr, i, j)) {
	    color(arr, i, j);
	}

    }

    static boolean isInArray(char[][] arr, int i, int j) {
	if (i >= 0 && i < arr.length && j >= 0 && j < arr.length) {
	    return true;
	} else {
	    return false;
	}
    }

    static boolean isUnpainted(char[][] arr, int i, int j) {
	if (arr[i][j] != 'b' && arr[i][j] != 'r') {
	    return true;
	} else {
	    return false;
	}
    }
}
