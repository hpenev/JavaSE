package hospital;

import java.util.ArrayList;

import hospital.persons.Doctor;
import hospital.persons.Nurse;
import hospital.persons.Patient;

public class Hospital {

    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Nurse> nurses;

    void enter(Patient patient) {
	patient.createMedicalRecord();

	this.patients.add(patient);
    }
}
