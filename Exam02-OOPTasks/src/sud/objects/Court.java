package sud.objects;

import java.util.ArrayList;

import sud.objects.CaseStuff.Case;
import sud.objects.CaseStuff.CivilCase;
import sud.objects.CaseStuff.CriminalCase;
import sud.objects.CitizenStuff.Accused;
import sud.objects.CitizenStuff.Accuser;
import sud.objects.CitizenStuff.Citizen;
import sud.objects.CitizenStuff.Witness;
import sud.objects.JuristStuff.Judge;
import sud.objects.JuristStuff.Jurist;
import sud.objects.JuristStuff.Juror;
import sud.objects.JuristStuff.Prosecutor;

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
	Accused accused = Citizen.getRandomAccused(citizens);
	accused.setLayers(Jurist.getRandomLawyers(jurists));
	ArrayList<Witness> witnessesForCase = Citizen.getRandomWitnesses(citizens);
	Accuser accuser = Citizen.getRandomAccuser(citizens);
	accuser.setLayers(Jurist.getRandomLawyers(jurists));
	ArrayList<Juror> jury = Jurist.getRandomJury(jurists, 3);

	CivilCase civilCase = new CivilCase(randomJudge, accused, witnessesForCase, accuser, jury);

	this.cases.add(civilCase);
    }

    public void createCriminalCase() {

	Judge randomJudge = Jurist.getRandomJudge(jurists);
	Accused accused = Citizen.getRandomAccused(citizens);
	accused.setLayers(Jurist.getRandomLawyers(jurists));
	ArrayList<Witness> witnessesForCase = Citizen.getRandomWitnesses(citizens);
	Prosecutor prosecutor = Jurist.getRandomProsecutor(jurists);
	ArrayList<Juror> jury = Jurist.getRandomJury(jurists, 3);

	CriminalCase criminalCase = new CriminalCase(randomJudge, accused, witnessesForCase, prosecutor, jury);

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
