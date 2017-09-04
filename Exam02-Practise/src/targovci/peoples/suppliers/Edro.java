package targovci.peoples.suppliers;

public class Edro extends Supplier {
    private int discont;

    public Edro(String name, String address, String workingTime, int discont) {
	super(name, address, workingTime);
	this.discont = discont;
    }

    @Override
    public boolean isEdro() {
	return true;
    }

}
