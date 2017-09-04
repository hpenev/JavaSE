package sudKrasi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import sudKrasi.citizens.Defendant;
import sudKrasi.citizens.Witness;
import sudKrasi.jurists.Judge;
import sudKrasi.jurists.Jury;

public abstract class Case {

	private Judge judge;
	private ArrayList<Jury> jury;
	protected IAccuser accuser;
	private ArrayList<Witness> witnesses;
	private Defendant defendant;
	
	public Case(Judge judge, ArrayList<Jury> jury, IAccuser accuser, ArrayList<Witness> witnesses,
			Defendant defendant) {
		this.judge = judge;
		this.jury = jury;
		this.accuser = accuser;
		this.witnesses = witnesses;
		this.defendant = defendant;
	}
	
	public void execute(){
		increaseXP();
		askQuestions();
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < defendant.getLawyers().size(); i++) {
				defendant.getLawyers().get(i).askQuestion();
			}
		}
		makeDecision();
	}

	private void makeDecision() {
		int guilty = 0;
		for (int i = 0; i < jury.size(); i++) {
			if(new Random().nextBoolean()){
				guilty++;
			}
		}
		if(guilty > jury.size()/2){
			makeVerdict();
		}
	}

	private void makeVerdict() {
		System.out.println("Lejish bace za " + (new Random().nextInt(37)+3) + " godinki na toplo! ho-ho");
	}

	protected abstract void askQuestions();

	protected void increaseXP() {
		judge.increaseCases();
		for (int i = 0; i < jury.size(); i++) {
			Jury j = jury.get(i);
			j.increaseCases();
		}
	}
	
}
