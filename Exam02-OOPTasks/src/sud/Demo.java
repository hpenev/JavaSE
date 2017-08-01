package sud;

import java.io.IOException;
import java.io.PrintWriter;

import sud.objects.Court;
import sud.objects.cases.Case;
import sud.objects.citizens.Accuser;
import sud.objects.citizens.Defendant;
import sud.objects.citizens.Witness;
import sud.objects.jutists.Judge;
import sud.objects.jutists.Jurist;
import sud.objects.jutists.Juror;
import sud.objects.jutists.Lawyer;
import sud.objects.jutists.Prosecutor;

public class Demo {
    public static void main(String[] args) throws IOException {
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
	    court.addCitizen(new Defendant("Accused" + (i + 1), "Sofia", 18));
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
	int counter = 1;
	for (Case c : court.getCases()) {

	    PrintWriter writer = new PrintWriter("Case" + counter++ + ".txt");
	    c.perform();
	}

	System.out.println(court);

	System.out.println("Total jurist questions " + Jurist.questionsJurist);

    }
}
