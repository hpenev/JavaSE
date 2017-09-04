package cakes.sweetShop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cakes.cakes.Cake;
import cakes.clients.Client;

public class Order {

    private Client client;
    private double price;
    private String adress;
    private ArrayList<Cake> cakes;
    private LocalDateTime deliveryDate;

    public List<Cake> getCakes() {
	return Collections.unmodifiableList(this.cakes);
    }

    public Client getClient() {
	return client;
    }

    public Order(Client client, double price, String adress, ArrayList<Cake> cakes, LocalDateTime deliveryDate) {
	// TODO validate
	this.client = client;
	this.price = price;
	this.adress = adress;
	this.cakes = cakes;
	this.deliveryDate = deliveryDate;
    }

}
