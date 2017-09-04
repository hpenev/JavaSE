package restaurant.menu.dishes;

import java.util.Random;

import restaurant.menu.IBussinesMenu;

public class MainDish extends Dish implements IBussinesMenu {

    public MainDish(String name) {
	super(name);
	this.dishType = "Main Dish";
	this.price = 9;
	this.weight = new Random().nextInt(401) + 400;
    }

    @Override
    public boolean isMainDish() {
	return true;
    }
}
