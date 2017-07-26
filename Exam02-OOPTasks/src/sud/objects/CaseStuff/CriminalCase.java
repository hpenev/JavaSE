package sud.objects.CaseStuff;

import sud.objects.CitizenStuff.Accused;
import sud.objects.CitizenStuff.Witness;
import sud.objects.JuristStuff.Judge;
import sud.objects.JuristStuff.Juror;
import sud.objects.JuristStuff.Prosecutor;

public class CriminalCase extends Case {
    private static final String type = "Criminal Case";
    private Juror[] jury = new Juror[13];
    private Prosecutor prosecutor;

    public CriminalCase(Judge judge, Accused accused, Witness[] witnesses, Prosecutor prosecutor, Juror[] jury) {
	super(judge, accused, witnesses);
	this.prosecutor = prosecutor;
	this.jury = jury;
    }

    public void perform() {
	super.perform();
	for (int i = 0; i < this.jury.length; i++) {
	    this.jury[i].increaseWoringCases();
	}
	this.prosecutor.increaseWoringCases();

	this.prosecutor.ask(this.accused, 5);
	this.prosecutor.ask(this.witnesses, 5);
    }
}
