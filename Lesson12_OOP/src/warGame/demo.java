package warGame;

public class demo {

    static int round = 1;

    public static void main(String[] args) {
	Deck playingDeck = new Deck();

	Player p1 = new Player("Pesho");
	Player p2 = new Player("Gosho");

	playingDeck.dealingCards(p1, p2);

	boolean hasWinner = false;
	while (true) {
	    System.out.println(Game.delimiter("-", 60, "Round:" + round++));

	    if (round > 1000) {
		System.out.println("Players are mixing their cards");
		Card.mixCards(p1.getCards());
		Card.mixCards(p2.getCards());
	    }

	    Card.printCards(p1, p2);

	    hasWinner = Game.battle(p1, p2);

	    if (hasWinner) {
		break;
	    }

	    Card.printCards(p1, p2);
	}
    }

}
