package cakes.sweetShop;

import java.util.LinkedList;
import java.util.Queue;

public class Supplier {

    private String name;
    private String gsmNumber;
    private Queue<Order> orders;

    public void addOrder(Order order) {
	this.orders.offer(order);
    }

    public Supplier(String name, String gsmNumber) {
	if (name != null && !name.trim().isEmpty()) {
	    this.name = name;
	} else {
	    this.name = "Agent 007";
	}
	if (gsmNumber != null && !gsmNumber.trim().isEmpty()) {
	    this.gsmNumber = gsmNumber;
	} else {
	    this.gsmNumber = "0888888888";
	}
	this.orders = new LinkedList<>();
    }

    // v sladkarnicata ne mogat da rabotqt dostavchici s ednakvi imena i gsm.
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((gsmNumber == null) ? 0 : gsmNumber.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Supplier other = (Supplier) obj;
	if (gsmNumber == null) {
	    if (other.gsmNumber != null)
		return false;
	} else if (!gsmNumber.equals(other.gsmNumber))
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return this.name + " - " + this.gsmNumber;
    }

    public void makeDelivery() {
	Order order = this.orders.poll();
	System.out.println("Supplier " + this.name + " makes delivery to " + order.getClient().getName());
    }

}
