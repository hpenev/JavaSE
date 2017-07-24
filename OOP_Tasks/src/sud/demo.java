package sud;

import sud.objects.Court;
import sud.objects.CaseStuff.CivilCase;
import sud.objects.CaseStuff.CriminalCase;
import sud.objects.CitizenStuff.Accused;
import sud.objects.CitizenStuff.Accuser;
import sud.objects.CitizenStuff.Witness;
import sud.objects.JuristStuff.Judge;
import sud.objects.JuristStuff.Juror;
import sud.objects.JuristStuff.Lawyer;
import sud.objects.JuristStuff.Prosecutor;

public class demo {
    public static void main(String[] args) {
	Court court = new Court();

	Judge judge = new Judge("Judge1", 12, 12);
	Accused accused = new Accused("Accused1", "address", 18);

	Witness[] witnesses = {
		new Witness("w1", "a1", 20),
		new Witness("w2", "a2", 20)
	};

	Lawyer[] lawyers = {
		new Lawyer("L1", 1, 10),
		new Lawyer("L2", 2, 10)
	};

	Accuser accuser = new Accuser("accuser1", "addres", 25, lawyers);

	Juror[] jury = {
		new Juror("j1", 1, 1),
		new Juror("j2", 2, 2),
		new Juror("j3", 3, 3)
	};

	CivilCase case1 = new CivilCase(judge, accused, witnesses, accuser, jury);

	Prosecutor prosecutor = new Prosecutor("P1", 10, 10);
	CriminalCase case2 = new CriminalCase(judge, accused, witnesses, prosecutor, jury);
	case1.perform();
	case2.perform();
    }
}
