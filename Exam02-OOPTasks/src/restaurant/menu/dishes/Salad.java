package restaurant.menu.dishes;

import java.util.Random;

import restaurant.menu.IVeganMenu;

public class Salad extends Dish implements IVeganMenu {

    public Salad(String name) {
	super(name);
	this.dishType = "SALAD";
	this.price = 5;
	this.weight = new Random().nextInt(301) + 300;
    }

    @Override
    public boolean isSalad() {
	return true;
    }
}
