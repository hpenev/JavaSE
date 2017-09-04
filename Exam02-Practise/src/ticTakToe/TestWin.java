package ticTakToe;

public class TestWin {
    public static void main(String[] args) {
	Desk desk = new Desk();
	desk.writeMarkOnDesk(0, 2, 'X');
	desk.writeMarkOnDesk(1, 2, 'X');
	desk.writeMarkOnDesk(2, 2, 'X');

	System.out.println(desk.hasWinner());

    }
}
