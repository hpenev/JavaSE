package clients;

import agency.Agency;
import agency.Agent;
import properties.Property;

public abstract class Client {
    protected double money;
    private String name;
    private String phone;
    protected Agent agent;

    public Agent getAgent() {
	return agent;
    }

    public Client(String name, String phone) {
	this.name = name;
	this.phone = phone;
    }

    public void payCommision(Property property, Agency agency) {
	double agencyCommision = property.getPrice() * 0.03;
	this.money -= agencyCommision;
	agency.getCommision(property.getAgent(), agencyCommision);
    }
}
