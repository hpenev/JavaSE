package restaurant.clients;

public class Vegan extends Client {

    public Vegan(String name) {
	super(name);
	this.clientType = ClientType.VEGAN;
	this.money = 30;
    }

    @Override
    public void makeOrder() {
	// TODO Auto-generated method stub

    }

}
