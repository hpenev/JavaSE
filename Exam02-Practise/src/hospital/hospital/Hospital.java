package hospital.hospital;

import java.util.ArrayList;
import java.util.Random;

import hospital.departments.Cardiology;
import hospital.departments.Department;
import hospital.departments.Orthopedy;
import hospital.departments.Virology;
import hospital.departments.accommodation.Bed;
import hospital.persons.Doctor;
import hospital.persons.Nurse;
import hospital.persons.Patient;

public class Hospital {

    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Nurse> nurses;
    private ArrayList<Department> departments;

    public ArrayList<Patient> getPatients() {
	return patients;
    }

    public Hospital() {
	this.patients = new ArrayList<>();
	this.doctors = new ArrayList<>();
	this.nurses = new ArrayList<>();
	this.departments = new ArrayList<>();
	departments.add(new Cardiology());
	departments.add(new Orthopedy());
	departments.add(new Virology());
    }

    public void add(Doctor doctor) {
	this.doctors.add(doctor);
    }

    public void add(Nurse nurse) {
	this.nurses.add(nurse);
    }

    public void enter(Patient patient) {
	if (!this.doctors.isEmpty()) {
	    patient.setDoctor(this.doctors.get(0));
	    this.doctors.remove(this.doctors.get(0));

	    patient.setHealingPlan(patient.getDoctor().createHealingPlan());
	    patient.createMedicalRecord();
	    this.patients.add(patient);

	    String diagnose = patient.getHealingPlan().getDiagnose();

	    for (Department department : departments) {

		if (department.getClass().getName().contains(diagnose) && department.haveFreeBeds()) {
		    Bed freeBed = department.getFreeBed();
		    patient.setBed(freeBed);
		    System.out.println(patient.getName() + " e nastanen v " + freeBed.getName()
			    + freeBed.getRoom().getName() + " in " + department.getName());
		}
	    }
	}

    }

    public void healPatients() {

	for (int i = 0; i < this.patients.size(); i++) {
	    if (this.patients.get(i) == null) {
		break;
	    }
	    Patient patient = this.patients.get(i);
	    if (patient.isPatientHealed()) {
		discharge(patient);
		continue;
	    } else {
		patient.getDoctor().makeVisitation(patient);
		patient.heal();
		nurses.get(new Random().nextInt(nurses.size())).givePillTo(patient);
	    }

	}
    }

    private void discharge(Patient patient) {
	this.doctors.add(patient.getDoctor());
	System.out.println("Patient is in good condition. Good Buy!");
	patient.getBed().setFree(true);
	this.patients.remove(patient);

    }
}
