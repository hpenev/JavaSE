package imoti_v1.clients;

import imoti_v1.agency.Agency;
import imoti_v1.agency.Agent;
import imoti_v1.properties.Property;

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
