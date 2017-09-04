package hospital_v1.hospital;

import java.util.ArrayList;
import java.util.HashMap;

import hospital_v1.patient.MedicalPlan;
import hospital_v1.patient.Patient;
import hospital_v1.patient.PatientFile;
import hospital_v1.wardSection.Cardiology;
import hospital_v1.wardSection.Orthopaedy;
import hospital_v1.wardSection.Virology;
import hospital_v1.wardSection.Ward;

public class Hospital {

    private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    private ArrayList<Nurse> nurses = new ArrayList<Nurse>();

    private HashMap<Patient, PatientFile> patientFiles = new HashMap<Patient, PatientFile>();

    Ward orthopaedy;
    Ward cardiology;
    Ward virology;

    public Hospital() {
	this.orthopaedy = new Orthopaedy();
	this.cardiology = new Cardiology();
	this.virology = new Virology();
    }

    public void dayWork() {
	for (Nurse nurse : nurses) {
	    nurse.visitation();
	}
	for (Doctor doctor : doctors) {
	    doctor.visitation();
	}
    }

    public void checkForDischarge() {
	for (Doctor doctor : this.doctors) {
	    for (Patient patient : doctor.getAllPatients()) {
		if (patient.isPatientGoHome()) {

		}
	    }
	}
    }

    public void addPatient(Patient patient, String diagnose, Nurse nurse, byte medicalDays) {
	if (patient != null) {
	    PatientFile file = new PatientFile(patient);
	    this.patientFiles.put(patient, file);

	    if (patient.getWard().getClass().equals(this.orthopaedy.getClass())) {
		patient.setWard(this.orthopaedy);
	    }
	    if (patient.getWard().getClass().equals(this.cardiology.getClass())) {
		patient.setWard(this.cardiology);
	    }
	    if (patient.getWard().getClass().equals(this.virology.getClass())) {
		patient.setWard(this.virology);
	    }
	    patient.getWard().patients.add(patient);

	    patient.setMedicalPlan(new MedicalPlan(diagnose, nurse, medicalDays));

	}
    }

    public void addDoctor(Doctor doctor) {
	this.doctors.add(doctor);
    }

    public void addNurse(Nurse nurse) {

	if (nurse.getWard() instanceof Orthopaedy) {
	    nurse.setWard(this.orthopaedy);
	}
	if (nurse.getWard() instanceof Cardiology) {
	    nurse.setWard(this.cardiology);
	}
	if (nurse.getWard() instanceof Virology) {
	    nurse.setWard(this.virology);
	}
	nurse.getWard().nurses.add(nurse);
    }
}
