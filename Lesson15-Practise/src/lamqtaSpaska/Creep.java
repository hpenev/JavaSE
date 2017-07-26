package lamqtaSpaska;

import java.util.Random;

public class Creep {
    private String name;
    private int health;
    private int dmg;

    public Creep(String name) {
	this.name = name;
	this.health = new Random().nextInt(50);
	this.dmg = new Random().nextInt(5);
    }
}
