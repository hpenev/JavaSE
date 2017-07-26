package sud.objects.JuristStuff;

public class Judge extends Jurist {
    private static final String position = "Judge";

    public Judge(String name, int yearsExperience, int numberOfCases) {
	super(name, yearsExperience, numberOfCases);
	if (this.yearsExperience < 5) {
	    System.out.println("Years experience is not enougth");
	}
    }
}
