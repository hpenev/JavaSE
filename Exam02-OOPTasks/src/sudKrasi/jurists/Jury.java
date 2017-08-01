package sudKrasi.jurists;

public class Jury extends Jurist {

    public Jury(String name, int exp, int cases) {
	super(name, exp, cases);
	this.position = "Jury";
    }

    @Override
    protected void askQuestion() {
	System.out.println("Ti mene useshtash li me kato zasedatel?");
    }

    @Override
    protected void takeNotes() {
	System.out.println("Toq ne me useshta");
    }

}