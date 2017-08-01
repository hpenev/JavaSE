package sudKrasi.jurists;

public class Judge extends Jurist{

	public Judge(String name, int exp, int cases) {
		super(name, exp > 5 ? exp : 5, cases);
		this.position = "Judge";
	}

	@Override
	protected void askQuestion() {
		System.out.println("Ti mene chuvahs li me kato sudia?");
	}

	@Override
	protected void takeNotes() {
		System.out.println("Toq ne me chuva");
	}

}