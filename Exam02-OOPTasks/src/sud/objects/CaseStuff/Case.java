package sud.objects.CaseStuff;

import java.util.ArrayList;

import sud.objects.CitizenStuff.Accused;
import sud.objects.CitizenStuff.Witness;
import sud.objects.JuristStuff.Judge;
import sud.objects.JuristStuff.Juror;

public abstract class Case {
    protected Judge judge;
    protected Accused accused;
    protected ArrayList<Witness> witnesses;
    protected ArrayList<Juror> jury;

    public Case(Judge judge, Accused accused, ArrayList<Witness> witnesses, ArrayList<Juror> jury) {
	this.judge = judge;
	this.accused = accused;
	this.witnesses = witnesses;
	this.jury = jury;
    }

    public void perform() {
	this.judge.increaseWoringCases();

	for (int i = 0; i < this.accused.getLayers().size(); i++) {
	    this.accused.getLayers().get(i).increaseWoringCases();
	}

	accusedLayersAskWitnesses();

	int votedGuilty = 0;
	int votedInnocent = 0;
	int votedPass = 0;

	for (int i = 0; i < jury.size(); i++) {
	    int vote = jury.get(i).getVerdict();
	    switch (vote) {
	    case 0:
		votedGuilty++;
		break;
	    case 1:
		votedInnocent++;
		break;
	    case 2:
		votedPass++;
		break;
	    }

	}

	if (votedGuilty > jury.size() / 2) {
	    accused.setGuilty(true);
	    this.judge.setVerdict(this.accused);
	}

	if (votedInnocent > jury.size() / 2) {
	    accused.setGuilty(false);
	}
    }

    private void accusedLayersAskWitnesses() {
	for (int i = 0; i < this.accused.getLayers().size(); i++) {
	    for (int j = 0; j < witnesses.size(); j++) {
		this.accused.getLayers().get(i).askQuestion(this.witnesses.get(j), 5);
	    }
	}
    }
}
