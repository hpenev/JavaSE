package targovci.peoples.suppliers;

public class RetailerSupplier extends Supplier {

    public RetailerSupplier(String name, String address, String workingTime) {
	super(name, address, workingTime);
    }

    @Override
    public boolean isRetailerSupplier() {
	return true;
    }
}
