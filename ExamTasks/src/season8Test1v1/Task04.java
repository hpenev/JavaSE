package season8Test1v1;

public class Task04 {
    public static void main(String[] args) {
	int[][] sudoku = {
		{ 1, 8, 7, 4, 9, 2, 5, 6, 3 },
		{ 5, 3, 4, 6, 7, 8, 9, 1, 2 },
		{ 9, 6, 2, 1, 3, 5, 7, 8, 4 },
		{ 4, 5, 8, 2, 1, 6, 3, 9, 7 },
		{ 2, 7, 3, 8, 4, 9, 6, 5, 1 },
		{ 6, 1, 9, 3, 5, 7, 4, 2, 8 },
		{ 8, 4, 1, 9, 6, 3, 2, 7, 5 },
		{ 7, 2, 6, 5, 8, 4, 1, 3, 9 },
		{ 3, 9, 5, 7, 2, 1, 8, 4, 6 },
	};

	boolean checkRows = rowCheck(sudoku);
	boolean checkSubMatrix = subMatrixCheck(sudoku);
	boolean checkCols = colCheck(sudoku);

	if (checkSubMatrix && checkRows && checkCols) {
	    System.out.println("sudoku is OK");
	} else {
	    System.out.println("sudoku is NOT ok");
	}

    }

    static boolean subMatrixCheck(int[][] sudoku) {
	for (int i = 0; i < sudoku.length - 1; i++) {
	    for (int j = 0; j < sudoku.length - 1; j++) {
		if (i % 3 == 0 && j % 3 == 0) {
		    int[] subMatrix = {
			    sudoku[i][j], sudoku[i][j + 1], sudoku[i][j + 2],
			    sudoku[i + 1][j], sudoku[i + 1][j + 1], sudoku[i + 1][j + 2],
			    sudoku[i + 2][j], sudoku[i + 2][j + 1], sudoku[i + 2][j + 2] };

		    if (!hasNums1to9(subMatrix) || !hasUniqueNums(subMatrix)) {
			return false;
		    }
		}
	    }
	}
	return true;
    }

    static boolean colCheck(int[][] sudoku) {
	for (int i = 0; i < sudoku.length; i++) {
	    int[] col = new int[sudoku.length];

	    for (int j = 0; j < sudoku.length; j++) {
		col[j] = sudoku[j][i];
	    }

	    if (!hasNums1to9(col) || !hasUniqueNums(col)) {
		return false;
	    }
	}
	return true;
    }

    static boolean rowCheck(int[][] sudoku) {
	for (int i = 0; i < sudoku.length; i++) {
	    if (!hasNums1to9(sudoku[i]) || !hasUniqueNums(sudoku[i])) {
		return false;
	    }
	}
	return true;
    }

    static boolean hasNums1to9(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] < 1 && arr[i] > 9) {
		return false;
	    }
	}
	return true;
    }

    static boolean hasUniqueNums(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    for (int j = i + 1; j < arr.length; j++) {
		if (arr[i] == arr[j]) {
		    return false;
		}
	    }
	}
	return true;
    }

}
