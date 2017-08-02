package immigrants;

import java.util.ArrayList;
import java.util.Random;

import immigrants.immigrants.Immigrant;
import immigrants.immigrants.Illegal.Extremist;
import immigrants.immigrants.Illegal.Radical;
import immigrants.immigrants.legal.Normal;
import immigrants.origin.Country;
import immigrants.passport.Passport;
import immigrants.weapons.Weapon;
import immigrants.weapons.bombs.Bomb;
import immigrants.weapons.shootingGuns.Gun;
import immigrants.weapons.shootingGuns.MachineGun;

public class Demo {
    public static void main(String[] args) {
	Country country = new Country("BG");

	ArrayList<Weapon> weapons = new ArrayList<>();
	for (int i = 0; i < 200; i++) {
	    Weapon w = null;
	    int chance = new Random().nextInt(3);
	    switch (chance) {
	    case 0:
		w = new Gun(130);
		break;
	    case 1:
		w = new MachineGun(420);
		break;
	    case 2:
		w = new Bomb(2500);
		break;

	    default:
		break;
	    }
	    weapons.add(w);
	}

	ArrayList<Immigrant> immigrants = new ArrayList<>();
	for (int i = 0; i < 100; i++) {
	    int chance = new Random().nextInt(100);
	    if (chance < 25) {
		Passport p = null;
		if (new Random().nextInt(100) < 35) {
		    p = new Passport("Penio-AlDjaziri-AlMaziri", 30, "Abudabi");
		}
		immigrants.add(new Radical(p, 500000, getRandom(immigrants), weapons));
	    } else if (chance >= 25 && chance < 60) {
		immigrants.add(new Extremist(500000, getRandom(immigrants), weapons));
	    } else {
		Passport p = new Passport("Georgi normalnia", 22, "Dubai");
		immigrants.add(new Normal(p, 500000, getRandom(immigrants)));
	    }

	}

	for (int i = 0; i < immigrants.size(); i++) {
	    immigrants.get(i).enterCountry(country);
	}

	for (int i = 0; i < 100; i++) {
	    Immigrant immigrant = immigrants.get(new Random().nextInt(immigrants.size()));
	    if (immigrant.getCity() != null) {
		immigrant.act();
	    }
	}

	System.out.println("=================");
	System.out.println(country);

    }

    private static ArrayList<Immigrant> getRandom(ArrayList<Immigrant> immigrants) {
	ArrayList<Immigrant> randoms = new ArrayList<>();
	if (immigrants.size() == 0) {
	    return randoms;
	}
	randoms.add(immigrants.get(new Random().nextInt(immigrants.size())));
	randoms.add(immigrants.get(new Random().nextInt(immigrants.size())));
	return randoms;
    }

}
