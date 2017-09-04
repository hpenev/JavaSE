package restaurant.menu.dishes;

import java.util.Random;

public class Dessert extends Dish {

    public Dessert(String name) {
	super(name);
	this.dishType = "Dessert";
	this.price = 4;
	this.weight = new Random().nextInt(101) + 200;
    }

    @Override
    public boolean isDessert() {
	return true;
    }
}
