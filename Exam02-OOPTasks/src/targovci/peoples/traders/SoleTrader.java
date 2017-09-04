package targovci.peoples.traders;

import targovci.peoples.suppliers.RetailerSupplier;
import targovci.shop.ISoleTraderShop;
import targovci.shop.Store;

public class SoleTrader extends Trader {

    // ednolichen targovec
    private static final int MAX_SUPPLIERS = 5;
    private static final int MAX_SHOPS = 1;

    public SoleTrader(String name, String address, double money) {
	super(name, address, money);
    }

    public void addShop(ISoleTraderShop shop) {
	if (this.shops.size() < MAX_SHOPS) {
	    // TODO is this cast OK?
	    this.shops.add((Store) shop);
	    System.out.println("Shop added");
	} else {
	    System.out.println("only " + MAX_SHOPS + " shop allowed");
	}
    }

    public void addSupplier(RetailerSupplier supplier) {
	if (this.suppliers.size() < MAX_SUPPLIERS) {
	    this.suppliers.add(supplier);
	    System.out.println("Added supplier na drebno");
	} else {
	    System.out.println("only " + MAX_SUPPLIERS + " supplier allowed");
	}
    }

    @Override
    protected boolean isEdnolichen() {
	return true;
    }
}
