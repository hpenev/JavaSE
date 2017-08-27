package cakes.clients;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import cakes.cakes.Cake;
import cakes.cakes.Cake.CakeKind;
import cakes.cakes.Cake.ICakeType;
import cakes.sweetShop.Order;

public class CoorporateClient extends Client {

    private int discount;

    public CoorporateClient(String name, String gsmNumber, double money) {
	super(name, gsmNumber, money);
	this.discount = 10;
    }

    @Override
    public void makeOrder() {
	ArrayList<Cake> cakes = new ArrayList<>();
	double bill = 0;
	for (int i = 0; i < new Random().nextInt(3) + 3; i++) {
	    CakeKind kind = CakeKind.values()[new Random().nextInt(CakeKind.values().length)];
	    if (this.shop.containsKind(kind)) {
		Set<ICakeType> allTypes = this.shop.viewKind(kind);
		ICakeType type = null;

		int size = allTypes.size();
		int item = new Random().nextInt(size);
		int idx = 0;
		for (ICakeType cakeType : allTypes) {
		    if (idx == item)
			type = cakeType;
		    idx++;
		}

		cakes.add(this.shop.getCake(kind, type));
	    }
	}

	for (Cake cake : cakes) {
	    bill += cake.getPrice();
	}
	bill = bill / (1 + (discount / 100));
	if (this.money > bill) {
	    this.money -= bill;
	} else {
	    System.out.println("Not enought money");
	    return;
	}

	Order order = new Order(this, bill, this.getAddress(), cakes, LocalDateTime.now().plusDays(1));
	this.shop.takeOrder(order);
    }

    @Override
    public void payBill() {
	// TODO Auto-generated method stub

    }

}
