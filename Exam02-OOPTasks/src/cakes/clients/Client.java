package cakes.clients;

import cakes.sweetShop.CakeShop;
import cakes.sweetShop.Order;

public abstract class Client {

    private String name;
    private String gsmNumber;
    protected double money;
    protected CakeShop shop;
    private Order order;
    protected String address;

    public String getName() {
	return name;
    }

    public String getAddress() {
	return address;
    }

    public Client(String name, String gsmNumber, double money) {
	if (name != null && !name.trim().isEmpty()) {
	    this.name = name;
	} else {
	    this.name = "Agent 007";
	}
	if (gsmNumber != null && !gsmNumber.trim().isEmpty()) {
	    this.gsmNumber = gsmNumber;
	} else {
	    this.gsmNumber = "0888888888";
	}
	if (money > 0) {
	    this.money = money;
	} else {
	    this.money = 1000;
	}
	this.address = "my address";
    }

    public void addShop(CakeShop s) {
	if (s != null) {
	    this.shop = s;
	}
    }

    public abstract void makeOrder();

    public abstract void payBill();

    @Override
    public String toString() {
	return this.name + " - " + this.money;
    }
}
