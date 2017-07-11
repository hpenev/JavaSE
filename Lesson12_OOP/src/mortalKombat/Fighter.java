package mortalKombat;

import java.util.Random;

public class Fighter {
    String name;
    int health = 100;
    int damage = 10;
    Fighter opponent;

    void hit() {
	System.out.println(name + " (" + health + ") - " + opponent.name + " (" + opponent.health + ")");
	if (chance() < 15.0) {
	    avoidHit();
	} else {
	    if (chance() < 5.0) {
		criticalHit();
	    } else {
		regularHit();
	    }
	}

	System.out.println(name + " (" + health + ") - " + opponent.name + " (" + opponent.health + ")");
    }

    void regularHit() {
	if (chance() < 30.0) {
	    blockHit();
	} else {
	    System.out.println(name + " Regular hit (" + damage + ") " + opponent.name);
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
	System.out.println(name + " Critical hit (" + criticalDamage + ") " + opponent.name);

    }

    void blockHit() {
	double blockedDamage = 0.6 * damage;
	if (opponent.health < blockedDamage) {
	    opponent.health = 0;
	} else {
	    opponent.health -= blockedDamage;
	}
	System.out.println(name + " blocked hit (" + blockedDamage + ") " + opponent.name);
    }

    void avoidHit() {
	System.out.println("Hit avoided!");
    }

    double chance() {
	Random random = new Random();
	double percentage = random.nextDouble() * 100;
	return percentage;
    }
}
