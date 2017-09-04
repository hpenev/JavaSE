package restaurant.menu.drinks;

import restaurant.menu.IBussinesMenu;

public class Alcohol extends Drink implements IBussinesMenu {

    public Alcohol(String name) {
	super(name);
	this.drinkType = "ALCOHOL";
	this.price = 4;
    }

    @Override
    public boolean isAlcohol() {
	return true;
    }
}
