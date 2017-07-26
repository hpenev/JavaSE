package sud.objects.CaseStuff;

import sud.objects.CitizenStuff.Accused;
import sud.objects.CitizenStuff.Accuser;
import sud.objects.CitizenStuff.Witness;
import sud.objects.JuristStuff.Judge;
import sud.objects.JuristStuff.Juror;

public class CivilCase extends Case {

    private static final String type = "Civil Case";
    private Juror[] jury = new Juror[3];
    private Accuser accuser;

    public CivilCase(Judge judge, Accused accused, Witness[] witnesses, Accuser accuser, Juror[] jury) {
	super(judge, accused, witnesses);
	this.accuser = accuser;
	this.jury = jury;
    }

    public void perform() {
	super.perform();
	for (int i = 0; i < this.jury.length; i++) {
	    this.jury[i].increaseWoringCases();
	}
	this.accuser.ask(this.accused, 3);
	this.accuser.ask(this.witnesses, 2);
    }
}
