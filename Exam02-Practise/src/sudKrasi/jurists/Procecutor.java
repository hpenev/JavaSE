package sudKrasi.jurists;

import sudKrasi.IAccuser;

public class Procecutor extends Jurist implements IAccuser{

	public Procecutor(String name, int exp, int cases) {
		super(name, exp > 10 ? exp : 10, cases);
		this.position = "Procecutor";
	}

	@Override
	public void askQuestion() {
		System.out.println("Ti mene vijdash li me kato prokuror?");
	}

	@Override
	protected void takeNotes() {
		System.out.println("Toq ne me vijda");
	}

}