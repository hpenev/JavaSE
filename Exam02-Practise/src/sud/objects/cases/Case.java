package sud.objects.cases;

import java.util.ArrayList;
import java.util.Random;

import sud.objects.citizens.Defendant;
import sud.objects.citizens.Witness;
import sud.objects.jutists.Judge;
import sud.objects.jutists.Juror;

public abstract class Case {
    protected Judge judge;
    protected Defendant defendant;
    protected ArrayList<Witness> witnesses;
    protected ArrayList<Juror> jury;

    public Case(Judge judge, Defendant defendant, ArrayList<Witness> witnesses, ArrayList<Juror> jury) {
	// TODO VALIDATE
	this.judge = judge;
	this.defendant = defendant;
	this.witnesses = witnesses;
	this.jury = jury;
    }

    public void perform() {
	increaseExperience();
	askQuestions();
	juryMakeDecision();
    }

    protected void increaseExperience() {
	this.judge.increaseCases();

	for (int i = 0; i < this.defendant.getLayers().size(); i++) {
	    this.defendant.getLayers().get(i).increaseCases();
	}

	for (int i = 0; i < this.jury.size(); i++) {
	    this.jury.get(i).increaseCases();
	}
    }

    private void juryMakeDecision() {
	int votedGuilty = 0;
	int votedInnocent = 0;
	int votedPass = 0;

	for (int i = 0; i < this.jury.size(); i++) {
	    int vote = this.jury.get(i).getVerdict();
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
	    this.defendant.setGuilty(true);
	    this.judge.setVerdict(this.defendant);
	}

	if (votedInnocent > jury.size() / 2) {
	    this.defendant.setGuilty(false);
	}
    }

    protected void askQuestions() {
	defendantLawyersAskWitnesses();
	judgeAskQuestions();
	juryAskQuestions();
    }

    private void juryAskQuestions() {
	if (new Random().nextBoolean()) {
	    for (Juror juror : jury) {
		juror.askQuestion(defendant, new Random().nextInt(5) + 1);
	    }
	}

	if (new Random().nextBoolean()) {
	    for (Juror juror : jury) {
		for (Witness witness : witnesses) {
		    juror.askQuestion(witness, new Random().nextInt(5) + 1);
		}
	    }
	}
    }

    private void judgeAskQuestions() {
	if (new Random().nextBoolean()) {
	    this.judge.askQuestion(defendant, new Random().nextInt(5) + 1);
	}

	if (new Random().nextBoolean()) {
	    for (Witness witness : witnesses) {
		this.judge.askQuestion(witness, new Random().nextInt(5) + 1);
	    }
	}
    }

    private void defendantLawyersAskWitnesses() {
	for (int i = 0; i < this.defendant.getLayers().size(); i++) {
	    for (int j = 0; j < this.witnesses.size(); j++) {
		this.defendant.getLayers().get(i).askQuestion(this.witnesses.get(j), 5);
	    }
	}
    }

}
