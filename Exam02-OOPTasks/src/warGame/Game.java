package warGame;

public class Game {
    private static int warCounter = 1;
    static int p1wins = 1;
    static int p2wins = 1;

    static boolean war(Player p1, Player p2, Card[] cardsWin) {
	System.out.println(delimiter("=", 30, "War:" + warCounter++));

	if (p1.cardsLeft() < 3) {
	    Game.p2wins++;
	    System.out.println("Winer is " + p2.getName());
	    return true;
	}

	if (p2.cardsLeft() < 3) {
	    Game.p1wins++;
	    System.out.println("Winer is " + p1.getName());
	    return true;
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
	    return false;
	}

	if (p2LastCard.isStronger(p1LastCard)) {
	    p2.winHand(cardsWin);
	    return false;
	}

	return war(p1, p2, cardsWin);
    }

    static boolean battle(Player p1, Player p2) {

	Card[] winCards = new Card[2];
	if (p1.cardsLeft() < 1) {
	    Game.p2wins++;
	    System.out.println("Winer is " + p2.getName());
	    return true;
	}
	if (p2.cardsLeft() < 1) {
	    Game.p1wins++;
	    System.out.println("Winer is " + p1.getName());
	    return true;
	}

	Card p1Card = p1.throwCard();
	Card p2Card = p2.throwCard();

	winCards[0] = p1Card;
	winCards[1] = p2Card;

	if (p1Card.isStronger(p2Card)) {
	    p1.winHand(winCards);
	    return false;
	}
	if (p2Card.isStronger(p1Card)) {
	    p2.winHand(winCards);
	    return false;
	}

	return war(p1, p2, winCards);
    }

    static String delimiter(String s, int count) {
	StringBuilder stringBuilder = new StringBuilder();
	for (int i = 0; i < count; i++) {
	    stringBuilder.append(s);
	}
	return stringBuilder.toString();
    }

    static String delimiter(String s, int count, String middle) {
	StringBuilder stringBuilder = new StringBuilder();
	for (int i = 0; i < count; i++) {
	    if (i == count / 2) {
		stringBuilder.append(middle);
		continue;
	    }
	    stringBuilder.append(s);
	}
	return stringBuilder.toString();
    }
}
