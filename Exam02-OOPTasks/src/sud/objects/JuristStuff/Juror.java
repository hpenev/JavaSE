package sud.objects.JuristStuff;

import java.util.Random;

public class Juror extends Jurist {
    // Съдебен заседател
    private static final String position = "Juror";

    public Juror(String name, int yearsExperience, int numberOfCases) {
	super(name, yearsExperience, numberOfCases);
    }

    public int getVerdict() {
	Random random = new Random();
	return random.nextInt(3);
    }

    @Override
    public boolean isJudge() {
	return false;
    }

    @Override
    public boolean isLawyer() {
	return false;
    }

    @Override
    public boolean isJuror() {
	return true;
    }

    @Override
    public boolean isProsecutor() {
	return false;
    }
}
