package targovci.peoples.traders;

import java.util.HashSet;

import targovci.peoples.People;
import targovci.peoples.suppliers.Supplier;
import targovci.shop.Store;

public abstract class Trader extends People {
    protected double money;
    protected HashSet<Store> shops;
    protected HashSet<Supplier> suppliers;

    public Trader(String name, String address, double money) {
	super(name, address);
	this.money = money;
	this.suppliers = new HashSet<>();
	this.shops = new HashSet<>();
    }

    protected boolean isAmbulant() {
	return false;
    }

    protected boolean isEdnolichen() {
	return false;
    }

    protected boolean isVeriga() {
	return false;
    }

    public void makeOrder() {
	Supplier supplier = this.suppliers.iterator().next();

    }
}
