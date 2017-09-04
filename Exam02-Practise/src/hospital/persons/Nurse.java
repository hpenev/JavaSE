package hospital.persons;

public class Nurse extends Person {

    private int yearsExperience;

    public Nurse(String name, String phone, int yearsExperience) {
	super(name, phone);
	this.yearsExperience = yearsExperience;
    }

    public int givePills(int pills) {
	pills--;
	return pills;
    }

    public void givePillTo(Patient patient) {
	patient.getHealingPlan().getOnePill();
    }
}
