package immigrants.immigrants.Illegal;

import java.util.ArrayList;

import immigrants.immigrants.Immigrant;
import immigrants.weapons.Weapon;

public class Extremist extends Illigal {

    public Extremist(int money, ArrayList<Immigrant> relatives, ArrayList<Weapon> weapons) {
	super(null, money, relatives, weapons);
	// TODO Auto-generated constructor stub
    }

    public void bombUp() {
	// TODO implement
    }

    @Override
    public boolean isLegal() {
	return false;
    }

    public void blowUp() {
	for (Weapon w : weapons) {
	    if (w.isBomb()) {
		w.shoot();
		System.out.println("Fire in the hole!");
		city.dissappear();
	    }
	}
    }

    @Override
    public void act() {
	this.blowUp();
    }
}
