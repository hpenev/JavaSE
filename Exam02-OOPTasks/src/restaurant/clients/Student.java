package restaurant.clients;

import restaurant.Waiter;

public class Student extends Client {

    public Student(String name) {
	super(name);
	this.clientType = ClientType.STUDENT;
	this.money = 10;
    }

    @Override
    public void makeOrder() {
	Waiter waiter = this.restorant.getRandomWaiter();

    }

}
