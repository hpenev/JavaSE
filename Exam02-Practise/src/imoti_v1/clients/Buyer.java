package imoti_v1.clients;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;

import imoti_v1.agency.Agency;
import imoti_v1.agency.View;
import imoti_v1.properties.Property;

public class Buyer extends Client {

    private HashSet<View> views;

    public Buyer(String name, String phone, double money) {
	super(name, phone);
	this.views = new HashSet<>();
	this.money = money;
    }

    public void searchProperty(Agency agency) {
	this.agent = agency.getRandomAgent();
	this.agent.addBuyer(this);
    }

    public void askView(Property property) {
	if (property == null) {
	    System.out.println("NULL PROPERTY");
	}
	if (this.money >= property.getPrice()) {
	    View view = new View(property, this.agent, this, LocalDate.now());
	    this.views.add(view);
	    this.agent.addView(view);
	} else {
	    System.out.println("Not enougth money for this property");
	}

    }

    public void wannaBuy(Property property, Agency agency) {
	boolean hasView = false;

	for (View view : views) {
	    if (view.getProperty().equals(property)) {
		hasView = true;
		break;
	    }
	}

	if (hasView) {
	    Seller seller = this.agent.getSeller(property);
	    this.payCommision(property, agency);
	    seller.payCommision(property, agency);
	}
    }

    public Property getRandomProperty() {
	View view = (View) views.toArray()[new Random().nextInt(views.toArray().length)];
	return view.getProperty();

    }

}
