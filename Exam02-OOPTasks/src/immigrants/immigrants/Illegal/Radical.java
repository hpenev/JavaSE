package immigrants.immigrants.Illegal;

import java.util.ArrayList;
import java.util.Random;

import immigrants.immigrants.Immigrant;
import immigrants.passport.Passport;
import immigrants.weapons.Weapon;

public class Radical extends Illigal {

    public Radical(Passport passport, int money, ArrayList<Immigrant> relatives,
	    ArrayList<Weapon> weapons) {
	super(passport, money, relatives, weapons);

    }

    @Override
    protected ArrayList<Weapon> filterWeapons(ArrayList<Weapon> weapons) {
	ArrayList<Weapon> shootingWeapons = new ArrayList<>();
	for (Weapon weapon : weapons) {
	    if (weapon.isShootingWeapon()) {
		shootingWeapons.add(weapon);
	    }
	    if (shootingWeapons.size() == 5) {
		break;
	    }
	}
	return shootingWeapons;
    }

    @Override
    public boolean isLegal() {
	return getPassport() != null;
    }

    // returns the casualties
    public void shootThemAll() {
	int allAmmo = 0;
	for (Weapon w : weapons) {
	    allAmmo += w.shoot();
	}
	int percent = new Random().nextInt(61) + 10;
	int casualties = allAmmo * percent / 100;
	this.city.losePeople(casualties);
    }

    @Override
    public void act() {
	this.shootThemAll();
    }
}
