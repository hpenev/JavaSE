package imoti.persons;

public abstract class Person {
    protected String name;
    private String phone;

    public String getName() {
	return name;
    }

    public Person(String name) {
	this.name = name;
    }
}
