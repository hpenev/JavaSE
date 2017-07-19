package boxMan;

import java.util.Random;

public class Board {
    static boolean hasWinner = false;
    static boolean pat = false;
    private char[][] gameBoard;
    static final char EMPTY_CELL = ' ';
    static final char BUSH_CELL = '*';
    static final char EXIT_CELL = 'E';
    private Player player;
    private Box box;

    Player getPlayer() {
	return player;
    }

    Board() {
	CreateBoard();
	placeSomeBushes();
	placeExit();
	this.box = new Box(this);
	placeBox(box);
    }

    int getSize() {
	return this.gameBoard.length;
    }

    char getCell(int x, int y) {
	return this.gameBoard[x][y];
    }

    Box getBox() {
	return box;
    }

    private void placeBox(Box box) {
	Random random = new Random();
	int x, y = 0;
	do {
	    x = random.nextInt(this.gameBoard.length - 2) + 1;
	    y = random.nextInt(this.gameBoard.length - 2) + 1;

	    if (this.gameBoard[x][y] == EMPTY_CELL) {
		break;
	    }
	} while (true);
	box.setCoordinates(x, y);
    }

    void setCell(int x, int y, char symbol) {
	this.gameBoard[x][y] = symbol;
    }

    void printBoard() {
	System.out.println(repeatChar('-', 2 * this.gameBoard.length + 1));
	for (int i = 0; i < this.gameBoard.length; i++) {
	    System.out.print('|');
	    for (int j = 0; j < this.gameBoard[i].length; j++) {
		System.out.print(this.gameBoard[i][j]);
		System.out.print('|');
	    }
	    System.out.println();
	}
	System.out.println(repeatChar('-', 2 * this.gameBoard.length + 1));
    }

    private void CreateBoard() {
	Random random = new Random();
	int size = random.nextInt(5) + 5;
	this.gameBoard = new char[size][size];
	fillBoard();
    }

    private void fillBoard() {

	for (int i = 0; i < this.gameBoard.length; i++) {
	    for (int j = 0; j < this.gameBoard[i].length; j++) {
		this.gameBoard[i][j] = EMPTY_CELL;
	    }
	}
    }

    private String repeatChar(char ch, int count) {
	StringBuilder stringBuilder = new StringBuilder();
	for (int i = 0; i < count; i++) {
	    stringBuilder.append(ch);
	}
	return stringBuilder.toString();
    }

    private void placeSomeBushes() {
	Random random = new Random();
	int countBushes = random.nextInt(10) + 5;

	for (int i = 0; i < countBushes; i++) {
	    do {
		int x = random.nextInt(this.gameBoard.length);
		int y = random.nextInt(this.gameBoard.length);
		if (this.gameBoard[x][y] == EMPTY_CELL) {
		    this.gameBoard[x][y] = BUSH_CELL;
		    break;
		}
	    } while (true);
	}
    }

    boolean hasBush(int x, int y) {
	if (this.getCell(x, y) == Board.BUSH_CELL) {
	    return true;
	} else {
	    return false;
	}
    }

    boolean hasBox(int x, int y) {
	if (this.getCell(x, y) == Box.BOX_CELL) {
	    return true;
	} else {
	    return false;
	}
    }

    private void placeExit() {
	Random random = new Random();
	do {
	    int x = random.nextInt(this.gameBoard.length - 4) + 2;
	    int y = random.nextInt(this.gameBoard.length - 4) + 2;
	    if (this.gameBoard[x][y] == EMPTY_CELL) {
		if ((this.gameBoard[x][y + 1] == EMPTY_CELL && this.gameBoard[x][y + 2] == EMPTY_CELL) ||
			(this.gameBoard[x][y - 1] == EMPTY_CELL && this.gameBoard[x][y - 2] == EMPTY_CELL) ||
			(this.gameBoard[x + 1][y] == EMPTY_CELL && this.gameBoard[x + 2][y] == EMPTY_CELL) ||
			(this.gameBoard[x - 1][y] == EMPTY_CELL && this.gameBoard[x - 2][y] == EMPTY_CELL)) {
		    this.gameBoard[x][y] = EXIT_CELL;
		    break;
		}
	    }
	} while (true);

    }
}
