package warGame;

public class demo {
    public static void main(String[] args) {
	Deck playingDeck = new Deck();

	Player p1 = new Player("Pesho");
	Player p2 = new Player("Gosho");

	playingDeck.dealingCards(p1, p2);

	p1.printCards();
	p2.printCards();

	int round = 1;
	int wars = 1;
	OUTERLOOP: while (true) {
	    System.out.println(repeatString("-", 30) + "ROUND:" + round++ + repeatString("-", 30));
	    p1.printCards();
	    p2.printCards();

	    Card[] cardsWin = new Card[2];

	    if (!hasPlayer1Card(p1)) {
		System.out.println("Winer is " + p2.getName());
		break;
	    }
	    if (!hasPlayer1Card(p2)) {
		System.out.println("Winer is " + p1.getName());
		break;
	    }

	    Card p1Card = p1.throwCard();
	    Card p2Card = p2.throwCard();

	    cardsWin[0] = p1Card;
	    cardsWin[1] = p2Card;

	    if (p1Card.isStronger(p2Card)) {
		p1.winHand(cardsWin);
	    } else if (p2Card.isStronger(p1Card)) {
		p2.winHand(cardsWin);
	    } else {

		while (true) {
		    System.out.println(repeatString("=", 30) + " WAR " + wars++ + " " + repeatString("=", 30));

		    if (!hasPlayer3Cards(p1)) {
			System.out.println("Winer is " + p2.getName());
			break OUTERLOOP;
		    }

		    if (!hasPlayer3Cards(p2)) {
			System.out.println("Winer is " + p1.getName());
			break OUTERLOOP;
		    }

		    Card[] warCards = new Card[6];
		    for (int i = 0; i < 6; i += 2) {
			warCards[i] = p1.throwCard();
			warCards[i + 1] = p2.throwCard();
		    }

		    Card[] temp = new Card[cardsWin.length + 6];
		    for (int i = 0; i < temp.length; i++) {
			if (i < cardsWin.length) {
			    temp[i] = cardsWin[i];
			} else {
			    temp[i] = warCards[i - cardsWin.length];
			}
		    }

		    cardsWin = temp;

		    Card p1LastCard = warCards[4];
		    Card p2LastCard = warCards[5];

		    if (p1LastCard.isStronger(p2LastCard)) {
			p1.winHand(cardsWin);
			break;
		    }

		    if (p2LastCard.isStronger(p1LastCard)) {
			p2.winHand(cardsWin);
			break;
		    }
		}
	    }
	}
    }

    static String repeatString(String s, int count) {
	StringBuilder stringBuilder = new StringBuilder();
	for (int i = 0; i < count; i++) {
	    stringBuilder.append(s);
	}
	return stringBuilder.toString();
    }

    static boolean hasPlayer1Card(Player p) {
	if (p.getCards()[0] != null) {
	    return true;
	} else {
	    return false;
	}
    }

    static boolean hasPlayer3Cards(Player p) {
	if (p.getCards()[0] != null && p.getCards()[1] != null && p.getCards()[2] != null) {
	    return true;
	} else {
	    return false;
	}
    }
}
