
public class chess_v1 {
    public static void main(String[] args) {
	char[][] desk = {
		{ '_', '_', '_', '_', '_', '_', '_', '_' },
		{ '_', 'p', '_', '_', '_', '_', '_', '_' },
		{ '_', '_', '_', '_', '_', '_', '_', '_' },
		{ '_', '_', '_', 'p', '_', '_', '_', '_' },
		{ '_', '_', '_', '_', '_', '_', '_', '_' },
		{ '_', 'p', '_', '_', '_', '_', 'k', '_' },
		{ '_', '_', '_', '_', '_', '_', '_', '_' },
		{ '_', '_', '_', '_', '_', '_', '_', 'h' },
	};

	System.out.println(horseToKing(desk, 0, 0));

    }

    static boolean horseToKing(char[][] arr, int i, int j) {
	if (arr[i][j] == 'h') {
	    if (hasKingUpLeft(arr, i, j)) {
		return true;
	    }
	    if (hasKingUpRight(arr, i, j)) {
		return true;
	    }
	    if (hasKingRightUp(arr, i, j)) {
		return true;
	    }
	    if (hasKingRightDown(arr, i, j)) {
		return true;
	    }
	    if (hasKingDownLeft(arr, i, j)) {
		return true;
	    }
	    if (hasKingDownRight(arr, i, j)) {
		return true;
	    }
	    if (hasKingLeftUp(arr, i, j)) {
		return true;
	    }
	    if (hasKingLeftDown(arr, i, j)) {
		return true;
	    }
	}

	if (i == arr.length - 1 && j == arr.length - 1) {
	    return false;
	}

	if (j == arr.length - 1) {
	    j = -1;
	    i++;
	}

	return horseToKing(arr, i, j + 1);
    }

    private static boolean hasKingLeftDown(char[][] arr, int i, int j) {
	int x = i + 1;
	int y = j - 2;

	if (isInArray(arr, x, y) && hasKing(arr, x, y)) {
	    return true;
	} else {
	    return false;
	}
    }

    private static boolean hasKingLeftUp(char[][] arr, int i, int j) {
	int x = i - 1;
	int y = j - 2;

	if (isInArray(arr, x, y) && hasKing(arr, x, y)) {
	    return true;
	} else {
	    return false;
	}
    }

    private static boolean hasKingDownRight(char[][] arr, int i, int j) {
	int x = i + 2;
	int y = j + 1;

	if (isInArray(arr, x, y) && hasKing(arr, x, y)) {
	    return true;
	} else {
	    return false;
	}
    }

    private static boolean hasKingDownLeft(char[][] arr, int i, int j) {
	int x = i + 2;
	int y = j - 1;

	if (isInArray(arr, x, y) && hasKing(arr, x, y)) {
	    return true;
	} else {
	    return false;
	}
    }

    private static boolean hasKingRightDown(char[][] arr, int i, int j) {
	int x = i + 1;
	int y = j + 2;

	if (isInArray(arr, x, y) && hasKing(arr, x, y)) {
	    return true;
	} else {
	    return false;
	}
    }

    private static boolean hasKingRightUp(char[][] arr, int i, int j) {
	int x = i - 1;
	int y = j + 2;

	if (isInArray(arr, x, y) && hasKing(arr, x, y)) {
	    return true;
	} else {
	    return false;
	}
    }

    private static boolean hasKingUpRight(char[][] arr, int i, int j) {
	int x = i - 2;
	int y = j + 1;

	if (isInArray(arr, x, y) && hasKing(arr, x, y)) {
	    return true;
	} else {
	    return false;
	}
    }

    private static boolean hasKingUpLeft(char[][] arr, int i, int j) {
	int x = i - 2;
	int y = j - 1;

	if (isInArray(arr, x, y) && hasKing(arr, x, y)) {
	    return true;
	} else {
	    return false;
	}
    }

    static boolean hasKing(char[][] arr, int i, int j) {
	if (arr[i][j] == 'k') {
	    return true;
	} else {
	    return false;
	}
    }

    static boolean isInArray(char[][] arr, int i, int j) {
	if (i >= 0 && j >= 0 && i <= arr.length - 1 && j <= arr.length - 1) {
	    return true;
	} else {
	    return false;
	}
    }
}
