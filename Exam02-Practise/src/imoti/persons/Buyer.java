package imoti.persons;

import java.util.ArrayList;
import java.util.Random;

import imoti.Agency;
import imoti.View;
import imoti.properties.Property;

public class Buyer extends Client {
    private double money;
    private ArrayList<View> views = new ArrayList<>();
    private Agency agency;

    public ArrayList<View> getViews() {
	return views;
    }

    public Buyer(String name, double money) {
	super(name);
	this.money = money;
    }

    public Property getRandomPropertyFromViews() {
	return views.get(new Random().nextInt(views.size())).getProperty();
    }

    public void declarePurchase(Property property) {
	boolean buyerViewProperty = false;
	for (View view : views) {
	    if (view.getProperty().equals(property)) {
		buyerViewProperty = true;
		break;
	    }
	}

	if (buyerViewProperty) {
	    double agencyCommission = property.getPrice() * 0.03;
	    this.money -= agencyCommission;
	    this.agency.commission(agencyCommission, agent);
	    // property.getSeller().giveCommission(agency, agent);
	}
    }

    public void declareView(Property property) {
	if (property.getPrice() < this.money) {
	    View view = new View(property, this.agent, this, "today");
	    this.views.add(view);
	    this.agent.addView(view);
	} else {
	    System.out.println("Not enougth money");

	}
    }

    public void registrationRequest(Agency agency) {
	this.agent = agency.getAgent();
	this.agent.addBuyer(this);
	this.agency = agency;
    }
}
