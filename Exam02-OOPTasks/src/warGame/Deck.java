package warGame;

import java.util.Random;

public class Deck {

    static final char[] deckSuits = { '\u2663', '\u2666', '\u2665', '\u2660' };
    static final char[] deckStrength = { '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A' };

    private Card[] deck;

    public Deck() {
	this.deck = createCardDeck();
	this.mixDeck();
	this.mixDeck();
	this.mixDeck();
    }

    private Card[] createCardDeck() {
	this.deck = new Card[52];

	for (int i = 0; i < 52; i++) {
	    char suit = Deck.deckSuits[i % 4];
	    char weight = Deck.deckStrength[i % 13];

	    Card card = new Card(suit, weight);
	    deck[i] = card;
	}

	return this.deck;
    }

    void dealingCards(Player p1, Player p2) {
	for (int i = 0; i < deck.length; i += 2) {
	    p1.addCard(deck[i]);
	    p2.addCard(deck[i + 1]);
	}
    }

    private void mixDeck() {
	Random random = new Random();
	for (int i = 0; i < this.deck.length; i++) {
	    int randomPos = random.nextInt(52);
	    Card temp = this.deck[i];
	    this.deck[i] = this.deck[randomPos];
	    this.deck[randomPos] = temp;
	}
    }

    void printDeck() {
	for (int i = 0; i < this.deck.length; i++) {
	    System.out.print(this.deck[i].getWeight());
	    System.out.print(this.deck[i].getSuit());
	    System.out.print(" ");
	}
	System.out.println();
    }

}
