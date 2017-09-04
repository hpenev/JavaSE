package targovci.peoples.traders;

import targovci.peoples.suppliers.Supplier;
import targovci.shop.IVerigaShop;
import targovci.shop.Store;

public class ChainStoreTraider extends Trader {

    private static final int MAX_SUPPLIERS = 15;
    private static final int MAX_SHOPS = 10;

    public ChainStoreTraider(String name, String address, double money) {
	super(name, address, money);
    }

    public void addSupplier(Supplier supplier) {
	if (this.suppliers.size() < MAX_SUPPLIERS) {
	    this.suppliers.add(supplier);
	} else {
	    System.out.println("suppliers must be less than " + MAX_SUPPLIERS);
	}
    }

    public void addShop(IVerigaShop shop) {
	if (this.shops.size() < MAX_SHOPS) {
	    this.shops.add((Store) shop);
	} else {
	    System.out.println("Shops must be less than " + MAX_SHOPS);
	}
    }

    @Override
    protected boolean isVeriga() {
	return true;
    }
}
