package sud.objects.jutists;

import java.util.Random;

public class Juror extends Jurist {

    private static final String position = "Juror";

    public Juror(String name, int yearsExperience, int numberOfCases) {
	super(name, yearsExperience, numberOfCases);
    }

    public int getVerdict() {
	Random random = new Random();
	return random.nextInt(3);
    }

    @Override
    public boolean isJuror() {
	return true;
    }

}
