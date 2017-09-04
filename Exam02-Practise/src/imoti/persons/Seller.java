package imoti.persons;

import java.util.Random;

import imoti.Agency;
import imoti.properties.Apartment;
import imoti.properties.House;
import imoti.properties.Parcel;
import imoti.properties.Property;

public class Seller extends Client {
    private Property property;

    public Seller(String name) {
	super(name);
	this.property = generateRandomProperty();
    }

    private Property generateRandomProperty() {
	int temp = new Random().nextInt(3);
	Property property = null;
	switch (temp) {
	case 0:
	    property = new House("house description", new Random().nextInt(30_000) + 50_000.00);
	    break;
	case 1:
	    property = new Apartment("apartment description", new Random().nextInt(80_000) + 70_000.00);
	    break;
	case 2:
	    property = new Parcel("apartment description", new Random().nextInt(55_000) + 30_000.00, true);
	    break;
	}
	return property;
    }

    public void giveCommission(Agency agency, Agent agent) {
	double commission = this.property.getPrice() * 0.03;
	agency.commission(commission, agent);
    }

    public void registerProperty(Agency agency) {
	agency.addPropertyForSale(property);
	this.agent = agency.getAgent();
	this.agent.addSeller(this);
    }
}
