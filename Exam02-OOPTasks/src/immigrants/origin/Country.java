package immigrants.origin;

import java.util.ArrayList;
import java.util.Random;

public class Country {
    private String name;
    private ArrayList<City> cities;
    private static final String[] NAMES = { "Sofia", "Gabrovo", "Burgas", "Varna", "Pleven", "Plovdiv" };

    public Country(String name) {
	this.name = name;
	this.cities = new ArrayList<City>();

	// int cities = new Random().nextInt(NAMES.length) + 1;
	for (int i = 0; i < 5; i++) {
	    City c = new City(NAMES[new Random().nextInt(NAMES.length)]);
	    c.setCountry(this);
	    this.cities.add(c);
	}
    }

    public City getRandomCity() {
	return this.cities.get(new Random().nextInt(cities.size()));
    }

    public void removeCity(City city) {
	this.cities.remove(city);
    }

    @Override
    public String toString() {
	return name + " with cities : " + cities.toString();
    }

}
