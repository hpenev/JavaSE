package sud.objects.JuristStuff;

import java.util.ArrayList;
import java.util.Random;

public abstract class Jurist {
    protected String name;
    protected int yearsExperience;
    private int numberOfCases;

    public Jurist(String name, int yearsExperience, int numberOfCases) {
	this.name = name;
	this.yearsExperience = yearsExperience;
	this.numberOfCases = numberOfCases;
    }

    public void increaseWoringCases() {
	this.numberOfCases++;
    }

    // public abstract void ask(Citizen citizen);

    // public abstract void takeNotes();

    public abstract boolean isJudge();

    public abstract boolean isLawyer();

    public abstract boolean isJuror();

    public abstract boolean isProsecutor();

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
