
public class chess {
    public static void main(String[] args) {
	// p - peshka
	// k - kon
	// c - car

	char[][] desk = {
		{ '_', '_', '_', '_', '_', '_', '_', '_' },
		{ '_', 'p', '_', '_', '_', '_', '_', '_' },
		{ '_', '_', '_', '_', '_', '_', '_', '_' },
		{ '_', '_', '_', 'p', '_', '_', '_', '_' },
		{ '_', '_', '_', '_', 'c', '_', '_', '_' },
		{ '_', 'p', '_', '_', '_', '_', '_', '_' },
		{ '_', '_', '_', 'k', '_', '_', '_', '_' },
		{ '_', '_', '_', '_', '_', '_', '_', '_' },
	};

	boolean shah = horseToKing(desk, 0, 0);

	System.out.println(shah);

    }

    static boolean horseToKing(char[][] desk, int i, int j) {
	if (desk[i][j] == 'k') {

	    int x = 0;
	    int y = 0;

	    // up left
	    x = i - 2;
	    y = j - 1;
	    if (isInDesk(desk, x, y)) {
		if (hasKingInCell(desk, x, y)) {
		    return true;
		}
	    }

	    // up right
	    x = i - 2;
	    y = j + 1;
	    if (isInDesk(desk, x, y)) {
		if (hasKingInCell(desk, x, y)) {
		    return true;
		}
	    }

	    // left up
	    x = i - 1;
	    y = j - 2;
	    if (isInDesk(desk, x, y)) {
		if (hasKingInCell(desk, x, y)) {
		    return true;
		}
	    }

	    // left down
	    x = i + 1;
	    y = j - 2;
	    if (isInDesk(desk, x, y)) {
		if (hasKingInCell(desk, x, y)) {
		    return true;
		}
	    }

	    // down left
	    x = i + 2;
	    y = j - 1;
	    if (isInDesk(desk, x, y)) {
		if (hasKingInCell(desk, x, y)) {
		    return true;
		}
	    }

	    // down right
	    x = i + 2;
	    y = j + 1;
	    if (isInDesk(desk, x, y)) {
		if (hasKingInCell(desk, x, y)) {
		    return true;
		}
	    }

	    // right down
	    x = i + 1;
	    y = j + 2;
	    if (isInDesk(desk, x, y)) {
		if (hasKingInCell(desk, x, y)) {
		    return true;
		}
	    }

	    // right up
	    x = i - 1;
	    y = j + 2;
	    if (isInDesk(desk, x, y)) {
		if (hasKingInCell(desk, x, y)) {
		    return true;
		}
	    }
	}

	// check each cell
	if (j == desk.length - 1 && i == desk.length - 1) {
	    return false;
	}

	if (j == desk.length - 1) {
	    i++;
	    j = -1;
	}
	return horseToKing(desk, i, j + 1);
    }

    static boolean isInDesk(char[][] desk, int i, int j) {
	if (i >= 0 && i <= desk.length - 1 && j >= 0 && j <= desk.length - 1) {
	    return true;
	} else {
	    return false;
	}
    }

    static boolean hasKingInCell(char[][] desk, int i, int j) {
	if (desk[i][j] == 'c') {
	    return true;
	} else {
	    return false;
	}
    }
}
