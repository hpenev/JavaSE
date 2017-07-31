package sud.objects.JuristStuff;

import java.util.Random;

import sud.objects.CitizenStuff.Accused;

public class Judge extends Jurist {

    private static final String position = "Judge";

    public Judge(String name, int yearsExperience, int numberOfCases) {
	super(name, yearsExperience, numberOfCases);
	if (this.yearsExperience < 5) {
	    System.out.println("Years experience is not enougth");
	}
    }

    public void setVerdict(Accused accused) {
	Random random = new Random();
	int verdict = random.nextInt(38) + 3;
	accused.setYearsInJale(verdict);
    }

    @Override
    public boolean isJudge() {
	return true;
    }

    @Override
    public boolean isLawyer() {
	return false;
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
