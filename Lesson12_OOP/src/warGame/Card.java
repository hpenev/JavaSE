package warGame;

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

}
