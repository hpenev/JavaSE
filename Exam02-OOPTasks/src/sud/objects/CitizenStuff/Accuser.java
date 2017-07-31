package sud.objects.CitizenStuff;

import java.util.ArrayList;

import sud.objects.JuristStuff.Lawyer;

public class Accuser extends Citizen {
    private ArrayList<Lawyer> layers;

    public ArrayList<Lawyer> getLayers() {
	return this.layers;
    }

    public Accuser(String name, String address, int age) {
	super(name, address, age);
    }

    public void setLayers(ArrayList<Lawyer> layers) {
	this.layers = layers;
    }

    public void lawyersAskWitnesses(ArrayList<Witness> witnesses, int numberOfQuestion) {
	for (int i = 0; i < this.layers.size(); i++) {
	    for (int j = 0; j < witnesses.size(); j++) {
		this.layers.get(i).askQuestion(witnesses.get(j), numberOfQuestion);
	    }

	}
    }

    public void lawyersAskAccused(Accused accused, int numberOfQuestion) {
	for (int i = 0; i < this.layers.size(); i++) {
	    this.layers.get(i).askQuestion(accused, numberOfQuestion);
	}
    }

    @Override
    public boolean isAccused() {
	return false;
    }

    @Override
    public boolean isAccuser() {
	return true;
    }

    @Override
    public boolean isWitness() {
	return false;
    }
}
