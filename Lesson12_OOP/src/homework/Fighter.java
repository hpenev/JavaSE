package homework;

import java.util.Random;

public class Fighter {
    String name;
    int maxHealth = 100;
    int currentHealth = maxHealth;
    int damage = 5;
    Fighter opponent;
    int hitCounter = 0;
    int healthBonus = 20;

    void monsterHit() {
	int monsterDamage = damage * 2;
	opponent.currentHealth -= monsterDamage;

	System.out.println(name + " monster hit (" + monsterDamage + ") " + opponent.name);
	System.out.println(name + " (" + currentHealth + ") - " + opponent.name + " (" + opponent.currentHealth + ")");

    }

    void regularHit() {
	opponent.currentHealth -= damage;
	System.out.println(name + " regular hit (" + damage + ") " + opponent.name);
	System.out.println(name + " (" + currentHealth + ") - " + opponent.name + " (" + opponent.currentHealth + ")");
    }

    void hit() {
	Random random = new Random();

	if (hitCounter == 3) {
	    monsterHit();
	    hitCounter = 0;
	} else {
	    regularHit();
	    hitCounter++;
	}
    }

    void health() {

	if (currentHealth + healthBonus >= 100) {
	    currentHealth = 100;
	} else {
	    currentHealth += healthBonus;
	}

	System.out.println(name + " takes health bonus +" + healthBonus);

    }

    boolean isDead() {
	if (currentHealth > 0) {
	    return false;
	} else {
	    return true;
	}
    }

    void defend() {

    }

}
