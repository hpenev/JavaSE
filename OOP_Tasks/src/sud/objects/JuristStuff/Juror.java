package sud.objects.JuristStuff;

public class Juror extends Jurist {
    // Съдебен заседател
    private static final String position = "Juror";

    public Juror(String name, int yearsExperience, int numberOfCases) {
	super(name, yearsExperience, numberOfCases);
    }
}
