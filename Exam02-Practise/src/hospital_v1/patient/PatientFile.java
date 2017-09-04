package hospital_v1.patient;

public class PatientFile {

    private String name;
    private int age;
    private String number;

    private Patient patient;

    public PatientFile(Patient patient) {
	this.name = patient.getName();
	this.age = patient.getAge();
	this.number = patient.getNumber();
    }

}
