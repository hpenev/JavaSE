package boxMan;

import java.util.Random;

public class Player {

    private final char PLAYER_CELL = 'P';
    private int x;
    private int y;
    private Board board;

    Player(Board board) {
	this.board = board;
	this.placePlayer(board);
    }

    private boolean canPlayerMoveDown() {
	if (this.x == this.getBoard().getSize() - 1) {
	    System.out.println("Player cannot move down");
	    return false;
	}
	if (this.getBoard().getCell(x + 1, y) == Board.BUSH_CELL) {
	    System.out.println("Player cannot move down because of the bush");
	    return false;
	}
	if (this.getBoard().getCell(x + 1, y) == Board.EXIT_CELL) {
	    System.out.println("Player cannot move down because of the Exit");
	    return false;
	}
	if (this.getBoard().getCell(x + 1, y) == Box.BOX_CELL) {
	    if (this.getBoard().getBox().canBoxMoveDown()) {
		return true;
	    } else {
		return false;
	    }
	}
	return true;
    }

    private boolean canPlayerMoveLeft() {
	if (this.y == 0) {
	    System.out.println("Player cannot move left");
	    return false;
	}
	if (this.getBoard().getCell(x, y - 1) == Board.BUSH_CELL) {
	    System.out.println("Player cannot move left because of the bush");
	    return false;
	}
	if (this.getBoard().getCell(x, y - 1) == Board.EXIT_CELL) {
	    System.out.println("Player cannot move left because of the Exit");
	    return false;
	}
	if (this.getBoard().getCell(x, y - 1) == Box.BOX_CELL) {
	    if (this.getBoard().getBox().canBoxMoveLeft()) {
		return true;
	    } else {
		return false;
	    }
	}
	return true;
    }

    private boolean canPlayerMoveRight() {
	if (this.y == this.getBoard().getSize() - 1) {
	    System.out.println("Player cannot move right");
	    return false;
	}
	if (this.getBoard().getCell(x, y + 1) == Board.BUSH_CELL) {
	    System.out.println("Player cannot move right because of the bush");
	    return false;
	}
	if (this.getBoard().getCell(x, y + 1) == Board.EXIT_CELL) {
	    System.out.println("Player cannot move right because of the Exit");
	    return false;
	}
	if (this.getBoard().getCell(x, y + 1) == Box.BOX_CELL) {
	    if (this.getBoard().getBox().canBoxMoveRight()) {
		return true;
	    } else {
		return false;
	    }
	}
	return true;
    }

    private boolean canPlayerMoveUp() {
	if (this.x == 0) {
	    System.out.println("Player cannot move up");
	    return false;
	}
	if (this.getBoard().getCell(x - 1, y) == Board.BUSH_CELL) {
	    System.out.println("Player cannot move up because of the bush");
	    return false;
	}
	if (this.getBoard().getCell(x - 1, y) == Board.EXIT_CELL) {
	    System.out.println("Player cannot move up because of the Exit");
	    return false;
	}

	if (this.getBoard().getCell(x - 1, y) == Box.BOX_CELL) {
	    if (this.getBoard().getBox().canBoxMoveUp()) {
		return true;
	    } else {
		return false;
	    }
	}
	return true;
    }

    Board getBoard() {
	return board;
    }

    public void goDown() {
	if (this.canPlayerMoveDown()) {
	    if (this.board.hasBox(x + 1, y)) {
		this.board.getBox().goDown();
	    }
	    movePlayerDown();
	}
    }

    public void goLeft() {
	if (this.canPlayerMoveLeft()) {
	    if (this.board.hasBox(x, y - 1)) {
		this.board.getBox().goLeft();
	    }
	    movePlayerLeft();
	}
    }

    public void goRight() {
	if (this.canPlayerMoveRight()) {
	    if (this.board.hasBox(x, y + 1)) {
		this.board.getBox().goRight();
	    }
	    this.movePlayerRight();
	}
    }

    public void goUp() {
	if (this.canPlayerMoveUp()) {
	    if (this.board.hasBox(x - 1, y)) {
		this.board.getBox().goUp();
	    }
	    movePlayerUp();
	}
    }

    private void movePlayerDown() {
	this.getBoard().setCell(x, y, Board.EMPTY_CELL);
	this.x++;
	this.getBoard().setCell(x, y, PLAYER_CELL);
    }

    private void movePlayerLeft() {
	this.getBoard().setCell(x, y, Board.EMPTY_CELL);
	this.y--;
	this.getBoard().setCell(x, y, PLAYER_CELL);
    }

    private void movePlayerRight() {
	this.getBoard().setCell(x, y, Board.EMPTY_CELL);
	this.y++;
	this.getBoard().setCell(x, y, PLAYER_CELL);
    }

    private void movePlayerUp() {
	this.getBoard().setCell(x, y, Board.EMPTY_CELL);
	this.x--;
	this.getBoard().setCell(x, y, PLAYER_CELL);
    }

    private void placePlayer(Board board) {
	Random random = new Random();
	int x, y = 0;
	do {
	    x = random.nextInt(board.getSize());
	    y = random.nextInt(board.getSize());
	    if (board.getCell(x, y) == Board.EMPTY_CELL) {
		break;
	    }
	} while (true);
	this.setCoordinates(x, y);
    }

    void setCoordinates(int x, int y) {
	this.getBoard().setCell(x, y, PLAYER_CELL);
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
