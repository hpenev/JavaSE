package sudKrasi;

import java.util.ArrayList;

import sudKrasi.citizens.Accuser;
import sudKrasi.citizens.Defendant;
import sudKrasi.citizens.Witness;
import sudKrasi.jurists.Judge;
import sudKrasi.jurists.Jury;
import sudKrasi.jurists.Lawyer;

public class CivilCase extends Case{

	public CivilCase(Judge judge, ArrayList<Jury> jury, Accuser accuser, ArrayList<Witness> witnesses,
			Defendant defendant) {
		super(judge, jury, accuser, witnesses, defendant);
	}

	@Override
	protected void askQuestions() {
		ArrayList<Lawyer> lawyers = ((Accuser) accuser).getLawyers();
		for (int i = 0; i < lawyers.size(); i++) {
			lawyers.get(i).askQuestion();
		}
		for (int i = 0; i < lawyers.size(); i++) {
			lawyers.get(i).askQuestion();
		}
	}

}
