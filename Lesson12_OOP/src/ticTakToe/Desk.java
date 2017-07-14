package ticTakToe;

public class Desk {
    private char[][] desk = {
	    { ' ', ' ', ' ' },
	    { ' ', ' ', ' ' },
	    { ' ', ' ', ' ' }
    };

    Desk() {

    }

    void writeMarkOnDesk(int i, int j, char symbol) {

	if (i >= 0 && i < this.desk.length && j >= 0 && j < this.desk.length) {
	    if (this.desk[i][j] == ' ') {
		this.desk[i][j] = symbol;
		System.out.println("Symbol Set");
	    }
	} else {
	    System.out.println("invalid coordinate");
	}
    }

    void printDesk() {
	for (int i = 0; i < desk.length; i++) {
	    for (int j = 0; j < desk.length; j++) {
		if (j == desk.length - 1) {
		    System.out.print(this.desk[i][j]);
		} else {
		    System.out.print(this.desk[i][j] + "║");
		}
	    }
	    if (i != desk.length - 1) {
		System.out.println();
		System.out.println("═╬═╬═");
	    }
	}
	System.out.println();
    }

    boolean isDeskFull() {
	for (int i = 0; i < this.desk.length; i++) {
	    for (int j = 0; j < this.desk.length; j++) {
		if (this.desk[i][j] == ' ') {
		    return false;
		}
	    }
	}
	return true;
    }

    boolean hasWinner() {
	boolean row = true;
	boolean col = true;
	boolean mainDiagonal = true;
	boolean secDiagonal = true;

	// row
	for (int i = 0; i < this.desk.length; i++) {
	    for (int j = 0; j < this.desk.length - 1; j++) {
		if (this.desk[i][j] != this.desk[i][j + 1]) {
		    row = false;
		    break;
		}
	    }
	    if (row && this.desk[i][0] != ' ') {
		return true;
	    }
	}

	// col
	for (int i = 0; i < this.desk.length; i++) {
	    for (int j = 0; j < this.desk.length - 1; j++) {
		if (this.desk[j][i] != this.desk[j + 1][i]) {
		    col = false;
		}
	    }
	    if (col && this.desk[0][i] != ' ') {
		return true;
	    }
	}

	// main diag
	for (int i = 0; i < this.desk.length; i++) {
	    for (int j = 0; j < this.desk.length - 1; j++) {
		if (i == j) {
		    if (this.desk[i][j] != this.desk[i + 1][j + 1]) {
			mainDiagonal = false;
		    }
		}
	    }
	    if (mainDiagonal && this.desk[i][i] != ' ') {
		return true;
	    }
	}
	// sec diagonal
	for (int i = 0; i < this.desk.length - 1; i++) {
	    for (int j = 1; j < this.desk.length; j++) {
		if (i + j == this.desk.length - 1) {
		    if (this.desk[i][j] != this.desk[i + 1][j - 1]) {
			secDiagonal = false;
		    }
		}
	    }
	    if (secDiagonal && this.desk[i][this.desk.length - i - 1] != ' ') {
		return true;
	    }
	}

	return false;
    }
}
