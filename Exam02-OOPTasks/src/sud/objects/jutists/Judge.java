package sud.objects.jutists;

import java.util.Random;

import sud.objects.citizens.Defendant;

public class Judge extends Jurist {

    private static final String position = "Judge";

    public Judge(String name, int yearsExperience, int numberOfCases) {
	super(name, yearsExperience > 5 ? yearsExperience : 5, numberOfCases);
    }

    public void setVerdict(Defendant accused) {
	Random random = new Random();
	int verdict = random.nextInt(38) + 3;
	accused.setYearsInJale(verdict);
    }

    @Override
    public boolean isJudge() {
	return true;
    }

}
