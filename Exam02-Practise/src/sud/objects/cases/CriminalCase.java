package sud.objects.cases;

import java.util.ArrayList;

import sud.objects.citizens.Defendant;
import sud.objects.citizens.Witness;
import sud.objects.jutists.Judge;
import sud.objects.jutists.Juror;
import sud.objects.jutists.Prosecutor;

public class CriminalCase extends Case {
    private static final String type = "Criminal Case";
    private Prosecutor prosecutor;

    public CriminalCase(Judge judge, Defendant accused, ArrayList<Witness> witnesses,
	    ArrayList<Juror> jury, Prosecutor prosecutor) {
	super(judge, accused, witnesses, jury);
	this.prosecutor = prosecutor;
    }

    protected void askQuestions() {
	super.askQuestions();
	prosecutorAskWitnesses();
	prosecutorAskDefendant();
    }

    private void prosecutorAskWitnesses() {
	for (int i = 0; i < witnesses.size(); i++) {
	    this.prosecutor.askQuestion(this.witnesses.get(i), 5);
	}
    }

    private void prosecutorAskDefendant() {
	this.prosecutor.askQuestion(this.defendant, 5);
    }

    @Override
    protected void increaseExperience() {
	super.increaseExperience();
	this.prosecutor.increaseCases();
    }
}
