package imoti.persons;

public abstract class Client extends Person {
    protected Agent agent;

    public Client(String name) {
	super(name);
    }
}
