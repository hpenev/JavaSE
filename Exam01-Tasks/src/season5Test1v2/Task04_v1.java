package season5Test1v2;

public class Task04_v1 {
    public static void main(String[] args) {
	char[][] matrix = {
		{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
		{ ' ', '*', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ' },
		{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ' },
		{ ' ', ' ', ' ', '*', '*', ' ', ' ', '*', ' ', ' ' },
		{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
		{ ' ', ' ', ' ', ' ', ' ', '*', ' ', '*', ' ', ' ' },
		{ ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ', ' ' },
		{ ' ', ' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' ' },
		{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
		{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
	};
	mines(matrix, 0, 0);
	print(matrix);
    }

    static void print(char[][] arr) {
	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr.length; j++) {
		System.out.print(arr[i][j] + " ");
	    }
	    System.out.println();
	}
    }

    static void mines(char[][] arr, int x, int y) {
	if (arr[x][y] == '*') {
	    int i = 0;
	    int j = 0;

	    // up
	    i = x - 1;
	    j = y;
	    if (isInArray(arr, i, j) && !isMine(arr, i, j)) {
		fillMines(arr, i, j);
	    }

	    // up left
	    i = x - 1;
	    j = y + 1;
	    if (isInArray(arr, i, j) && !isMine(arr, i, j)) {
		fillMines(arr, i, j);
	    }

	    // up right
	    i = x - 1;
	    j = y - 1;
	    if (isInArray(arr, i, j) && !isMine(arr, i, j)) {
		fillMines(arr, i, j);
	    }

	    // right
	    i = x;
	    j = y - 1;
	    if (isInArray(arr, i, j) && !isMine(arr, i, j)) {
		fillMines(arr, i, j);
	    }

	    // left
	    i = x;
	    j = y + 1;
	    if (isInArray(arr, i, j) && !isMine(arr, i, j)) {
		fillMines(arr, i, j);
	    }

	    // down
	    i = x + 1;
	    j = y;
	    if (isInArray(arr, i, j) && !isMine(arr, i, j)) {
		fillMines(arr, i, j);
	    }

	    // down left
	    i = x + 1;
	    j = y - 1;
	    if (isInArray(arr, i, j) && !isMine(arr, i, j)) {
		fillMines(arr, i, j);
	    }

	    // down right
	    i = x + 1;
	    j = y + 1;
	    if (isInArray(arr, i, j) && !isMine(arr, i, j)) {
		fillMines(arr, i, j);
	    }
	}

	if (x == arr.length - 1 && y == arr.length - 1) {
	    return;
	}

	if (y == arr.length - 1) {
	    x++;
	    y = -1;
	}

	mines(arr, x, y + 1);
    }

    static boolean isMine(char[][] arr, int i, int j) {
	if (arr[i][j] == '*') {
	    return true;
	} else {
	    return false;
	}
    }

    static void fillMines(char[][] arr, int i, int j) {
	if (arr[i][j] == ' ') {
	    arr[i][j] = '1';
	} else {
	    arr[i][j] += 1;
	}
    }

    static boolean isInArray(char[][] arr, int i, int j) {
	if (i >= 0 && i < arr.length && j >= 0 && j < arr.length) {
	    return true;
	} else {
	    return false;
	}
    }
}
