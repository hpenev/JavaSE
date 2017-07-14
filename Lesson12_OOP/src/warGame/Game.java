package warGame;

public class Game {
    private Card[] deck;

    public Game() {

    }

    Card[] createCardDeck() {
	this.deck = new Card[52];

	char[] suits = { '\u2660', '\u2665', '\u2666', '\u2663' };
	char[] weights = { '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A' };

	for (int i = 0; i < 52; i++) {
	    char suit = suits[i % 4];
	    char weight = weights[i % 13];

	    Card card = new Card(suit, weight);
	    deck[i] = card;
	}

	return this.deck;
    }

    void printDeck(Card[] deck) {
	for (int i = 0; i < deck.length; i++) {
	    System.out.print(deck[i].getWeight());
	    System.out.print(deck[i].getSuit());
	    System.out.print(" ");
	}
    }
}
