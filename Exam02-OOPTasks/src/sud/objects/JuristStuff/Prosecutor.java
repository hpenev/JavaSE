package sud.objects.JuristStuff;

import sud.objects.CitizenStuff.Accused;
import sud.objects.CitizenStuff.Witness;

public class Prosecutor extends Jurist {
    private static final String position = "Prosecutor";

    public Prosecutor(String name, int yearsExperience, int numberOfCases) {
	super(name, yearsExperience, numberOfCases);
	if (yearsExperience < 10) {
	    System.out.println("Prosecutor should have at least 10 years experience");
	}
    }

    public void ask(Accused accused, int numberOfQuestion) {
	for (int i = 0; i < numberOfQuestion; i++) {
	    System.out.println("Prosecutor " + this.name + " ask question" + (i + 1) + " to " + accused.getName());
	}
    }

    public void ask(Witness[] witness, int numberOfQuestion) {
	for (int i = 0; i < numberOfQuestion; i++) {
	    for (int j = 0; j < witness.length; j++) {
		System.out
			.println("Prosecutor " + this.name + " ask question" + (i + 1) + " to " + witness[j].getName());
	    }
	}
    }
}
