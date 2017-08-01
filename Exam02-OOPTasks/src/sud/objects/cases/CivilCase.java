package sud.objects.cases;

import java.util.ArrayList;

import sud.objects.citizens.Accuser;
import sud.objects.citizens.Defendant;
import sud.objects.citizens.Witness;
import sud.objects.jutists.Judge;
import sud.objects.jutists.Juror;

public class CivilCase extends Case {

    private static final String type = "Civil Case";

    private Accuser accuser;

    public CivilCase(Judge judge, Defendant defendant, ArrayList<Witness> witnesses, ArrayList<Juror> jury,
	    Accuser accuser) {
	super(judge, defendant, witnesses, jury);
	this.accuser = accuser;
    }

    protected void askQuestions() {
	super.askQuestions();
	accuserLayersAskWitnesses();
	accuserLayersAskDefendant();
    }

    private void accuserLayersAskDefendant() {
	for (int i = 0; i < this.accuser.getLayers().size(); i++) {
	    this.accuser.getLayers().get(i).askQuestion(this.defendant, 3);
	}
    }

    private void accuserLayersAskWitnesses() {
	for (int i = 0; i < this.accuser.getLayers().size(); i++) {
	    for (int j = 0; j < witnesses.size(); j++) {
		this.accuser.getLayers().get(i).askQuestion(this.witnesses.get(j), 2);
	    }
	}
    }

    @Override
    protected void increaseExperience() {
	super.increaseExperience();
	for (int i = 0; i < this.accuser.getLayers().size(); i++) {
	    this.accuser.getLayers().get(i).increaseCases();
	}
    }

}
