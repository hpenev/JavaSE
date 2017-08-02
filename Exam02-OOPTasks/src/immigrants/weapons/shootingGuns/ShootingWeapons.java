package immigrants.weapons.shootingGuns;

import immigrants.weapons.Weapon;

public abstract class ShootingWeapons extends Weapon {

    protected ShootingWeapons(int price) {
	super(price);
	// TODO Auto-generated constructor stub
    }

    @Override
    public boolean isShootingWeapon() {
	return true;
    }

}
