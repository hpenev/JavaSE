package immigrants.weapons.bombs;

import immigrants.weapons.Weapon;

public class Bomb extends Weapon {

    public Bomb(int price) {
	super(price);
	// TODO Auto-generated constructor stub
    }

    @Override
    public boolean isBomb() {
	return true;
    }

    @Override
    public int shoot() {
	System.out.println("Bomb said BOOOOM");
	return -1;// monkey hack
    }
}
