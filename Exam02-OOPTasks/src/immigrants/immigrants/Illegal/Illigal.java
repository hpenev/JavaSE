package immigrants.immigrants.Illegal;

import java.util.ArrayList;

import immigrants.immigrants.Immigrant;
import immigrants.passport.Passport;
import immigrants.weapons.Weapon;

public abstract class Illigal extends Immigrant {

    protected Illigal(Passport passport, int money, ArrayList<Immigrant> relatives, ArrayList<Weapon> weapons) {
	super(passport, money, relatives, weapons);
	// TODO Auto-generated constructor stubs
    }
}
