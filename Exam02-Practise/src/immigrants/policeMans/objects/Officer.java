package immigrants.policeMans.objects;

import java.util.Random;

import immigrants.immigrants.Immigrant;
import immigrants.origin.City;
import immigrants.policeMans.PoliceMan;

public class Officer extends PoliceMan {

    public Officer(String name, City city) {
	super(name, city);
	// TODO Auto-generated constructor stub
    }

    @Override
    public boolean check(Immigrant immigrant) {
	if (immigrant.isLegal()) {
	    return false;
	}

	if (immigrant.hasBomb()) {
	    return false;
	}

	if (new Random().nextBoolean()) {
	    return true;
	} else {
	    return false;
	}
    }
}
