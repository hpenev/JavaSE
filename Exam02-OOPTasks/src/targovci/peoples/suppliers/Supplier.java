package targovci.peoples.suppliers;

import targovci.peoples.People;

public abstract class Supplier extends People {

    protected String workingTime;

    public Supplier(String name, String address, String workingTime) {
	super(name, address);
	this.workingTime = workingTime;
    }

    public boolean isEdro() {
	return false;
    }

    public boolean isRetailerSupplier() {
	return false;
    }

}
