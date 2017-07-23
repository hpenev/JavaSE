package boxMan;

import java.util.Scanner;

public class testBoard {
    public static void main(String[] args) {
	Board board = new Board();
	Player player = new Player(board);
	System.out
		.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

	Scanner sc = new Scanner(System.in);
	board.printBoard();
	while (true) {
	    System.out.print("Move player: ");
	    String input = sc.nextLine();
	    if (input == null || input.isEmpty()) {
		continue;
	    }
	    char direction = input.charAt(0);

	    switch (direction) {
	    case 'a':
		player.goLeft();
		break;
	    case 's':
		player.goDown();
		break;
	    case 'd':
		player.goRight();
		break;
	    case 'w':
		player.goUp();
		break;
	    default:
		System.out.println("Invalid key");
		break;
	    }
	    board.printBoard();
	    if (Board.hasWinner || Board.pat) {
		break;
	    }
	}
    }
}
