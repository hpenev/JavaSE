package mortalKombat;

import java.util.Random;

public class demo {
    public static void main(String[] args) throws InterruptedException {

	Fighter subZero = new Fighter();
	subZero.name = "Sub-Zero";

	Fighter scorpion = new Fighter();
	scorpion.name = "Scorpion";

	subZero.opponent = scorpion;
	scorpion.opponent = subZero;
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
		scorpion.hit();
	    }

	    if (subZero.health <= 0) {
		System.out.println("----------------------------------");
		System.out.printf("Winner is %s (%d)", subZero.opponent.name, subZero.opponent.health);
		break;
	    }

	    if (scorpion.health <= 0) {
		System.out.println("----------------------------------");
		System.out.printf("Winner is %s (%d)", scorpion.opponent.name, scorpion.opponent.health);
		break;
	    }

	    System.out.println("----------------------------------");
	}
    }
}
