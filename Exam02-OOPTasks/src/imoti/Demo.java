package imoti;

import java.util.ArrayList;
import java.util.Random;

import imoti.persons.Agent;
import imoti.persons.Buyer;
import imoti.persons.Seller;

public class Demo {
    public static void main(String[] args) {
	Agency agency = new Agency(1_000_000);

	ArrayList<Seller> sellers = new ArrayList<>();
	for (int i = 1; i <= 30; i++) {
	    Seller seller = new Seller("Seller" + i);
	    seller.registerProperty(agency);
	    sellers.add(seller);
	}

	ArrayList<Buyer> buyers = new ArrayList<>();
	for (int i = 1; i <= 10; i++) {
	    Buyer buyer = new Buyer("Buyer" + i, new Random().nextInt(120_000) + 30_000);
	    buyers.add(buyer);
	    buyer.registrationRequest(agency);

	    buyer.declareView(agency.getRandomProperty());
	    buyer.declareView(agency.getRandomProperty());
	    buyer.declareView(agency.getRandomProperty());
	    if (buyer.getViews().size() != 0) {
		buyer.declarePurchase(buyer.getRandomPropertyFromViews());
	    } else {
		System.out.println(buyer.getName() + " cannot buy nothing");
	    }
	}

	System.out.println(agency.getMoney());
	for (Agent agent : agency.getAgents()) {
	    System.out.println(agent);
	}
    }
}
