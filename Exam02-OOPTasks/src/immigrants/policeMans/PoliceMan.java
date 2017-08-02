package immigrants.policeMans;

import immigrants.immigrants.Immigrant;
import immigrants.origin.City;

public abstract class PoliceMan {
    private String name;
    private City city;

    protected PoliceMan(String name, City city) {
	this.name = name;
	this.city = city;
    }

    public abstract boolean check(Immigrant immigrant);
}
