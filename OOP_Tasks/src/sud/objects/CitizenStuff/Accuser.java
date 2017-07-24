package sud.objects.CitizenStuff;

import sud.objects.JuristStuff.Lawyer;

public class Accuser extends Citizen {
    private Lawyer[] layers;

    public Lawyer[] getLayers() {
	return layers;
    }

    public Accuser(String name, String address, int age, Lawyer[] layers) {
	super(name, address, age);
	this.layers = layers;
    }

    public void ask(Witness[] witnesses, int numberOfQuestion) {
	for (int i = 0; i < this.layers.length; i++) {
	    this.layers[i].askQuestion(witnesses[i], numberOfQuestion);
	}
    }

    public void ask(Accused accused, int numberOfQuestion) {
	for (int i = 0; i < this.layers.length; i++) {
	    this.layers[i].askQuestion(accused, numberOfQuestion);
	}
    }
}
