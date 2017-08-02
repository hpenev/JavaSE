package hospital.persons;

import hospital.MedicalRecord;

public class Patient extends Person {
    private MedicalRecord medicalRecord;
    private int years;
    private Doctor doctor;

    public void createMedicalRecord() {
	MedicalRecord mr = new MedicalRecord(this.name, this.years, this.phone);
	this.medicalRecord = mr;
    }
}
