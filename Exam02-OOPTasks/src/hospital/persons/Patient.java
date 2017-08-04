package hospital.persons;

import hospital.departments.accommodation.Bed;
import hospital.hospital.MedicalRecord;

public class Patient extends Person {
    private MedicalRecord medicalRecord;
    private int years;
    private Doctor doctor;
    private char sex;
    private HealingPlan healingPlan;
    private Bed bed;

    public Bed getBed() {
	return bed;
    }

    public void setBed(Bed bed) {
	this.bed = bed;
	this.bed.setFree(false);
    }

    public void setHealingPlan(HealingPlan healingPlan) {
	this.healingPlan = healingPlan;
    }

    public HealingPlan getHealingPlan() {
	return healingPlan;
    }

    public char getSex() {
	return sex;
    }

    public Doctor getDoctor() {
	return doctor;
    }

    public Patient(String name, String phone, int years, char sex) {
	super(name, phone);
	this.years = years;
	this.sex = sex;
    }

    public void createMedicalRecord() {
	MedicalRecord mr = new MedicalRecord(this.name, this.years, this.phone);
	this.medicalRecord = mr;
    }

    public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
    }

    public void heal() {
	healingPlan.decreaceDays();
    }

    public boolean isPatientHealed() {
	return healingPlan.isCompleted();
    }

}
