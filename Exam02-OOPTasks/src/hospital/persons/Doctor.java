package hospital.persons;

import java.util.Random;

public class Doctor extends Person {

    private String department;

    public Doctor(String name, String phone, String department) {
	super(name, phone);
	this.department = department;
    }

    public static String[] diagnoses = { "Ortho", "Cardio", "Viro" };

    public HealingPlan createHealingPlan() {
	int pills = pillsRecept();
	int daysInHospital = daysHealing();
	HealingPlan healingPlan = new HealingPlan(getRandomDiagnose(), pills, daysInHospital);
	return healingPlan;
    }

    private String getRandomDiagnose() {
	return diagnoses[new Random().nextInt(diagnoses.length)];
    }

    private int pillsRecept() {
	return new Random().nextInt(50) + 20;
    }

    private int daysHealing() {
	return new Random().nextInt(3) + 3;
    }

    public void makeVisitation(Patient patient) {
	System.out.println(this.name + " visit the " + patient.getName());
    }
}
