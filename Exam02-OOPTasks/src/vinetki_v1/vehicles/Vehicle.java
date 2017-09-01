package vinetki_v1.vehicles;

import vinetki_v1.vignettes.Vignette;

public abstract class Vehicle {

    private String model;
    private Vignette vignette;
    private int year;

    public Vehicle(String model, int year) {
	this.model = model;
	this.year = year;
    }

    public void setVignette(Vignette vignette) {
	this.vignette = vignette;
    }

    @Override
    public String toString() {
	return this.model + " " + this.year;
    }

    public boolean hasVignette() {
	if (vignette == null) {
	    return false;
	} else {
	    return true;
	}
    }
}
