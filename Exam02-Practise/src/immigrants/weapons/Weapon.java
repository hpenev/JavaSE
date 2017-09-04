package immigrants.weapons;

public abstract class Weapon {
    private int price;

    public int getPrice() {
	return price;
    }

    protected Weapon(int price) {
	this.price = price;
    }

    public boolean isShootingWeapon() {
	return false;
    }

    public boolean isBomb() {
	return false;
    }

    public abstract int shoot();
}
