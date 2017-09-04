package sud.objects.jutists;

import java.util.ArrayList;
import java.util.Random;

import sud.interfaces.IAskQuestions;
import sud.interfaces.ITakeNotes;
import sud.objects.citizens.Citizen;

public abstract class Jurist implements IAskQuestions, ITakeNotes {

    public static int questionsJurist = 0;

    protected String name;

    protected int yearsExperience;

    private int numberOfCases;

    public Jurist(String name, int yearsExperience, int numberOfCases) {
	this.name = name;
	this.yearsExperience = yearsExperience;
	this.numberOfCases = numberOfCases;
    }

    public void increaseCases() {
	this.numberOfCases++;
    }

    public void askQuestion(Citizen citizen, int numberOfQuestion) {
	for (int i = 0; i < numberOfQuestion; i++) {
	    System.out.println(this.name + " ask question" + (i + 1) + " to " + citizen.getName());
	    this.takeNotes();
	    questionsJurist++;
	}
    }

    public void takeNotes() {
	System.out.println(this.name + " take notes");
    }

    public boolean isJudge() {
	return false;
    }

    public boolean isLawyer() {
	return false;
    }

    public boolean isJuror() {
	return false;
    }

    public boolean isProsecutor() {
	return false;
    }

    public static ArrayList<Judge> filterJudges(ArrayList<Jurist> jurists) {
	ArrayList<Judge> judges = new ArrayList<>();
	for (Jurist jurist : jurists) {
	    if (jurist.isJudge()) {
		judges.add((Judge) jurist);
	    }
	}
	return judges;
    }

    public static ArrayList<Lawyer> filterLawyers(ArrayList<Jurist> jurists) {
	ArrayList<Lawyer> lawyers = new ArrayList<>();
	for (Jurist jurist : jurists) {
	    if (jurist.isLawyer()) {
		lawyers.add((Lawyer) jurist);
	    }
	}
	return lawyers;
    }

    public static ArrayList<Juror> filterJurors(ArrayList<Jurist> jurists) {
	ArrayList<Juror> jurors = new ArrayList<>();
	for (Jurist jurist : jurists) {
	    if (jurist.isJuror()) {
		jurors.add((Juror) jurist);
	    }
	}
	return jurors;
    }

    public static ArrayList<Prosecutor> filterProsecutors(ArrayList<Jurist> jurists) {
	ArrayList<Prosecutor> prosecutors = new ArrayList<>();
	for (Jurist jurist : jurists) {
	    if (jurist.isProsecutor()) {
		prosecutors.add((Prosecutor) jurist);
	    }
	}
	return prosecutors;
    }

    public static Prosecutor getRandomProsecutor(ArrayList<Jurist> jurists) {
	Random rnd = new Random();
	ArrayList<Prosecutor> prosecutors = filterProsecutors(jurists);
	Prosecutor randomProsecutor = prosecutors.get(rnd.nextInt(prosecutors.size()));
	return randomProsecutor;
    }

    public static Judge getRandomJudge(ArrayList<Jurist> jurists) {
	Random rnd = new Random();
	ArrayList<Judge> judges = filterJudges(jurists);
	Judge randomJudge = judges.get(rnd.nextInt(judges.size()));
	return randomJudge;
    }

    public static ArrayList<Juror> getRandomJury(ArrayList<Jurist> jurists, int number) {
	Random rnd = new Random();
	ArrayList<Juror> allJurors = filterJurors(jurists);

	ArrayList<Juror> jury = new ArrayList<>();
	for (int i = 0; i < number; i++) {
	    jury.add(allJurors.get(rnd.nextInt(allJurors.size())));
	}

	return jury;
    }

    public static ArrayList<Lawyer> getRandomLawyers(ArrayList<Jurist> jurists) {
	Random rnd = new Random();
	ArrayList<Lawyer> allLawyers = filterLawyers(jurists);

	ArrayList<Lawyer> lawyers = new ArrayList<>();
	for (int i = 0; i < rnd.nextInt(allLawyers.size()); i++) {
	    lawyers.add(allLawyers.get(rnd.nextInt(allLawyers.size())));
	}

	return lawyers;
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append(this.name + " - " + this.numberOfCases);
	return sb.toString();
    }
}
