package sud;

import sud.objects.Court;
import sud.objects.CaseStuff.Case;
import sud.objects.CitizenStuff.Accused;
import sud.objects.CitizenStuff.Accuser;
import sud.objects.CitizenStuff.Witness;
import sud.objects.JuristStuff.Judge;
import sud.objects.JuristStuff.Juror;
import sud.objects.JuristStuff.Lawyer;
import sud.objects.JuristStuff.Prosecutor;

public class Demo {
    public static void main(String[] args) {
	Court court = new Court("District Court", "Veliko Tarnovo");

	for (int i = 0; i < 3; i++) {
	    court.addJurists(new Judge("Judge" + (i + 1), 12, 12));
	}

	for (int i = 0; i < 10; i++) {
	    court.addJurists(new Juror("Juror" + (i + 1), 1, 1));
	}

	for (int i = 0; i < 5; i++) {
	    court.addJurists(new Lawyer("Lawyer" + (i + 1), 1, 10));
	}

	for (int i = 0; i < 2; i++) {
	    court.addJurists(new Prosecutor("Prosecutor" + (i + 1), 10, 10));
	}

	for (int i = 0; i < 5; i++) {
	    court.addCitizen(new Accuser("Accuser" + (i + 1), "Sofia", 20));
	}

	for (int i = 0; i < 5; i++) {
	    court.addCitizen(new Accused("Accused" + (i + 1), "Sofia", 18));
	}

	for (int i = 0; i < 10; i++) {
	    court.addCitizen(new Witness("Witness" + (i + 1), "Sofia", 55));
	}

	court.createCivilCase();
	court.createCivilCase();
	court.createCivilCase();

	court.createCriminalCase();
	court.createCriminalCase();
	court.createCriminalCase();

	System.out.println(court);

	for (Case c : court.getCases()) {
	    c.perform();
	}

	System.out.println(court);

    }
}
