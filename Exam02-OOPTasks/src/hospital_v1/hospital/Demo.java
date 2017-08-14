package hospital_v1.hospital;

import hospital_v1.patient.Drug;
import hospital_v1.patient.Patient;
import hospital_v1.wardSection.Cardiology;
import hospital_v1.wardSection.Virology;

public class Demo {

    public static void main(String[] args) {

	Hospital mbal = new Hospital();

	Doctor doc1 = new Doctor("Doctor", 50, "0891231234", Gender.Female);
	mbal.addDoctor(doc1);

	Nurse donka = new Nurse("Donka Georgieva", 70, "0876424212", Gender.Female, 45, mbal.cardiology);
	Nurse katka = new Nurse("Katka Grozdova", 70, "0876989310", Gender.Female, 32, mbal.cardiology);
	mbal.addNurse(donka);
	mbal.addNurse(katka);

	mbal.addPatient(new Patient("Todor Georgiev", 15, "0898871007", Gender.Male, doc1, new Cardiology()),
		"Visoko kruvno", donka, (byte) 4);
	mbal.addPatient(new Patient("Boyan Penchev", 15, "0898432123", Gender.Male, doc1, new Virology()),
		"Visoko kruvno", donka, (byte) 4);
	mbal.addPatient(new Patient("Pesho Peshov", 15, "0898871007", Gender.Male, doc1, new Cardiology()),
		"Visoko kruvno", donka, (byte) 4);

	mbal.cardiology.patients.get(0).getMedicalPlan().addDrug(new Drug("Aspirin"));
	mbal.cardiology.patients.get(0).getMedicalPlan().addDrug(new Drug("Benalgin"));
	mbal.cardiology.patients.get(1).getMedicalPlan().addDrug(new Drug("Vitamin C"));
	mbal.cardiology.patients.get(1).getMedicalPlan().addDrug(new Drug("Vitamin D"));

	mbal.dayWork();
    }
}
