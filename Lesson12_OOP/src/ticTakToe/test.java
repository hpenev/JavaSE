package ticTakToe;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	String name1;
	String name2;
	Player p1;
	Player p2;

	do {
	    System.out.print("Player 1: ");
	    name1 = sc.nextLine();
	    if (name1.isEmpty() || name1 == null) {
		System.out.println("Invalid name " + name1);
	    } else {
		p1 = new Player(name1);
		break;
	    }
	} while (true);

	do {
	    System.out.print("Player 2: ");
	    name2 = sc.nextLine();
	    if (name2.isEmpty() || name2 == null) {
		System.out.println("Invalid name " + name2);
	    } else {
		p2 = new Player(name2);
		break;
	    }
	} while (true);

	p1.setOpponent(p2);
	p2.setOpponent(p1);

	char symbol1;
	do {
	    System.out.printf("%s symbol: ", p1.getName());
	    symbol1 = sc.nextLine().charAt(0);
	    System.out.println(symbol1);

	    if (symbol1 == 'X' || symbol1 == 'O') {
		if (p1.setSymbol(symbol1)) {
		    break;
		}
	    } else {
		System.out.println("Invalid symbol");
	    }
	} while (true);

	char symbol2;
	do {
	    System.out.printf("%s symbol: ", p2.getName());
	    symbol2 = sc.nextLine().charAt(0);
	    if (symbol2 == 'X' || symbol2 == 'O') {
		if (p2.setSymbol(symbol2)) {
		    break;
		}
	    } else {
		System.out.println("Invalid symbol");
	    }
	} while (true);

	Desk desk = new Desk();
	p1.setDesk(desk);
	p2.setDesk(desk);
	desk.printDesk();

	int i, j;
	while (true) {
	    do {
		System.out.printf("%s draw %s at coordinates: ", p1.getName(), p1.getSymbol());
		i = sc.nextInt();
		j = sc.nextInt();
		if (i >= 0 && i < 3) {
		    break;
		}
	    } while (true);

	    p1.drawSymbolAt(i, j);
	    desk.printDesk();
	    if (p1.isWinner()) {
		System.out.printf("%s Wins", p2.getName());
		break;
	    }
	    if (desk.isDeskFull()) {
		System.out.println("No one wins");
		break;
	    }
	    do {
		System.out.printf("%s draw %s at coordinates: ", p2.getName(), p2.getSymbol());
		i = sc.nextInt();
		j = sc.nextInt();
		if (i >= 0 && i < 3) {
		    break;
		}
	    } while (true);

	    p2.drawSymbolAt(i, j);
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
}
