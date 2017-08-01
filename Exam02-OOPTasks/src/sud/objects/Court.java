package sud.objects;

import java.util.ArrayList;

import sud.objects.cases.Case;
import sud.objects.cases.CivilCase;
import sud.objects.cases.CriminalCase;
import sud.objects.citizens.Accuser;
import sud.objects.citizens.Citizen;
import sud.objects.citizens.Defendant;
import sud.objects.citizens.Witness;
import sud.objects.jutists.Judge;
import sud.objects.jutists.Jurist;
import sud.objects.jutists.Juror;
import sud.objects.jutists.Prosecutor;

public class Court {
    private String name;
    private String address;
    private ArrayList<Jurist> jurists = new ArrayList<>();
    private ArrayList<Citizen> citizens = new ArrayList<>();;
    private ArrayList<Case> cases = new ArrayList<>();;

    public ArrayList<Case> getCases() {
	return this.cases;
    }

    public void addJurists(Jurist j) {
	this.jurists.add(j);
    }

    public void addCitizen(Citizen c) {
	this.citizens.add(c);
    }

    public void addCases(Case c) {
	this.cases.add(c);
    }

    public Court(String name, String address) {
	this.name = name;
	this.address = address;
    }

    public void createCivilCase() {
	Judge randomJudge = Jurist.getRandomJudge(jurists);
	Defendant defendant = Citizen.getRandomDefendant(citizens);
	defendant.setLayers(Jurist.getRandomLawyers(jurists));
	ArrayList<Witness> witnessesForCase = Citizen.getRandomWitnesses(citizens);
	Accuser accuser = Citizen.getRandomAccuser(citizens);
	accuser.setLayers(Jurist.getRandomLawyers(jurists));
	ArrayList<Juror> jury = Jurist.getRandomJury(jurists, 3);

	CivilCase civilCase = new CivilCase(randomJudge, defendant, witnessesForCase, jury, accuser);

	this.cases.add(civilCase);
    }

    public void createCriminalCase() {
	Judge randomJudge = Jurist.getRandomJudge(jurists);
	Defendant defendant = Citizen.getRandomDefendant(citizens);
	defendant.setLayers(Jurist.getRandomLawyers(jurists));
	ArrayList<Witness> witnessesForCase = Citizen.getRandomWitnesses(citizens);
	Prosecutor prosecutor = Jurist.getRandomProsecutor(jurists);
	ArrayList<Juror> jury = Jurist.getRandomJury(jurists, 13);

	CriminalCase criminalCase = new CriminalCase(randomJudge, defendant, witnessesForCase, jury, prosecutor);

	this.cases.add(criminalCase);
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < this.jurists.size(); i++) {
	    sb.append(this.jurists.get(i));
	    sb.append("\n");
	}
	return sb.toString();
    }

}
