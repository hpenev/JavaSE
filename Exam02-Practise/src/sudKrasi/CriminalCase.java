package sudKrasi;

import java.util.ArrayList;

import sudKrasi.citizens.Defendant;
import sudKrasi.citizens.Witness;
import sudKrasi.jurists.Judge;
import sudKrasi.jurists.Jury;
import sudKrasi.jurists.Procecutor;

public class CriminalCase extends Case{

	public CriminalCase(Judge judge, ArrayList<Jury> jury, Procecutor accuser, ArrayList<Witness> witnesses,
			Defendant defendant) {
		super(judge, jury, accuser, witnesses, defendant);
	}
	
	@Override
	protected void increaseXP() {
		super.increaseXP();
		((Procecutor)this.accuser).increaseCases();
	}

	@Override
	protected void askQuestions() {
		for (int i = 0; i < 5; i++) {
			this.accuser.askQuestion();
		}
	}

}
