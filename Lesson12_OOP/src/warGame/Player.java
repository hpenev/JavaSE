package warGame;

public class Player {
    private Card[] cards;

    private String name;

    private void setName(String name) {
	if (name != null && !name.isEmpty()) {
	    this.name = name;
	} else {
	    System.out.println("Invalid player name");
	}
    }

    public Player(String name) {
	this.cards = new Card[0];
	setName(name);
    }

    int cardsLeft() {
	return this.cards.length;
    }

    boolean hasCards() {
	if (this.cards.length > 0) {
	    return true;
	}
	return false;
    }

    void addCard(Card card) {

	Card[] temp = new Card[this.cards.length + 1];

	for (int i = 0; i < temp.length - 1; i++) {
	    temp[i] = this.cards[i];
	}

	temp[temp.length - 1] = card;

	this.cards = temp;
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
	    System.out.print(this.cards[i].getWeight());
	    System.out.print(this.cards[i].getSuit());
	    System.out.print(" ");
	}
	System.out.println();

    }

    Card throwCard() {
	Card card = cards[0];

	Card[] temp = new Card[this.cards.length - 1];
	for (int i = 1; i < this.cards.length; i++) {
	    temp[i - 1] = this.cards[i];
	}
	this.cards = temp;

	System.out.print(this.getName() + ": ");
	card.printCard();

	return card;
    }

    void winHand(Card[] winCards) {

	Card[] temp = new Card[this.cards.length + winCards.length];

	for (int i = 0; i < this.cards.length; i++) {
	    temp[i] = this.cards[i];
	}

	for (int i = 0; i < winCards.length; i++) {
	    temp[i + this.cards.length] = winCards[i];
	}

	this.cards = temp;
    }

}
