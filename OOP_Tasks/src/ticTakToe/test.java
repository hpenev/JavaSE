package ticTakToe;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
	Player p1 = new Player("Pesho");
	Player p2 = new Player("Gosho");

	// setPlayerName(p1);
	// setPlayerName(p2);

	p1.setOpponent(p2);
	p2.setOpponent(p1);

	setSymbolForPlayer(p1);
	setSymbolForPlayer(p2);

	Desk desk = new Desk();
	p1.setDesk(desk);
	p2.setDesk(desk);
	desk.printDesk();

	int turn = 1;

	while (true) {
	    System.out.println("--------- Turn: " + turn++ + "---------");

	    playerDrawSymbolAtCoordinates(p1);
	    desk.printDesk();

	    if (p1.isWinner()) {
		System.out.printf("%s Wins", p2.getName());
		break;
	    }
	    if (desk.isDeskFull()) {
		System.out.println("No one wins");
		break;
	    }

	    System.out.println("--------- Turn: " + turn++ + "---------");
	    playerDrawSymbolAtCoordinates(p2);
	    desk.printDesk();

	    if (p2.isWinner()) {
		System.out.printf("%s Wins", p2.getName());
		break;
	    }
	    if (desk.isDeskFull()) {
		System.out.println("No one wins");
		break;
	    }
	}
    }

    private static void playerDrawSymbolAtCoordinates(Player p) {
	Scanner sc = new Scanner(System.in);
	int i, j;
	do {
	    System.out.printf("%s draw %s at coordinates: ", p.getName(), p.getSymbol());
	    i = sc.nextInt();
	    j = sc.nextInt();
	    if (i >= 0 && i < 3) {
		break;
	    }
	} while (true);
	p.drawSymbolAt(i, j);
    }

    private static void setSymbolForPlayer(Player p1) {
	Scanner sc = new Scanner(System.in);
	char symbol1;
	do {
	    System.out.printf("%s symbol: ", p1.getName());
	    symbol1 = sc.nextLine().charAt(0);
	    if (p1.setSymbol(symbol1)) {
		break;
	    } else {
		System.out.println("Invalid symbol");
	    }
	} while (true);
    }

    private static void setPlayerName(Player p) {
	Scanner sc = new Scanner(System.in);
	do {
	    System.out.print("Player name: ");
	    String name = sc.nextLine();

	    if (p.setName(name)) {
		break;
	    } else {
		System.out.println("Invalid name " + name);
	    }
	} while (true);
    }
}
