package targovci.peoples.traders;

import targovci.peoples.suppliers.RetailerSupplier;

public class Retailer extends Trader {

    private static final int MAX_SUPPLIERS = 1;

    public Retailer(String name, String address, double money) {
	super(name, address, money);
    }

    public void addSupplier(RetailerSupplier supplier) {
	if (this.suppliers.size() < MAX_SUPPLIERS) {
	    this.suppliers.add(supplier);
	    System.out.println("Added supplier na drebno");
	} else {
	    System.out.println("only " + MAX_SUPPLIERS + " suppliers allowed");
	}
    }

    @Override
    protected boolean isAmbulant() {
	return true;
    }

}
