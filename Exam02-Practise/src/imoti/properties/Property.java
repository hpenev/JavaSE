package imoti.properties;

import imoti.persons.Agent;
import imoti.persons.Seller;

public abstract class Property {
    private String description;
    private String adress;
    private double price;
    private double area;
    private Agent agent;
    private Seller seller;

    public Property(String description, double price) {
	this.description = description;
	this.price = price;
    }

    public Seller getSeller() {
	return seller;
    }

    public double getPrice() {
	return price;
    }
}
