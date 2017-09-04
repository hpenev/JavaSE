package musicalInstruments.instruments;

import java.util.Random;

import musicalInstruments.MusicInstrumentType;

public abstract class Instrument implements Comparable<Instrument> {

    protected String name;
    protected double price;
    private int pcsSell;
    protected MusicInstrumentType type;

    public int getPcsSell() {
	return pcsSell;
    }

    public double getPrice() {
	return price;
    }

    public MusicInstrumentType getType() {
	return type;
    }

    public String getName() {
	return name;
    }

    public Instrument(String name) {
	if (validName(name)) {
	    this.name = name;
	} else {
	    this.name = "name not found";
	    System.out.println(this.name);
	}
	this.price = new Random().nextInt(1000);
    }

    protected abstract boolean validName(String name);

    @Override
    public int compareTo(Instrument o) {
	if (this.name.equals(o.name)) {
	    if (this.price > o.price) {
		return 1;
	    }
	    if (this.price < o.price) {
		return -1;
	    }
	    if (this.price == o.price) {
		return 0;
	    }
	}
	return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
	return this.name;
    }

}
