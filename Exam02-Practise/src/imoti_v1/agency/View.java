package imoti_v1.agency;

import java.time.LocalDate;

import imoti_v1.clients.Buyer;
import imoti_v1.properties.Property;

public class View {
    private Property property;
    private Agent agent;
    private Buyer buyer;
    private LocalDate date;

    public Property getProperty() {
	return property;
    }

    public View(Property property, Agent agent, Buyer buyer, LocalDate date) {
	this.property = property;
	this.agent = agent;
	this.buyer = buyer;
	this.date = date;
    }

}
