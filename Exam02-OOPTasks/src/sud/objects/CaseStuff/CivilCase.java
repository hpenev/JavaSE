package sud.objects.CaseStuff;

import java.util.ArrayList;

import sud.objects.CitizenStuff.Accused;
import sud.objects.CitizenStuff.Accuser;
import sud.objects.CitizenStuff.Witness;
import sud.objects.JuristStuff.Judge;
import sud.objects.JuristStuff.Juror;

public class CivilCase extends Case {

    private static final String type = "Civil Case";
    // jury 3
    private Accuser accuser;

    public CivilCase(Judge judge, Accused accused, ArrayList<Witness> witnesses, Accuser accuser,
	    ArrayList<Juror> jury) {
	super(judge, accused, witnesses, jury);
	this.accuser = accuser;
    }

    public void perform() {
	super.perform();
	for (int i = 0; i < this.jury.size(); i++) {
	    this.jury.get(i).increaseWoringCases();
	}

	for (int i = 0; i < this.accuser.getLayers().size(); i++) {
	    this.accuser.getLayers().get(i).increaseWoringCases();
	}

	this.accuser.lawyersAskAccused(this.accused, 3);
	this.accuser.lawyersAskWitnesses(this.witnesses, 2);
    }
}
