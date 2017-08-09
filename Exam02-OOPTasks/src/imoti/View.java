package imoti;

import imoti.persons.Agent;
import imoti.persons.Buyer;
import imoti.properties.Property;

public class View {
    private Property property;
    private Agent agent;
    private Buyer buyer;
    private String date;

    public View(Property property, Agent agent, Buyer buyer, String date) {
	this.property = property;
	this.agent = agent;
	this.buyer = buyer;
	this.date = date;
    }

    public Property getProperty() {
	return property;
    }

}
