package hospital.persons;

public class Person {

    protected String name;
    protected String phone;

    public Person(String name, String phone) {
	this.name = name;
	this.phone = phone;
    }

    public String getName() {
	return name;
    }
}
