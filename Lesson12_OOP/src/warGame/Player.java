package warGame;

public class Player {
    private Card[] cards;

    private String name;

    public Player(String name) {
	this.cards = new Card[52];
	if (name != null && !name.isEmpty()) {
	    this.name = name;
	} else {
	    System.out.println("Invalid player name");
	}
    }

    boolean hasCards() {
	for (int i = 0; i < cards.length; i++) {
	    if (cards[i] != null) {
		return true;
	    }
	}
	return false;
    }

    void addCard(Card card) {
	for (int i = 0; i < this.cards.length; i++) {
	    if (this.cards[i] == null) {
		this.cards[i] = card;
		break;
	    }
	}
    }

    Card[] getCards() {
	return cards;
    }

    String getName() {
	return name;
    }

    void printCards() {
	System.out.print(this.getName() + " cards: ");
	for (int i = 0; i < this.cards.length; i++) {
	    if (this.cards[i] != null) {
		System.out.print(this.cards[i].getWeight());
		System.out.print(this.cards[i].getSuit());
		System.out.print(" ");
	    } else {
		continue;
	    }
	}
	System.out.println();
    }

    Card throwCard() {
	Card card = cards[0];
	cards[0] = null;

	for (int i = 0; i < cards.length - 1; i++) {
	    cards[i] = cards[i + 1];
	}
	System.out.print(this.getName() + ": ");
	card.printCard();
	// TODO: get win CARDs and check for WIN
	return card;
    }

    void winHand(Card p1Card, Card p2Card) {
	for (int i = 0; i < cards.length; i++) {
	    if (cards[i] == null) {
		cards[i] = p1Card;
		break;
	    }
	}

	for (int i = 0; i < cards.length; i++) {
	    if (cards[i] == null) {
		cards[i] = p2Card;
		break;
	    }
	}
    }

    void winHand(Card[] cards) {
	int insertIndex = 0;
	for (int i = 0; i < this.cards.length; i++) {
	    if (this.cards[i] == null) {
		insertIndex = i;
		break;
	    }
	}

	for (int i = 0; i < cards.length; i++) {
	    this.cards[insertIndex++] = cards[i];
	}
    }

}
