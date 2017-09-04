package restaurant.clients;

import restaurant.Restorant;
import restaurant.Waiter;

public abstract class Client {

    public enum ClientType {
	STUDENT, BUSINESSMAN, VEGAN
    }

    private String name;
    protected double money;
    protected ClientType clientType;
    protected Restorant restorant;
    protected Waiter waiter;

    public Client(String name) {
	this.name = name;
    }

    public void enter(Restorant restorant) {
	this.restorant = restorant;
    }

    public void makeOrder() {
	if (this.restorant == null) {
	    System.out.println("not in restaurant");
	    return;
	}

	this.waiter = this.restorant.getRandomWaiter();

    }

    public int askBill() {
	return 0;

    }

    public void payBill(int b) {

    }

}
