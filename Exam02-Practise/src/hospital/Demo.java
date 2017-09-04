package hospital;

import hospital.hospital.Hospital;
import hospital.persons.Doctor;
import hospital.persons.Nurse;
import hospital.persons.Patient;

public class Demo {
    public static void main(String[] args) {
	Hospital hospital = new Hospital();

	for (int i = 0; i < 5; i++) {
	    Doctor doctor = new Doctor("Doctor" + (i + 1), "phone", "department");
	    hospital.add(doctor);
	}

	for (int i = 0; i < 5; i++) {
	    Nurse nurse = new Nurse("Nurse" + (i + 1), "phone", 10);
	    hospital.add(nurse);
	}

	Patient patient1 = new Patient("Patient1", "phone", 10, 'm');
	Patient patient2 = new Patient("Patient2", "phone", 10, 'm');
	Patient patient3 = new Patient("Patient3", "phone", 10, 'm');
	Patient patient4 = new Patient("Patient4", "phone", 10, 'f');
	Patient patient5 = new Patient("Patient5", "phone", 10, 'f');
	Patient patient6 = new Patient("Patient6", "phone", 10, 'f');
	Patient patient7 = new Patient("Patient7", "phone", 10, 'f');
	Patient patient8 = new Patient("Patient8", "phone", 10, 'f');
	Patient patient9 = new Patient("Patient9", "phone", 10, 'f');
	Patient patient10 = new Patient("Patient10", "phone", 10, 'f');

	hospital.enter(patient1);
	hospital.enter(patient2);
	hospital.enter(patient3);
	hospital.enter(patient4);
	hospital.enter(patient5);
	hospital.enter(patient6);
	hospital.enter(patient7);
	hospital.enter(patient8);
	hospital.enter(patient9);
	hospital.enter(patient10);

	// days
	for (int i = 1; i <= 7; i++) {
	    System.out.println("DAY " + i);
	    hospital.healPatients();
	}
    }
}
