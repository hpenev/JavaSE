package mortalKombat;

import java.util.Random;

public class Player {
    String name;
    int health = 50;
    int damage = 11;
    Player opponent;

    void hit() {
	System.out.println("Start:\t" + name + " (" + health + ") - " + opponent.name + " (" + opponent.health + ")");
	if (chance() <= 15.0) {
	    avoidHit();
	} else {
	    if (chance() <= 5.0) {
		criticalHit();
	    } else {
		regularHit();
	    }
	}

	System.out.println("End:\t" + name + " (" + health + ") - " + opponent.name + " (" + opponent.health + ")");
    }

    void regularHit() {
	if (chance() <= 30.0) {
	    blockHit();
	} else {
	    System.out.println("\t" + name + " hit regular (" + damage + ") " + opponent.name);
	    if (opponent.health < damage) {
		opponent.health = 0;
	    } else {
		opponent.health -= damage;
	    }
	}
    }

    void criticalHit() {
	double criticalDamage = 2 * damage;
	if (opponent.health < criticalDamage) {
	    opponent.health = 0;
	} else {
	    opponent.health -= criticalDamage;
	}
	System.out.println("\t" + name + " hit critical (" + criticalDamage + ") " + opponent.name);

    }

    void blockHit() {
	double blockedDamage = 0.6 * damage;
	if (opponent.health < blockedDamage) {
	    opponent.health = 0;
	} else {
	    opponent.health -= blockedDamage;
	}
	System.out.println("\t" + name + " hit, but blocked (" + blockedDamage + ") by " + opponent.name);
    }

    void avoidHit() {
	System.out.println("\t" + "Hit avoided!");
    }

    double chance() {
	Random random = new Random();
	double percentage = random.nextDouble() * 100;
	return percentage;
    }
}
