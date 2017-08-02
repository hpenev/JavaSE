package immigrants.immigrants;

import java.util.ArrayList;

import immigrants.origin.City;
import immigrants.origin.Country;
import immigrants.passport.Passport;
import immigrants.policeMans.PoliceMan;
import immigrants.weapons.Weapon;

public abstract class Immigrant {
    private Passport passport;
    private int money;
    protected City city;
    private ArrayList<Immigrant> relatives;
    protected ArrayList<Weapon> weapons;

    public City getCity() {
	return city;
    }

    protected Immigrant(Passport passport, int money, ArrayList<Immigrant> relatives,
	    ArrayList<Weapon> weapons) {
	this.passport = passport;

	this.money = money;

	if (validRelatives(relatives)) {
	    this.relatives = relatives;
	} else {
	    this.relatives = new ArrayList<>();
	}

	if (weapons == null) {
	    this.weapons = new ArrayList<>();
	} else {
	    this.weapons = filterWeapons(weapons);
	}
    }

    public abstract void act();

    public boolean hasBomb() {
	if (weapons == null) {
	    return false;
	}

	for (Weapon weapon : weapons) {
	    if (weapon.isBomb()) {
		return true;
	    }
	}
	return false;
    }

    public Passport getPassport() {
	return passport;
    }

    public abstract boolean isLegal();

    protected ArrayList<Weapon> filterWeapons(ArrayList<Weapon> weapons) {
	return weapons;
    }

    protected boolean validRelatives(ArrayList<Immigrant> relatives) {
	return relatives != null;
    }

    void immigrate(City city) {
	// TODO implement
    }

    public boolean buyWeapon(Weapon weapon) {
	if (weapon.getPrice() > this.money) {
	    System.out.println("Not enougth money");
	    return false;
	} else {
	    this.money -= weapon.getPrice();
	    this.weapons.add(weapon);
	    this.weapons = filterWeapons(weapons);
	    return true;
	}
    }

    public void enterCountry(Country country) {
	City c = country.getRandomCity();
	this.enterCity(c);
    }

    private void enterCity(City city) {
	PoliceMan policeMan = city.getRandomPoliceMan();
	if (policeMan.check(this)) {
	    city.addImmigrant(this);
	    this.city = city;
	    for (int i = 0; i < this.relatives.size(); i++) {
		if (relatives.get(i).city != city) {
		    relatives.get(i).enterCity(city);
		}
	    }
	} else {
	    System.out.println("Immigrant not entered the city " + city.getName());
	}
    }
}
