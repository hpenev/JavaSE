package sud.objects.JuristStuff;

public class Jurist {
    protected String name;
    protected int yearsExperience;
    private int numberOfCases;

    public Jurist(String name, int yearsExperience, int numberOfCases) {
	this.name = name;
	this.yearsExperience = yearsExperience;
	this.numberOfCases = numberOfCases;
    }

    public void increaseWoringCases() {
	this.numberOfCases++;
    }

    void ask() {
	// Да задава въпрос на гражданин
    }

    void takeNotes() {
	// Да си води записки с отговорите на гражданите
    }
}
