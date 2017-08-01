package sud.objects.jutists;

public class Lawyer extends Jurist {

    private static final String position = "Lawyer";

    public Lawyer(String name, int yearsExperience, int numberOfCases) {
	super(name, yearsExperience > 10 ? yearsExperience : 10, numberOfCases);
    }

    @Override
    public boolean isLawyer() {
	return true;
    }

}
