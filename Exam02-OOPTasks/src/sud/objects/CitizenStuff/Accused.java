package sud.objects.CitizenStuff;

import java.util.ArrayList;

import sud.objects.JuristStuff.Lawyer;

public class Accused extends Citizen {

    private ArrayList<Lawyer> layers;
    private boolean isGuilty = false;
    private int yearsInJale = 0;

    public void setYearsInJale(int yearsInJale) {
	this.yearsInJale = yearsInJale;
    }

    public void setLayers(ArrayList<Lawyer> layers) {
	this.layers = layers;
    }

    public Accused(String name, String address, int age) {
	super(name, address, age);
    }

    public ArrayList<Lawyer> getLayers() {
	return layers;
    }

    public void setGuilty(boolean isGuilty) {
	this.isGuilty = isGuilty;
    }

    @Override
    public boolean isAccused() {
	return true;
    }

    @Override
    public boolean isAccuser() {
	return false;
    }

    @Override
    public boolean isWitness() {
	return false;
    }
}
