package ticTakToe;

public class Player {
    private String name;
    private char symbol;
    private Player opponent;
    private Desk desk;

    String getName() {
	return name;
    }

    Desk getDesk() {
	return desk;
    }

    void setDesk(Desk desk) {
	if (desk != null) {
	    this.desk = desk;
	}
    }

    Player(String name) {
	if (name != null && !name.isEmpty()) {
	    this.name = name;
	    System.out.printf("Player %s created!%n", this.name);
	}
    }

    char getSymbol() {
	return symbol;
    }

    void drawSymbolAt(int i, int j) {
	this.desk.writeMarkOnDesk(i, j, this.symbol);
    }

    boolean isWinner() {
	if (this.desk.hasWinner()) {
	    return true;
	}
	return false;
    }

    boolean setSymbol(char mark) {
	if (mark == 'X' || mark == 'O') {
	    if (mark != this.opponent.symbol) {
		this.symbol = mark;
		System.out.printf("%s mark is set to %s%n", this.name, this.symbol);
		return true;
	    }
	    if (mark == this.opponent.symbol) {
		System.out.printf("%s is choosen by %s%n", mark, this.opponent.getName());
		return false;
	    }
	} else {
	    System.out.printf("%s is not valid mark%n", mark);
	    return false;
	}
	return false;
    }

    Player getOpponent() {
	return opponent;
    }

    void setOpponent(Player opponent) {
	if (opponent != null) {
	    this.opponent = opponent;
	    System.out.printf("%s is opponent to %s%n", this.opponent.name, this.name);
	}
    }

}
