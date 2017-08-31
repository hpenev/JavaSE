package clients;

import agency.Agency;
import properties.Property;

public class Seller extends Client {
    private Property property;

    public Seller(String name, String phone, Property property) {
	super(name, phone);
	this.property = property;
    }

    public void registerProperty(Agency agency) {
	agency.addPropertyToCatalog(this.property);
	this.agent = agency.getRandomAgent();
	this.agent.addSeller(this);
	this.property.setAgent(this.agent);
    }

    public Property getProperty() {
	return property;
    }
}
