package homework.mortalKombat;

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

	    System.out.printf("%s Round:%d %s%n", repeatString(20, "-"), round++, repeatString(20, "-"));

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

	    System.out.println();
	}
    }

    static void printWinner(Player winner) {
	System.out.printf("\n\n\tWinner is %s (%.1f)", winner.name, winner.health);
    }

    static String repeatString(int count, String str) {
	StringBuilder sBuilder = new StringBuilder();
	for (int i = 0; i < count; i++) {
	    sBuilder.append(str);
	}
	return sBuilder.toString();
    }
}
