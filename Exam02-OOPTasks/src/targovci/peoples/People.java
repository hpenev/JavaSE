package targovci.peoples;

public abstract class People {
    protected String name;
    protected String address;

    public People(String name, String address) {
	this.name = name;
	this.address = address;
    }
}
