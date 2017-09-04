package imoti;

import java.util.ArrayList;
import java.util.Random;

import imoti.persons.Agent;
import imoti.properties.Property;

public class Agency {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Agent> agents = new ArrayList<>();
    private ArrayList<Property> properties = new ArrayList<>();
    private double money;

    public ArrayList<Agent> getAgents() {
	return agents;
    }

    public Agency(double money) {
	this.agents = createRandomAgents(5);
	this.money = money;
    }

    public double getMoney() {
	return money;
    }

    private ArrayList<Agent> createRandomAgents(int n) {
	ArrayList<Agent> agents = new ArrayList<>();

	for (int i = 1; i <= n; i++) {
	    Agent agent = new Agent("Agent" + i);
	    agents.add(agent);
	}

	return agents;
    }

    public void addPropertyForSale(Property property) {
	properties.add(property);
    }

    public Agent getAgent() {
	return agents.get(new Random().nextInt(agents.size()));
    }

    public void commission(double commission, Agent agent) {
	this.money += commission / 2;
	agent.getCommission(commission / 2);
    }

    public Property getRandomProperty() {
	return this.properties.get(new Random().nextInt(this.properties.size()));
    }
}
