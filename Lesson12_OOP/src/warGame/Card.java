package warGame;

public class Card {
    private char weight;
    private char suit;

    char getSuit() {
	return suit;
    }

    char getWeight() {
	return weight;
    }

    public Card(char suit, char weight) {
	// TODO: validation
	this.suit = suit;
	this.weight = weight;
    }
}
