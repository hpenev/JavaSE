package homework;

import java.util.Random;

public class demo {
    public static void main(String[] args) throws InterruptedException {
	Fighter f1 = new Fighter();
	f1.name = "Ivan";

	Fighter f2 = new Fighter();
	f2.name = "Peter";

	f1.opponent = f2;
	f2.opponent = f1;
	Random random = new Random();

	int healthCounter = 1;
	int round = 1;

	while (true) {
	    // Thread.sleep(100);
	    System.out.println("Round: " + round++);

	    int playerWhoHit = random.nextInt(2);

	    if (playerWhoHit == 0) {
		if (healthCounter == 5) {
		    healthCounter = 0;
		    f1.health();
		}
		f1.hit();
	    }

	    if (playerWhoHit == 1) {
		if (healthCounter == 5) {
		    healthCounter = 0;
		    f2.health();
		}
		f2.hit();
	    }

	    if (f1.isDead()) {
		System.out.println("------------------------------");
		System.out.printf("Winner is %s (%d)", f1.opponent.name, f1.opponent.currentHealth);
		break;
	    }

	    if (f2.isDead()) {
		System.out.println("------------------------------");
		System.out.printf("Winner is %s (%d)", f2.opponent.name, f2.opponent.currentHealth);
		break;
	    }

	    healthCounter++;
	    System.out.println("------------------------------");
	}
    }
}
