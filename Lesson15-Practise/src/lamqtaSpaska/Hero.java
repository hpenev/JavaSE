package lamqtaSpaska;

public class Hero {
    private final int MAX_HEALTH = 200;
    private final int START_DAMAGE = 5;
    private String name;
    private int health = MAX_HEALTH;
    private int dmg = START_DAMAGE;

    Hero(String name) {
	this.name = name;
    }
}
