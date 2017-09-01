package imoti_v1.agency;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import imoti_v1.properties.Property;

public class Agency {

    private String name;
    private String address;
    private String phone;
    private HashSet<Agent> agents;
    private ArrayList<Property> catalog;
    private double money;

    public double getMoney() {
	return money;
    }

    public Agency(String name, String address, String phone) {
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.catalog = new ArrayList<>();
	generateAgents();
    }

    private void generateAgents() {
	String[] names = { "Pesho", "Gosho", "Ivan", "Tsvetan", "Rumen", "Pavel", "Vasil", "Teodor" };
	String[] phones = { "0888111222", "0888333444", "0888555666", "0888777888", "0888999000" };
	String name = names[new Random().nextInt(names.length)];
	String phone = phones[new Random().nextInt(phones.length)];
	this.agents = new HashSet<>();
	for (int i = 0; i < 10; i++) {
	    Agent agent = new Agent(name, phone);
	    this.agents.add(agent);
	}
    }

    public void addPropertyToCatalog(Property property) {
	this.catalog.add(property);
    }

    public Agent getRandomAgent() {
	Agent[] agent = agents.toArray(new Agent[agents.size()]);
	return agent[new Random().nextInt(agent.length)];
    }

    public void getCommision(Agent agent, double commision) {
	double agentCommision = 0.5 * commision;
	agent.getCommision(agentCommision);
	this.money = 0.5 * commision;
    }

    public Property getRandomProperty() {
	Property property = this.catalog.get(new Random().nextInt(this.catalog.size()));
	return property;
    }

}
