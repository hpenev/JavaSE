package hospital_v1.patient;

public class Drug {

    private String name;

    public Drug(String name) {
	if (name != null) {
	    this.name = name;
	}
    }

    public String getName() {
	return this.name;
    }
}
