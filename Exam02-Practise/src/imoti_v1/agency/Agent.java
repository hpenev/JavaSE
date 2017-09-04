package imoti_v1.agency;

import java.util.ArrayList;
import java.util.HashSet;

import imoti_v1.clients.Buyer;
import imoti_v1.clients.Seller;
import imoti_v1.properties.Property;

public class Agent {
    private String name;
    private String phone;
    private HashSet<Buyer> buyers;
    private HashSet<Seller> sellers;
    private ArrayList<View> views;
    private double money;

    public Agent(String name, String phone) {
	this.name = name;
	this.phone = phone;
	this.buyers = new HashSet<>();
	this.sellers = new HashSet<>();
	this.views = new ArrayList<>();
    }

    public void addBuyer(Buyer buyer) {
	this.buyers.add(buyer);
    }

    public void addSeller(Seller seller) {
	this.sellers.add(seller);
    }

    public void addView(View view) {
	this.views.add(view);
    }

    public void getCommision(double agentCommision) {
	this.money += agentCommision;

    }

    public Seller getSeller(Property property) {
	for (Seller seller : sellers) {
	    if (seller.getProperty().equals(property)) {
		return seller;
	    }
	}
	return null;
    }

}
