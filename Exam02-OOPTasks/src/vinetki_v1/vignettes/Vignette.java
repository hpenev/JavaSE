package vinetki_v1.vignettes;

import java.time.LocalDate;

import vinetki_v1.vehicles.Vehicle;

public abstract class Vignette implements Comparable<Vignette> {

    public enum Validity {
	DAY, MONTH, YEAR
    }

    public Vignette(Validity validity) {
	this.validity = validity;
    }

    public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
    }

    protected double price;
    protected LocalDate startDate;
    protected String color;
    protected Validity validity;

    protected void setPrice() {
	double price = 0;
	if (this.color.equals("CarColor")) {
	    price = 5;
	}
	if (this.color.equals("TruckColor")) {
	    price = 7;
	}
	if (this.color.equals("BusColor")) {
	    price = 9;
	}

	if (this.validity == Validity.MONTH) {
	    price *= 10;
	}

	if (this.validity == Validity.YEAR) {
	    price *= 60;
	}
	this.price = price;
    }

    public double getPrice() {
	return price;
    }

    public void putOnWindshield(Vehicle vehicle) {
	vehicle.setVignette(this);
    }

    @Override
    public String toString() {
	return color + " " + validity + " " + price;
    }

    @Override
    public int compareTo(Vignette o) {
	if (this.price == o.price) {
	    return 0;
	}
	if (this.price > o.price) {
	    return 1;
	}
	if (this.price < o.price) {
	    return -1;
	}
	return 0;
    }

}
