
public class chess_v2 {
    public static void main(String[] args) {
	// find if q (Queen) could strike k(King)
	char[][] desk = {
		{ '_', '_', '_', '_', '_', '_', '_', '_' },
		{ '_', '_', '_', '_', '_', '_', '_', '_' },
		{ '_', '_', '_', '_', '_', '_', '_', '_' },
		{ '_', '_', '_', '_', '_', 'k', '_', '_' },
		{ '_', '_', '_', '_', '_', '_', '_', '_' },
		{ '_', '_', '_', '_', '_', '_', 'q', '_' },
		{ '_', '_', '_', '_', '_', '_', '_', '_' },
		{ '_', '_', '_', '_', '_', '_', '_', '_' },
	};

	System.out.println(findQueen(desk, 0, 0));
    }

    static boolean findQueen(char[][] arr, int i, int j) {
	if (arr[i][j] == 'q') {
	    if (hasKingUpleft(arr, i, j)) {
		return true;
	    }
	    if (hasKingUpRight(arr, i, j)) {
		return true;
	    }
	    if (hasKingDownLeft(arr, i, j)) {
		return true;
	    }
	    if (hasKingDownRight(arr, i, j)) {
		return true;
	    }
	    if (hasKingUp(arr, i, j)) {
		return true;
	    }
	    if (hasKingDown(arr, i, j)) {
		return true;
	    }
	    if (hasKingLeft(arr, i, j)) {
		return true;
	    }
	    if (hasKingRight(arr, i, j)) {
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

	return findQueen(arr, i, j + 1);
    }

    static boolean hasKingRight(char[][] arr, int i, int j) {
	int x = 0;
	int y = 0;

	x = i;
	y = j + 1;
	if (isInArray(arr, x, y)) {
	    if (isFree(arr, x, y)) {
		return hasKingRight(arr, x, y);
	    }

	    if (hasKing(arr, x, y)) {
		return true;
	    }
	}
	return false;
    }

    static boolean hasKingLeft(char[][] arr, int i, int j) {
	int x = 0;
	int y = 0;

	x = i;
	y = j - 1;
	if (isInArray(arr, x, y)) {
	    if (isFree(arr, x, y)) {
		return hasKingLeft(arr, x, y);
	    }

	    if (hasKing(arr, x, y)) {
		return true;
	    }
	}
	return false;
    }

    static boolean hasKingUp(char[][] arr, int i, int j) {
	int x = 0;
	int y = 0;

	x = i - 1;
	y = j;
	if (isInArray(arr, x, y)) {
	    if (isFree(arr, x, y)) {
		return hasKingUp(arr, x, y);
	    }

	    if (hasKing(arr, x, y)) {
		return true;
	    }
	}
	return false;
    }

    static boolean hasKingDown(char[][] arr, int i, int j) {
	int x = 0;
	int y = 0;

	x = i + 1;
	y = j;
	if (isInArray(arr, x, y)) {
	    if (isFree(arr, x, y)) {
		return hasKingDown(arr, x, y);
	    }

	    if (hasKing(arr, x, y)) {
		return true;
	    }
	}
	return false;
    }

    static boolean hasKingDownLeft(char[][] arr, int i, int j) {
	int x = 0;
	int y = 0;

	x = i + 1;
	y = j - 1;
	if (isInArray(arr, x, y)) {
	    if (isFree(arr, x, y)) {
		return hasKingDownLeft(arr, x, y);
	    }

	    if (hasKing(arr, x, y)) {
		return true;
	    }
	}
	return false;
    }

    static boolean hasKingDownRight(char[][] arr, int i, int j) {
	int x = 0;
	int y = 0;

	x = i + 1;
	y = j + 1;
	if (isInArray(arr, x, y)) {
	    if (isFree(arr, x, y)) {
		return hasKingDownRight(arr, x, y);
	    }

	    if (hasKing(arr, x, y)) {
		return true;
	    }
	}
	return false;
    }

    static boolean hasKingUpRight(char[][] arr, int i, int j) {
	int x = 0;
	int y = 0;

	x = i - 1;
	y = j + 1;
	if (isInArray(arr, x, y)) {
	    if (isFree(arr, x, y)) {
		return hasKingUpRight(arr, x, y);
	    }

	    if (hasKing(arr, x, y)) {
		return true;
	    }
	}
	return false;
    }

    static boolean hasKingUpleft(char[][] arr, int i, int j) {
	int x = 0;
	int y = 0;

	// upleft
	x = i - 1;
	y = j - 1;
	if (isInArray(arr, x, y)) {
	    if (isFree(arr, x, y)) {
		return hasKingUpleft(arr, x, y);
	    }

	    if (hasKing(arr, x, y)) {
		return true;
	    }
	}
	return false;
    }

    static boolean isFree(char[][] arr, int i, int j) {
	if (arr[i][j] == '_') {
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
