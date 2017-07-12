package homework.mortalKombat;

import java.util.Random;

public class Player {
    String name;
    double health = 50;
    double damage = 11;

    double criticalDamage = 2 * damage;
    double blockedDamage = 0.6 * damage;
    double healthBonus = 10;

    Player opponent;

    double avoidHitChance = 15.0;
    double criticalHitChance = 5.0;
    double blockHitChance = 30.0;
    double healthBonusChance = 10.0;

    void hit() {
	System.out.printf("Start:\t%s (%.1f) - %s (%.1f)%n", name, health, opponent.name, opponent.health);

	if (chance() <= avoidHitChance) {
	    avoidHit();
	} else {
	    if (chance() <= criticalHitChance) {
		criticalHit();
	    } else {
		regularHit();
	    }
	}

	if (chance() <= healthBonusChance) {
	    System.out.printf("\t%s get health bonus (+%.1f)%n", name, healthBonus);
	    getHealth();
	}

	System.out.printf("End:\t%s (%.1f) - %s (%.1f)%n", name, health, opponent.name, opponent.health);
    }

    void getHealth() {
	health += healthBonus;
    }

    void regularHit() {
	if (chance() <= blockHitChance) {
	    blockHit();
	} else {
	    System.out.printf("\t%s hit regular (%.1f) %s%n", name, damage, opponent.name);
	    decreaseHealth(damage);
	}
    }

    void criticalHit() {
	decreaseHealth(criticalDamage);
	System.out.printf("\t%s hit critical (%.1f) %s%n", name, criticalDamage, opponent.name);
    }

    void blockHit() {
	decreaseHealth(blockedDamage);
	System.out.printf("\t%s hit, but blocked (%.1f) by %s%n", name, blockedDamage, opponent.name);
    }

    void decreaseHealth(double dmg) {
	if (opponent.health < dmg) {
	    opponent.health = 0;
	} else {
	    opponent.health -= dmg;
	}
    }

    void avoidHit() {
	System.out.printf("\tHit avoided!%n");
    }

    double chance() {
	Random random = new Random();
	double percentage = random.nextDouble() * 100;
	return percentage;
    }
}
