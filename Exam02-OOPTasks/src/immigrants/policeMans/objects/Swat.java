package immigrants.policeMans.objects;

import java.util.Random;

import immigrants.immigrants.Immigrant;
import immigrants.origin.City;
import immigrants.policeMans.PoliceMan;

public class Swat extends PoliceMan {

    public Swat(String name, City city) {
	super(name, city);
    }

    @Override
    public boolean check(Immigrant immigrant) {
	if (immigrant.isLegal()) {
	    return false;
	}

	if (new Random().nextInt(100) <= 90) {
	    return true;
	} else {
	    return false;
	}
    }

}
