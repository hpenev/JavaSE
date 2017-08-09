package imoti.persons;

import java.util.ArrayList;

import imoti.View;

public class Agent extends Person {

    public Agent(String name) {
	super(name);
	this.money = 1000;
    }

    private ArrayList<Buyer> buyers = new ArrayList<>();
    private ArrayList<Seller> sellers = new ArrayList<>();
    private ArrayList<View> views = new ArrayList<>();
    private double money;

    public void getCommission(double money) {
	this.money += money;
    }

    public void addSeller(Seller seller) {
	this.sellers.add(seller);
    }

    public void addBuyer(Buyer buyer) {
	this.buyers.add(buyer);
    }

    public void addView(View view) {
	this.views.add(view);
    }

    @Override
    public String toString() {
	return "Name:" + this.name + " Money:" + this.money;
    }
}
