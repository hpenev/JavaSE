package agency;

import java.time.LocalDate;

import clients.Buyer;
import properties.Property;

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
