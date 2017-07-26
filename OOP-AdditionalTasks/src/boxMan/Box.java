package boxMan;

public class Box {
    static final char BOX_CELL = 'O';
    private int x;
    private int y;
    private Board board;

    Box(Board board) {
	this.board = board;
    }

    boolean canBoxMoveDown() {
	if (this.x == this.board.getSize() - 1) {
	    return false;
	}

	if (this.board.hasBush(x + 1, y)) {
	    return false;
	}
	return true;
    }

    boolean canBoxMoveLeft() {
	if (this.y == 0) {
	    return false;
	}

	if (this.board.hasBush(x, y - 1)) {
	    return false;
	}
	return true;
    }

    boolean canBoxMoveRight() {
	if (this.y == this.board.getSize() - 1) {
	    return false;
	}

	if (this.board.hasBush(x, y + 1)) {
	    return false;
	}
	return true;
    }

    boolean canBoxMoveUp() {
	if (this.x == 0) {
	    return false;
	}

	if (this.board.hasBush(x - 1, y)) {
	    return false;
	}
	return true;
    }

    boolean canMoveBox() {
	if (!canBoxMoveUp() && !canBoxMoveLeft()) {
	    return false;
	}
	if (!canBoxMoveUp() && !canBoxMoveRight()) {
	    return false;
	}
	if (!canBoxMoveDown() && !canBoxMoveLeft()) {
	    return false;
	}
	if (!canBoxMoveDown() && !canBoxMoveRight()) {
	    return false;
	}
	return true;

    }

    Board getBoard() {
	return board;
    }

    boolean hasExit(int x, int y) {
	if (this.getBoard().getCell(x, y) == Board.EXIT_CELL) {
	    System.out.println("Congratulations");
	    return true;
	} else {
	    return false;
	}
    }

    void goDown() {
	if (!canMoveBox()) {
	    Board.pat = true;
	}
	if (hasExit(x + 1, y)) {
	    Board.hasWinner = true;
	}
	if (this.canBoxMoveDown()) {
	    moveDown();
	}
    }

    void goLeft() {
	if (!canMoveBox()) {
	    Board.pat = true;
	}
	if (hasExit(x, y - 1)) {
	    Board.hasWinner = true;
	}
	if (this.canBoxMoveLeft()) {
	    this.moveLeft();
	}
    }

    void goRight() {
	if (!canMoveBox()) {
	    Board.pat = true;
	}
	if (hasExit(x, y + 1)) {
	    Board.hasWinner = true;
	}
	if (this.canBoxMoveRight()) {
	    moveRight();
	}
    }

    void goUp() {
	if (!canMoveBox()) {
	    Board.pat = true;
	}
	if (hasExit(x - 1, y)) {
	    Board.hasWinner = true;
	}
	if (this.canBoxMoveUp()) {
	    moveUp();
	}
    }

    boolean haveWinner() {
	return true;
    }

    private void moveDown() {
	this.getBoard().setCell(x, y, Board.EMPTY_CELL);
	this.x++;
	this.getBoard().setCell(x, y, BOX_CELL);
    }

    private void moveLeft() {
	this.getBoard().setCell(x, y, Board.EMPTY_CELL);
	this.y--;
	this.getBoard().setCell(x, y, BOX_CELL);
    }

    private void moveRight() {
	this.getBoard().setCell(x, y, Board.EMPTY_CELL);
	this.y++;
	this.getBoard().setCell(x, y, BOX_CELL);
    }

    private void moveUp() {
	this.getBoard().setCell(x, y, Board.EMPTY_CELL);
	this.x--;
	this.getBoard().setCell(x, y, BOX_CELL);
    }

    void setCoordinates(int x, int y) {
	this.getBoard().setCell(x, y, BOX_CELL);
	setX(x);
	setY(y);
    }

    void setX(int x) {
	this.x = x;
    }

    void setY(int y) {
	this.y = y;
    }
}
