package sud.objects.jutists;

public class Prosecutor extends Jurist {

    private static final String position = "Prosecutor";

    public Prosecutor(String name, int yearsExperience, int numberOfCases) {
	super(name, yearsExperience > 10 ? yearsExperience : 10, numberOfCases);
    }

    @Override
    public boolean isProsecutor() {
	return true;
    }

}
