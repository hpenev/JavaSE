package immigrants.origin;

import java.util.ArrayList;
import java.util.Random;

import immigrants.immigrants.Immigrant;
import immigrants.policeMans.PoliceMan;
import immigrants.policeMans.objects.Officer;
import immigrants.policeMans.objects.Swat;

public class City {

    private Country country;
    private String name;
    private ArrayList<PoliceMan> police;
    private int citizens;
    private ArrayList<Immigrant> immigrants;

    public String getName() {
	return name;
    }

    public City(String name) {
	this.name = name;
	this.police = new ArrayList<>();
	for (int i = 0; i < new Random().nextInt(20) + 20; i++) {
	    if (new Random().nextBoolean()) {
		this.police.add(new Officer("Officer " + i, this));
	    } else {
		this.police.add(new Swat("Swat " + i, this));
	    }
	}

	this.citizens = new Random().nextInt(1000) + 1000;
	this.immigrants = new ArrayList<>();
    }

    public Country getCountry() {
	return country;
    }

    public PoliceMan getRandomPoliceMan() {
	return this.police.get(new Random().nextInt(police.size()));
    }

    public void addImmigrant(Immigrant immigrant) {
	this.immigrants.add(immigrant);
	this.citizens++;
    }

    public void losePeople(int casualties) {
	this.citizens -= casualties;
	if (citizens < 0) {
	    citizens = 0;
	}
    }

    public void dissappear() {
	this.country.removeCity(this);
    }

    public void setCountry(Country country) {
	this.country = country;
    }

    @Override
    public String toString() {
	return name;
    }
}
