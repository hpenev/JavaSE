package sud.objects.JuristStuff;

import sud.objects.CitizenStuff.Accused;
import sud.objects.CitizenStuff.Witness;

public class Lawyer extends Jurist {
    private static final String position = "Lawyer";

    public Lawyer(String name, int yearsExperience, int numberOfCases) {
	super(name, yearsExperience, numberOfCases);
	if (numberOfCases < 10) {
	    System.out.println("Lawyers must have participated in at least 10 cases.");
	}
    }

    public void askQuestion(Witness witness, int numberOfQuestion) {
	for (int i = 0; i < numberOfQuestion; i++) {
	    System.out.println("Layer " + this.name + " ask question" + (i + 1) + " to " + witness.getName());
	}
    }

    public void askQuestion(Accused accused, int numberOfQuestion) {
	for (int i = 0; i < numberOfQuestion; i++) {
	    System.out.println("Layer " + this.name + " ask question" + (i + 1) + " to " + accused.getName());
	}

    }

    @Override
    public boolean isJudge() {
	return false;
    }

    @Override
    public boolean isLawyer() {
	return true;
    }

    @Override
    public boolean isJuror() {
	return false;
    }

    @Override
    public boolean isProsecutor() {
	return false;
    }
}
