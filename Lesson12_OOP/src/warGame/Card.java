package warGame;

import java.util.Random;

public class Card {
    private char weight;
    private char suit;

    public Card(char suit, char weight) {
	this.suit = suit;
	this.weight = weight;
    }

    char getSuit() {
	return suit;
    }

    char getWeight() {
	return weight;
    }

    void printCard() {
	System.out.println(this.getWeight() + "" + this.getSuit());
    }

    boolean isStronger(Card c) {
	String strength = new String(Deck.deckStrength);

	int thisStrengthIndex = strength.indexOf(this.getWeight());
	int otherStrengthIndex = strength.indexOf(c.getWeight());

	if (thisStrengthIndex > otherStrengthIndex) {
	    return true;
	}

	if (thisStrengthIndex < otherStrengthIndex) {
	    return false;
	}

	return false;
    }

    static void mixCards(Card[] cards) {
	Random random = new Random();
	for (int i = 0; i < cards.length; i++) {
	    int randomPos = random.nextInt(cards.length);
	    Card temp = cards[i];
	    cards[i] = cards[randomPos];
	    cards[randomPos] = temp;
	}
    }

    static void printCards(Player p1, Player p2) {

	Card[] p1Cards = p1.getCards();
	System.out.print(p1.getName() + " cards: ");
	for (int i = 0; i < p1Cards.length; i++) {
	    System.out.print(p1Cards[i].getWeight());
	    System.out.print(p1Cards[i].getSuit());
	    System.out.print(" ");
	}
	System.out.println();

	Card[] p2Cards = p2.getCards();
	System.out.print(p2.getName() + " cards: ");
	for (int i = 0; i < p2Cards.length; i++) {
	    System.out.print(p2Cards[i].getWeight());
	    System.out.print(p2Cards[i].getSuit());
	    System.out.print(" ");
	}
	System.out.println();
    }
}
