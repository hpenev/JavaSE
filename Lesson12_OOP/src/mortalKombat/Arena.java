package mortalKombat;

import java.util.Random;

public class Arena {
    public static void main(String[] args) throws InterruptedException {

	Player subZero = new Player();
	subZero.name = "Sub-Zero";

	Player kitana = new Player();
	kitana.name = "Kitana";

	subZero.opponent = kitana;
	kitana.opponent = subZero;

	int round = 1;
	Random random = new Random();

	while (true) {
	    Thread.sleep(500);
	    System.out.println("Round: " + round++);

	    int playerWhoHit = random.nextInt(2);

	    if (playerWhoHit == 0) {
		subZero.hit();
	    }

	    if (playerWhoHit == 1) {
		kitana.hit();
	    }

	    if (subZero.health == 0) {
		printWinner(subZero.opponent);
		break;
	    }

	    if (kitana.health == 0) {
		printWinner(kitana.opponent);
		break;
	    }

	    printDelimiter();
	}
    }

    static void printWinner(Player winner) {
	printDelimiter();
	System.out.printf("Winner is %s (%d)\n\n", winner.name, winner.health);
	printKO();
    }

    static String repeatString(int count, String str) {

	StringBuilder sBuilder = new StringBuilder();
	for (int i = 0; i < count; i++) {
	    sBuilder.append(str);
	}
	return sBuilder.toString();
    }

    static void printDelimiter() {
	String delimiter = repeatString(50, "-");
	System.out.println(delimiter);
    }

    static void printKO() {
	System.out.println("88      a8P         ,ad8888ba,      ");
	System.out.println("88    ,88'         d8        8b     ");
	System.out.println("88  ,88           d8         `8b    ");
	System.out.println("88,d88'           88          88    ");
	System.out.println("8888 88,          88          88    ");
	System.out.println("88P   Y8b         Y8,        ,8P    ");
	System.out.println("88      88,   888  Y8a.    .a8P  888");
	System.out.println("88       Y8b  888     Y8888Y     888");

    }
}
